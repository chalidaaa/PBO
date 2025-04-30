import character.Character;
import enemy.Enemy;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        boolean playAgain = true;

        Character player = new Character("Chalida", 100, 20, 15);
        Enemy enemy = new Enemy("Fidha", 150, 20, 15);

        while (playAgain) {
            System.out.println("Selamat datang di Text RPG!");
            System.out.println("Hero -> Nama: " + player.getName() + " | HP: " + player.getHp() + " | Ramuan: " + player.getPotions());
            System.out.println("Enemy -> Nama: " + enemy.getName() + " | HP: " + enemy.getHp());

            while (player.isAlive() && enemy.isAlive()) {
                System.out.println("\nPilih aksi:");
                System.out.println("1. Serang");
                System.out.println("2. Bertahan");
                System.out.println("3. Minum Ramuan (sisa: " + player.getPotions() + ")");
                System.out.println("4. Keluar");
                System.out.print("> ");
                int choice = scanner.nextInt();

                if (choice == 1) {
                    player.attack(20);
                    enemy.defend(25);
                    System.out.println("HP Character: " + player.getHp() + " | HP Enemy: " + enemy.getHp());

                    if(enemy.getHp() < 30){
                    enemy.minum();
                    System.out.println("Enemy minum ramuan! HP bertambah 20.");
                    System.out.println("HP Character: " + player.getHp() + " | HP Enemy: " + enemy.getHp());
                }

                } else if (choice == 2) {
                    player.defend(5);
                    enemy.attack(20);
                    System.out.println("HP Character: " + player.getHp() + " | HP Enemy: " + enemy.getHp());

                } else if (choice == 3) {
                    player.drinkPotion();
                    System.out.println("HP Character: " + player.getHp() + " | HP Enemy: " + enemy.getHp());

                } else if (choice == 4) {
                    System.out.println("Keluar dari permainan.");
                    System.exit(0);
                } else {
                    System.out.println("Pilihan tidak valid.");
                }
            }

            if(enemy.getHp() < 30){
                enemy.minum();
                System.out.println("Enemy minum ramuan! HP bertambah 20.");
                System.out.println("HP Enemy: " + enemy.getHp() + " | HP Character: " + player.getHp());
            }

            //kalau hp hero = 0
            if (!player.isAlive()) {
                System.out.println("\n=== Game Over ===");
                playAgain = false;
            }

            //kalau hp enemy = 0
            if (enemy.getHp() <= 0) {
                System.out.println("\nSelamat! Musuh telah dikalahkan!");
                playAgain = false;
            }

            //ini buat ngecek kalau permainan berhenti ditanya nih, mau main lagi ga
            if (playAgain == false){
                System.out.print("Mau mulai lagi? (y/n): ");
                String restart = scanner.next();
                if (restart.equalsIgnoreCase("y")) {
                    player = new Character("Chalida", 100, 20, 15);
                    enemy = new Enemy("Fidha", 150, 20, 15);
                    playAgain = true;
                } else {
                    System.out.println("Terima kasih telah bermain!");
                }
            }
        }
        scanner.close();
    }
}
