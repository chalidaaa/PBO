
package week10;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.*;

public class Cellphone implements Phone {
    private List<Contact> kontak = new ArrayList<>();
    private int pulsa = 0;
    private LocalDate paketAktifHingga;

    @Override
    public void tambahKontak(Contact contact) {
        kontak.add(contact);
    }

    @Override
    public void hapusKontak(String nama) {
        kontak.removeIf(k -> k.getNama().equalsIgnoreCase(nama));
    }

    @Override
    public void lihatKontak() {
        if (kontak.isEmpty()) {
            System.out.println("Anda tidak memiliki kontak");
            return;
        }
        kontak.forEach(System.out::println);
    }

    @Override
    public void perbaruiKontak(String namaLama, Contact kontakBaru) {
        for (int i = 0; i < kontak.size(); i++) {
            if (kontak.get(i).getNama().equalsIgnoreCase(namaLama)) {
                kontak.set(i, kontakBaru);
                break;
            }
        }
    }

    @Override
    public void cariKontak(String nama) {
        if (kontak.isEmpty()) {
            System.out.println("Anda tidak memiliki kontak");
            return;
        }
        Optional<Contact> found = kontak.stream().filter(k -> k.getNama().equalsIgnoreCase(nama)).findFirst();
        if (found.isPresent()) {
            System.out.println(found.get());
        } else {
            System.out.println("Kontak tidak ditemukan.");
        }
    }

    @Override
    public void tambahPulsa(int jumlah) {
        this.pulsa += jumlah;
        System.out.println("Pulsa berhasil ditambahkan. Pulsa sekarang: Rp " + pulsa);
    }

    @Override
    public void beliPaket(int pilihan) throws PulsaTidakCukupException {
        int harga = 0;
        int hari = 0;
        String paket = "";

        switch (pilihan) {
            case 1:
                harga = 20000;
                hari = 5;
                paket = "5GB";
                break;
            case 2:
                harga = 15000;
                hari = 3;
                paket = "3.5GB";
                break;
            case 3:
                harga = 5000;
                hari = 1;
                paket = "1.5GB";
                break;
            case 4:
                harga = 25000;
                hari = 14;
                paket = "7GB";
                break;
            case 5:
                harga = 40000;
                hari = 28;
                paket = "15GB";
                break;
            default:
                System.out.println("Pilihan tidak tersedia");
                return;
        }

        if (pulsa < harga) {
            throw new PulsaTidakCukupException("Maaf pulsa Anda tidak mencukupi untuk pembelian paket ini.");
        }

        pulsa -= harga;
        paketAktifHingga = LocalDate.now().plusDays(hari);
        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("dd MMMM yyyy");
        System.out.println("Selamat! Anda Paket " + paket + " aktif sampai dengan " + paketAktifHingga.format(formatter) + ". Enjoy!");
    }

    @Override
    public void telepon(String nama) throws PulsaTidakCukupException {
        if (pulsa <= 0) {
            throw new PulsaTidakCukupException("Pulsa habis. Tidak bisa melakukan panggilan.");
        }

        Optional<Contact> found = kontak.stream().filter(k -> k.getNama().equalsIgnoreCase(nama)).findFirst();
        if (found.isPresent()) {
            System.out.println("Memanggil " + found.get().getNama() + "...");
            pulsa -= 1000;
            System.out.println("Pulsa tersisa: Rp " + pulsa);
        } else {
            System.out.println("Kontak tidak ditemukan.");
        }
    }

    @Override
    public int getPulsa() {
        return pulsa;
    }
}