package week8;

public class BangunDatar {
    protected int sisi;
    protected int panjang;
    protected int lebar;
    protected double alas;
    protected double tinggi;
    protected double radius;
    protected int luas;
    protected double luas2;
    protected String stat = "square";
    protected final double phi = 3.14;

    // Constructor Persegi
    public BangunDatar(int sisi) {
        this.sisi = sisi;
        this.stat = "square";
    }

    // Constructor Persegi Panjang
    public BangunDatar(int panjang, int lebar) {
        this.panjang = panjang;
        this.lebar = lebar;
        this.stat = "rectangle";
    }

    // Constructor Segitiga
    public BangunDatar(double alas, double tinggi) {
        this.alas = alas;
        this.tinggi = tinggi;
        this.stat = "triangle";
    }

    // Constructor Lingkaran
    public BangunDatar(double radius) {
        this.radius = radius;
        this.stat = "circle";
    }

    // Method untuk menghitung luas
    public void luas(BangunDatar bd) {
        switch (bd.stat) {
            case "square":
                this.luas = bd.sisi * bd.sisi;
                break;
            case "rectangle":
                this.luas = bd.panjang * bd.lebar;
                break;
            case "triangle":
                this.luas2 = 0.5 * bd.alas * bd.tinggi;
                break;
            case "circle":
                this.luas2 = bd.phi * bd.radius * bd.radius;
                break;
        }
    }
}
