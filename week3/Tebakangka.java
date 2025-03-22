package week3;
import java.util.Random;
import java.util.Scanner;

class Tebakangka {
    public static void main(String[] aaa) {
        Scanner s = new Scanner(System.in);
        Random r = new Random();
        
        System.out.println("========================");
        System.out.println("      TEBAK ANGKA       ");
        System.out.println("========================");

        int angka = r.nextInt(100) + 1; // Range angka 1-100
        int tebakan;
        
        do {
            System.out.print("Masukkan angka: ");
            tebakan = s.nextInt();

            if (tebakan == angka) {
                System.out.println("Selamat! Tebakan Anda benar.");
                break; // Keluar dari loop jika tebakan benar
            } else if (tebakan < angka) {
                System.out.println("Tebakan terlalu kecil, coba lagi!");
            } else {
                System.out.println("Tebakan terlalu besar, coba lagi!");
            }
        } while (true); // Loop terus sampai tebakan randomnya benar
        
        s.close(); 
    }
}