package week1;
import java.util.Scanner;

public class Tugas2 {
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);
        System.out.print("\nMasukkan panjang sisi: ");
        float panjangSisi = input.nextFloat();

        // RUMUS PERSEGI
        float lPesergi = panjangSisi * panjangSisi;
        float kPesergi = 4 * panjangSisi;

        // RUMUS SEGITIGA
        float lSegitiga = (float) (0.5 * panjangSisi * panjangSisi); 
        float kSegitiga = 3 * panjangSisi;

        // RUMUS LINGKARAN
        float phi = 3.14f;
        float luasLingkaran = phi * panjangSisi * panjangSisi;
        float kelilingLingkaran = phi * (2 * panjangSisi);

        // RUMUS KUBUS
        float vKubus = panjangSisi * panjangSisi * panjangSisi;
        float lpKubus = 6 * (panjangSisi * panjangSisi);

        // Output Hasil Perhitungan
        System.out.println("\n=== Hasil Perhitungan Luas dan Keliling ===");
        System.out.println("Luas Persegi         : " + lPesergi);
        System.out.println("Keliling Persegi     : " + kPesergi);
        System.out.println("Luas Segitiga        : " + lSegitiga);
        System.out.println("Keliling Segitiga    : " + kSegitiga);
        System.out.println("Luas Lingkaran       : " + luasLingkaran);
        System.out.println("Keliling Lingkaran   : " + kelilingLingkaran);
        System.out.println("Volume Kubus         : " + vKubus);
        System.out.println("Luas Permukaan Kubus : " + lpKubus);
    }
}
