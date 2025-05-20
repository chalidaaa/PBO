package week8;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        boolean jalan = true;

        while (jalan) {
            System.out.println("\n=== Menu Menghitung Luas Bangun Datar ===");
            System.out.println("1. Persegi");
            System.out.println("2. Persegi Panjang");
            System.out.println("3. Segitiga");
            System.out.println("4. Lingkaran");
            System.out.println("5. Keluar");
            System.out.print("Pilih menu: ");
            int pilihan = scanner.nextInt();

            switch (pilihan) {
                case 1: // Persegi
                    System.out.print("Masukkan sisi persegi: ");
                    int sisi = scanner.nextInt();
                    BangunDatar persegi = new BangunDatar(sisi);
                    persegi.luas(persegi);
                    System.out.println("Luas Persegi: " + persegi.luas);
                    break;

                case 2: // Persegi Panjang
                    System.out.print("Masukkan panjang: ");
                    int panjang = scanner.nextInt();
                    System.out.print("Masukkan lebar: ");
                    int lebar = scanner.nextInt();
                    BangunDatar persegiPanjang = new BangunDatar(panjang, lebar);
                    persegiPanjang.luas(persegiPanjang);
                    System.out.println("Luas Persegi Panjang: " + persegiPanjang.luas);
                    break;

                case 3: // Segitiga
                    System.out.print("Masukkan alas: ");
                    double alas = scanner.nextDouble();
                    System.out.print("Masukkan tinggi: ");
                    double tinggi = scanner.nextDouble();
                    BangunDatar segitiga = new BangunDatar(alas, tinggi);
                    segitiga.luas(segitiga);
                    System.out.println("Luas Segitiga: " + segitiga.luas2);
                    break;

                case 4: // Lingkaran
                    System.out.print("Masukkan jari-jari: ");
                    double radius = scanner.nextDouble();
                    BangunDatar lingkaran = new BangunDatar(radius);
                    lingkaran.luas(lingkaran);
                    System.out.println("Luas Lingkaran: " + lingkaran.luas2);
                    break;

                case 5: // Keluar
                    jalan = false;
                    System.out.println("Terima kasih telah menggunakan program kami!");
                    break;

                default:
                    System.out.println("Pilihan tidak valid. Silakan coba lagi.");
            }
        }

        scanner.close();
    }
}
