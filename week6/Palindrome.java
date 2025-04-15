package week6;
import java.util.Scanner;

public class Palindrome {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        // Meminta input dari user
        System.out.print("Masukkan kata: ");
        String input = scanner.nextLine();
        
        // Menampilkan hasil using TextGame
        TextGame game1 = new TextGame();
        game1.displayResult(input);
        System.out.println();

        // Menampilkan hasil using FancyTextGame
        TextGame game2 = new FancyTextGame();
        game2.displayResult(input);

        scanner.close();
    }
}