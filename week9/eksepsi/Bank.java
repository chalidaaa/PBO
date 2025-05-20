package eksepsi;

import account.Account;
import account.CheckingAccount;
import java.util.Scanner;

public class Bank {
    public static void main(String[] args) {
        System.out.println("=== Selamat Datang di Bank ===");

        // **Polimorfisme**: Variabel bertipe superclass Account
        // mengacu pada objek subclass CheckingAccount
        Account account = new CheckingAccount(101);

        Scanner scanner = new Scanner(System.in);
        boolean lanjut = true;

        while (lanjut) {
            System.out.println("\nMenu:");
            System.out.println("1. Menabung");
            System.out.println("2. Menarik Uang");
            System.out.println("3. Lihat Riwayat Tabungan");
            System.out.println("4. Cek Saldo");
            System.out.println("5. Keluar");
            System.out.print("Pilihan Anda: ");
            int pilihan = scanner.nextInt();

            switch (pilihan) {
                case 1:
                    System.out.print("Masukkan jumlah yang ingin ditabung: Rp ");
                    int setor = scanner.nextInt();

                    // Memanggil method simpanUang (overloading) di subclass CheckingAccount
                    ((CheckingAccount) account).simpanUang(setor);
                    break;

                case 2:
                    System.out.print("Masukkan jumlah yang ingin ditarik: Rp ");
                    int tarik = scanner.nextInt();
                    try {
                        // Memanggil method tarikUang dari superclass Account
                        account.tarikUang(tarik);
                    } catch (InsufficientFundsException e) {
                        System.out.println("Maaf, saldo kurang Rp " + e.getAmount());
                    }
                    break;

                case 3:
                    // Menampilkan riwayat tabungan yang hanya ada di subclass CheckingAccount
                    ((CheckingAccount) account).tampilkanRiwayatTabungan();
                    break;

                case 4:
                    System.out.println("Saldo Anda saat ini: Rp " + account.getBalance());
                    break;

                case 5:
                    lanjut = false;
                    System.out.println("Terima kasih telah menggunakan layanan kami.");
                    break;

                default:
                    System.out.println("Pilihan tidak valid, silakan coba lagi.");
            }
        }

        scanner.close();
    }
}
