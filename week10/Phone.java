package week10;

public interface Phone {
    void tambahKontak(Contact contact);
    void hapusKontak(String nama);
    void lihatKontak();
    void perbaruiKontak(String namaLama, Contact kontakBaru);
    void cariKontak(String nama);
    void tambahPulsa(int jumlah);
    void beliPaket(int pilihan) throws PulsaTidakCukupException;
    void telepon(String nama) throws PulsaTidakCukupException;
    int getPulsa();
}