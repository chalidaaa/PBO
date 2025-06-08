
package week10;

import java.util.Scanner;

public class CellphoneMain {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Cellphone hp = new Cellphone();
        int pilih;

        do {
            System.out.println("\n=== MENU ===");
            System.out.println("1. Tambah Kontak");
            System.out.println("2. Hapus Kontak");
            System.out.println("3. Lihat Kontak");
            System.out.println("4. Cari Kontak");
            System.out.println("5. Tambah Pulsa");
            System.out.println("6. Telepon");
            System.out.println("7. Beli Paket");
            System.out.println("0. Keluar");
            System.out.print("Pilih: ");
            pilih = sc.nextInt();
            sc.nextLine();

            try {
                switch (pilih) {
                    case 1 -> {
                        System.out.print("Masukkan nama: ");
                        String nama = sc.nextLine();
                        System.out.print("Masukkan nomor: ");
                        String nomor = sc.nextLine();
                        hp.tambahKontak(new Contact(nama, nomor));
                    }
                    case 2 -> {
                        System.out.print("Masukkan nama yang ingin dihapus: ");
                        String nama = sc.nextLine();
                        hp.hapusKontak(nama);
                    }
                    case 3 -> hp.lihatKontak();
                    case 4 -> {
                        System.out.print("Masukkan nama yang dicari: ");
                        String cari = sc.nextLine();
                        hp.cariKontak(cari);
                    }
                    case 5 -> {
                        System.out.print("Masukkan jumlah pulsa: ");
                        int pulsa = sc.nextInt();
                        hp.tambahPulsa(pulsa);
                    }
                    case 6 -> {
                        System.out.print("Masukkan nama kontak yang ingin ditelepon: ");
                        String nama = sc.nextLine();
                        hp.telepon(nama);
                    }
                    case 7 -> {
                        System.out.println("Pulsa saat ini: Rp " + hp.getPulsa());
                        System.out.println("Pilih paket:");
                        System.out.println("1. 5GB Rp20.000/5hr");
                        System.out.println("2. 3.5GB Rp15.000/3hr");
                        System.out.println("3. 1.5GB Rp5.000/1hr");
                        System.out.println("4. 7GB Rp25.000/14hr");
                        System.out.println("5. 15GB Rp40.000/28hr");
                        System.out.print("Pilih paket: ");
                        int pilihan = sc.nextInt();
                        hp.beliPaket(pilihan);
                    }
                    case 0 -> System.out.println("Keluar...");
                    default -> System.out.println("Pilihan tidak valid");
                }
            } catch (PulsaTidakCukupException e) {
                System.out.println(e.getMessage());
            }
        } while (pilih != 0);

        sc.close();
    }
}

// File: week10/PulsaTidakCukupException.java
package week10;

public class PulsaTidakCukupException extends Exception {
    public PulsaTidakCukupException(String message) {
        super(message);
    }
}
