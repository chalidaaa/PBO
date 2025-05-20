package account;

import java.util.ArrayList;

public class CheckingAccount extends Account {
    private ArrayList<Integer> riwayatTabungan = new ArrayList<>();

    // Konstruktor CheckingAccount, memanggil konstruktor superclass Account
    public CheckingAccount(int accountNumber) {
        super(accountNumber);
    }

    // **Overloading** method simpanUang
    // Versi yang menerima jumlah tabungan dan menambahkannya ke saldo
    public void simpanUang(int amount) {
        balance += amount;
        riwayatTabungan.add(amount);
        System.out.println("Berhasil menabung Rp " + amount);
    }

    // **Overriding** method dari Account jika ingin tarikUang khusus (contoh, jika diimplementasikan)
    // Di sini belum di-override, tapi kita bisa override untuk fitur khusus.

    public void tampilkanRiwayatTabungan() {
        System.out.println("\nRiwayat Setoran:");
        if (riwayatTabungan.isEmpty()) {
            System.out.println("Belum ada riwayat tabungan.");
        } else {
            for (int i = 0; i < riwayatTabungan.size(); i++) {
                System.out.println("Setoran ke-" + (i + 1) + ": Rp " + riwayatTabungan.get(i));
            }
        }
    }
}
