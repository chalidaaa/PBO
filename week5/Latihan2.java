package week5;
import java.util.Scanner;

class Nilai {
    String nama;
    double nilai;

    // Constructor
    public Nilai(String nama, double nilai) {
        this.nama = nama;
        this.nilai = nilai;
    }
}

public class Latihan2 {
    static Nilai[] daftarNilai;
    static Scanner input = new Scanner(System.in);

    public static void main(String[] args) {
        System.out.print("Masukkan jumlah data nilai: ");
        int jumlahData = input.nextInt();
        input.nextLine(); // Membersihkan newline
        
        // Inisialisasi array of objects
        daftarNilai = new Nilai[jumlahData];
        
        // Memasukkan data
        for (int i = 0; i < jumlahData; i++) {
            System.out.println("\nData ke-" + (i + 1));
            System.out.print("Nama Mahasiswa: ");
            String nama = input.nextLine();
            
            System.out.print("Nilai: ");
            double nilai = input.nextDouble();
            input.nextLine(); // Membersihkan newline
            
            daftarNilai[i] = new Nilai(nama, nilai);
        }
        
        // Menampilkan daftar nilai
        daftarNilai();
    }

    // Method untuk menampilkan daftar nilai
    public static void daftarNilai() {
        System.out.println("\n===== DAFTAR NILAI =====");
        System.out.println("No.\tNama\t\tNilai");
        System.out.println("-----------------------------");
        
        for (int i = 0; i < daftarNilai.length; i++) {
            System.out.printf("%d\t%s\t\t%.2f\n", 
                            (i + 1), 
                            daftarNilai[i].nama, 
                            daftarNilai[i].nilai);
        }
    }
}