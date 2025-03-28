package week5;
import java.util.Arrays;
import java.util.Scanner;

public class Latihan3 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        System.out.print("Masukkan angka (pisahkan dengan spasi): ");
        String input = scanner.nextLine();
        String[] strNumbers = input.split(" ");
        int[] numbers = new int[strNumbers.length];
        
        for (int i = 0; i < strNumbers.length; i++) {
            numbers[i] = Integer.parseInt(strNumbers[i]);
        }
        
        System.out.println("\nArray awal: " + Arrays.toString(numbers));
        
        // Buat salinan array untuk masing-masing algoritma sorting
        int[] bubbleArray = Arrays.copyOf(numbers, numbers.length);
        int[] quickArray = Arrays.copyOf(numbers, numbers.length);
        int[] insertionArray = Arrays.copyOf(numbers, numbers.length);
        int[] selectionArray = Arrays.copyOf(numbers, numbers.length);
        int[] mergeArray = Arrays.copyOf(numbers, numbers.length);
        
        System.out.println("\n====== Bubble Sort ======");
        bubbleSort(bubbleArray);
        
        System.out.println("\n====== Quick Sort ======");
        quickSort(quickArray, 0, quickArray.length - 1);
        System.out.println("Hasil akhir: " + Arrays.toString(quickArray));
        
        System.out.println("\n====== Insertion Sort ======");
        insertionSort(insertionArray);
        
        System.out.println("\n====== Selection Sort ======");
        selectionSort(selectionArray);
        
        System.out.println("\n====== Merge Sort ======");
        mergeSort(mergeArray);
        System.out.println("Hasil akhir: " + Arrays.toString(mergeArray));
    }
    
    // Bubble Sort dengan tampilan iterasi
    public static void bubbleSort(int[] arr) {
        int n = arr.length;
        for (int i = 0; i < n-1; i++) {
            for (int j = 0; j < n-i-1; j++) {
                if (arr[j] > arr[j+1]) {
                    // Swap arr[j] and arr[j+1]
                    int temp = arr[j];
                    arr[j] = arr[j+1];
                    arr[j+1] = temp;
                    
                    // Tampilkan perubahan
                    System.out.println(Arrays.toString(arr));
                }
            }
        }
    }
    
    // Quick Sort dengan tampilan iterasi
    public static void quickSort(int[] arr, int low, int high) {
        if (low < high) {
            int pi = partition(arr, low, high);
            
            quickSort(arr, low, pi - 1);
            quickSort(arr, pi + 1, high);
        }
    }
    
    private static int partition(int[] arr, int low, int high) {
        int pivot = arr[high];
        int i = (low - 1);
        
        for (int j = low; j < high; j++) {
            if (arr[j] < pivot) {
                i++;
                
                // Swap arr[i] and arr[j]
                int temp = arr[i];
                arr[i] = arr[j];
                arr[j] = temp;
                
                // Tampilkan perubahan
                System.out.println(Arrays.toString(arr));
            }
        }
        
        // Swap arr[i+1] and arr[high] (pivot)
        int temp = arr[i+1];
        arr[i+1] = arr[high];
        arr[high] = temp;
        
        System.out.println(Arrays.toString(arr));
        
        return i + 1;
    }
    
    // Insertion Sort dengan tampilan iterasi
    public static void insertionSort(int[] arr) {
        int n = arr.length;
        for (int i = 1; i < n; ++i) {
            int key = arr[i];
            int j = i - 1;
            
            while (j >= 0 && arr[j] > key) {
                arr[j + 1] = arr[j];
                j = j - 1;
                
                // Tampilkan perubahan
                System.out.println(Arrays.toString(arr));
            }
            arr[j + 1] = key;
            System.out.println(Arrays.toString(arr));
        }
    }
    
    // Selection Sort dengan tampilan iterasi
    public static void selectionSort(int[] arr) {
        int n = arr.length;
        
        for (int i = 0; i < n-1; i++) {
            int min_idx = i;
            for (int j = i+1; j < n; j++) {
                if (arr[j] < arr[min_idx]) {
                    min_idx = j;
                }
            }
            
            // Swap arr[i] and arr[min_idx]
            int temp = arr[min_idx];
            arr[min_idx] = arr[i];
            arr[i] = temp;
            
            // Tampilkan perubahan
            System.out.println(Arrays.toString(arr));
        }
    }
    
    // Merge Sort dengan tampilan iterasi
    public static void mergeSort(int[] arr) {
        if (arr.length > 1) {
            int mid = arr.length / 2;
            
            int[] left = Arrays.copyOfRange(arr, 0, mid);
            int[] right = Arrays.copyOfRange(arr, mid, arr.length);
            
            mergeSort(left);
            mergeSort(right);
            
            int i = 0, j = 0, k = 0;
            
            while (i < left.length && j < right.length) {
                if (left[i] < right[j]) {
                    arr[k++] = left[i++];
                } else {
                    arr[k++] = right[j++];
                }
                System.out.println(Arrays.toString(arr));
            }
            
            while (i < left.length) {
                arr[k++] = left[i++];
                System.out.println(Arrays.toString(arr));
            }
            
            while (j < right.length) {
                arr[k++] = right[j++];
                System.out.println(Arrays.toString(arr));
            }
        }
    }
}