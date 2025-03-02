package week1;

public class PraktikumMandiri {
    public static void main(String[] args) {
            
        // LATIHAN NO. 1
        String Nama = "Chalida Abdat";
        System.out.println("\nHalo, nama saya adalah " + Nama);
        System.out.println("Saya adalah mahasiswa Teknik Informatika Universitas Dian Nuswantoro");    
        System.out.println("Saya sedang menulis program Java");    

        // LATIHAN NO. 2
        System.out.println("\n========= Kalkulator Mini Perhitungan Luas, Keliling & Volume =========");

        // SOAL NO.2 (A)
        int diameter = 10;
        float phi = 3.14f;
        float kLingkaran = phi * diameter;
        System.out.println("a. Hasil keliling lingkaran dengan diameter " 
        + diameter + " adalah = " + kLingkaran);

        // SOAL NO.2 (B)
        int alas = 6;
        int tinggi = 8;
        float lSegitiga = 0.5f * alas * tinggi; 
        System.out.println("b. Hasil luas segitiga siku-siku dengan alas " 
        + alas + " dan tinggi " + tinggi + " adalah = " + lSegitiga);

        // SOAL NO.2 (C)    
        diameter = 5;
        tinggi = 10;
        float r = diameter / 2.0f; 
        float vTabung = (phi * r * r) * tinggi;
        System.out.println("c. Hasil volume tabung dengan diameter " 
        + diameter + " dan tinggi " + tinggi + " adalah = " + vTabung);
    }
}
