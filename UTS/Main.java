package UTS;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        boolean playAgain = true;

        while (playAgain) {
            Character player = new Character(100, 20, 5);
            Enemy enemy = new Enemy(150, 15, 3);

            System.out.println("Selamat datang di Text RPG!");
            System.out.println("HP Character: " + player.hp + " | HP Enemy: " + enemy.hp);

            while (player.isAlive() && enemy.isAlive()) {
                System.out.println("\nPilih aksi:");
                System.out.println("1. Serang");
                System.out.println("2. Bertahan");
                System.out.println("3. Minum Ramuan (sisa: " + player.potions + ")");
                System.out.println("4. Keluar");
                System.out.print("> ");
                int choice = scanner.nextInt();

                if (choice == 1) {
                    player.attack(enemy);
                    if (enemy.isAlive()) {
                        enemy.attack(player);
                    }
                    System.out.println("HP Character: " + player.hp + " | HP Enemy: " + enemy.hp);
                } else if (choice == 2) {
                    player.defend();
                    enemy.attack(player);
                } else if (choice == 3) {
                    player.drinkPotion();
                } else if (choice == 4) {
                    System.out.println("Keluar dari permainan.");
                    System.exit(0);
                } else {
                    System.out.println("Pilihan tidak valid.");
                }
            }

            if (!player.isAlive()) {
                System.out.println("Game Over, mulai lagi? (y/n)");
                String again = scanner.next();
                if (again.equalsIgnoreCase("y")) {
                    playAgain = true;
                } else {
                    playAgain = false;
                    System.out.println("Terima kasih sudah bermain!");
                }
            } else {
                System.out.println("Selamat! Kamu mengalahkan musuh!");
                playAgain = false;
            }
        }

        scanner.close();
    }
}
