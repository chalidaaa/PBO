package week5;

import java.util.Scanner;

public class Latihan1 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        
        // Meminta input jumlah data dari user
        System.out.print("Jumlah Data : ");
        int jumlahData = input.nextInt();
        
        // Deklarasi array dengan ukuran sesuai input user
        int[] nilai = new int[jumlahData];
        
        // Memasukkan data ke array
        for(int i = 0; i < nilai.length; i++) {
            System.out.print("Data ke - " + (i+1) + " = ");
            nilai[i] = input.nextInt();
        }
        
        // Menampilkan hasil array
        System.out.println(); // Baris kosong untuk pemisah
        for(int i = 0; i < nilai.length; i++) {
            System.out.println("Hasil nilai[" + i + "]=" + nilai[i]);
        }
        
        input.close(); // Menutup scanner
    }
}