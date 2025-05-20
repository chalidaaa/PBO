import character.Character;
import enemy.Enemy;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Character player = new Character(100, 30, 10);
        Enemy enemy = new Enemy(70, 25, 8);
        Scanner scanner = new Scanner(System.in);

        System.out.println("Pertarungan dimulai!");
        for (int i = 1; i <= 3; i++) {
            System.out.println("\n--- Giliran " + i + " ---");
            System.out.println("1. Player bertahan");
            System.out.println("2. Player minum potion");
            System.out.print("Pilih aksi: ");
            int aksi = scanner.nextInt();

            if (aksi == 1) {
                player.defend();
            } else if (aksi == 2) {
                player.drinkPotion();
            } else {
                System.out.println("Aksi tidak dikenali.");
            }

            System.out.println("\nEnemy menyerang!");
            enemy.attack(player);

            System.out.println("HP Player: " + player.getHp());
            System.out.println("HP Enemy: " + enemy.getHp());
        }

        System.out.println("\n--- Pertarungan Selesai ---");
        System.out.println("HP Akhir Player: " + player.getHp());
        System.out.println("HP Akhir Enemy: " + enemy.getHp());
    }
}
