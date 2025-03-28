package week5;
import java.util.Scanner;

public class Latihan4 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        
        // Input matrix A
        System.out.print("input baris matrix A = ");
        int barisA = input.nextInt();
        System.out.print("input kolom matrix A = ");
        int kolomA = input.nextInt();
        
        int[][] matrixA = new int[barisA][kolomA];
        for(int i = 0; i < barisA; i++) {
            for(int j = 0; j < kolomA; j++) {
                System.out.printf("input elemen matrix A [%d,%d] = ", i, j);
                matrixA[i][j] = input.nextInt();
            }
        }
        
        // Input matrix B
        System.out.print("\ninput baris matrix B = ");
        int barisB = input.nextInt();
        System.out.print("input kolom matrix B = ");
        int kolomB = input.nextInt();
        
        int[][] matrixB = new int[barisB][kolomB];
        for(int i = 0; i < barisB; i++) {
            for(int j = 0; j < kolomB; j++) {
                System.out.printf("input elemen matrix B [%d,%d] = ", i, j);
                matrixB[i][j] = input.nextInt();
            }
        }
        
        // Menu operasi
        while(true) {
            System.out.println("\n===== Menu Operasi Matrix =====");
            System.out.println("1. Penjumlahan Matrix (A + B)");
            System.out.println("2. Perkalian Matrix (A × B)");
            System.out.println("3. Transpose Matrix A");
            System.out.println("4. Transpose Matrix B");
            System.out.println("5. Keluar");
            System.out.print("Pilih operasi (1-5): ");
            int pilihan = input.nextInt();
            
            switch(pilihan) {
                case 1:
                    if(barisA == barisB && kolomA == kolomB) {
                        int[][] hasilJumlah = penjumlahanMatrix(matrixA, matrixB);
                        System.out.println("\nHasil penjumlahan matrix A + B:");
                        cetakMatrix(hasilJumlah);
                    } else {
                        System.out.println("Ukuran matrix tidak sama, tidak bisa dijumlahkan!");
                    }
                    break;
                case 2:
                    if(kolomA == barisB) {
                        int[][] hasilKali = perkalianMatrix(matrixA, matrixB);
                        System.out.println("\nHasil perkalian matrix A × B:");
                        cetakMatrix(hasilKali);
                    } else {
                        System.out.println("Jumlah kolom A harus sama dengan jumlah baris B!");
                    }
                    break;
                case 3:
                    int[][] transposeA = transposeMatrix(matrixA);
                    System.out.println("\nHasil transpose matrix A:");
                    cetakMatrix(transposeA);
                    break;
                case 4:
                    int[][] transposeB = transposeMatrix(matrixB);
                    System.out.println("\nHasil transpose matrix B:");
                    cetakMatrix(transposeB);
                    break;
                case 5:
                    System.out.println("Program selesai!");
                    input.close();
                    System.exit(0);
                default:
                    System.out.println("Pilihan tidak valid!");
            }
        }
    }
    
    // Method penjumlahan matrix
    public static int[][] penjumlahanMatrix(int[][] a, int[][] b) {
        int baris = a.length;
        int kolom = a[0].length;
        int[][] hasil = new int[baris][kolom];
        
        for(int i = 0; i < baris; i++) {
            for(int j = 0; j < kolom; j++) {
                hasil[i][j] = a[i][j] + b[i][j];
            }
        }
        return hasil;
    }
    
    // Method perkalian matrix
    public static int[][] perkalianMatrix(int[][] a, int[][] b) {
        int barisA = a.length;
        int kolomA = a[0].length;
        int kolomB = b[0].length;
        int[][] hasil = new int[barisA][kolomB];
        
        for(int i = 0; i < barisA; i++) {
            for(int j = 0; j < kolomB; j++) {
                for(int k = 0; k < kolomA; k++) {
                    hasil[i][j] += a[i][k] * b[k][j];
                }
            }
        }
        return hasil;
    }
    
    // Method transpose matrix
    public static int[][] transposeMatrix(int[][] matrix) {
        int baris = matrix.length;
        int kolom = matrix[0].length;
        int[][] hasil = new int[kolom][baris];
        
        for(int i = 0; i < baris; i++) {
            for(int j = 0; j < kolom; j++) {
                hasil[j][i] = matrix[i][j];
            }
        }
        return hasil;
    }
    
    // Method untuk mencetak matrix
    public static void cetakMatrix(int[][] matrix) {
        for(int i = 0; i < matrix.length; i++) {
            for(int j = 0; j < matrix[0].length; j++) {
                System.out.print(matrix[i][j] + "\t");
            }
            System.out.println();
        }
    }
}