import javax.swing.*;
import java.util.Arrays;
import java.util.Scanner;

public class Sort {
    public static void main(String[] args) {

        int[] numbers = {10, 5, 7, 3, 9, 5};
        System.out.print("Before the selection sort: ");
        for (int i = 0; i < numbers.length; i++) {
            System.out.print(numbers[i] + " ");
            System.out.println();
        }

        for (int i = 0; i < numbers.length; i++) {
            int min = i;
            for (int j = i + 1; j < numbers.length; j++) {
                if (numbers[j] < numbers[min]) {
                    min = j;
                }
            }
            int temp = numbers[i];
            numbers[i] = numbers[min];
            numbers[min] = temp;
        }
        System.out.println("after the selection sort");
        for (int i = 0; i < numbers.length; i++) {
            System.out.print(numbers[i] + " ");
            System.out.println();
        }

    }

    // Selection Sort =Bu algoritma bana göre düşünmesi en kolay sıralama algoritması.
    //Listede en küçük elemanı bulup en başa alıp sonrasında sıralama yapılacak.

    int[] arr = {22, 1, 34, 48, 5, 10, 7, 2, 5};

    public static void selectionSort(int[] arr) {
        for (int i = 0; i < arr.length; i++) {
            int min = i;
            for (int j = i + 1; j < arr.length; j++) {
                if (arr[j] < arr[min]) {
                    min = j;
                }
            }
            int temp = arr[i];
            arr[i] = arr[min];
            arr[min] = temp;
        }

    }

    // Insertion Sort:
    //Bu algoritma dizinin 2. elemanından başlar ve son elemana varana kadar üzerine geldiği her elemanı,
    // o elemandan önce gelip de o elemandan büyük olan elemanlarla yer değiştirir.
    public static void insertionSort(int[] arr) {
        int n = arr.length;
        for (int i = 1; i < n; i++) {
            int number = arr[i]; // 1
            int j = i - 1; //0
            while (j >= 0 && arr[j] > number) {
                arr[j + 1] = arr[j];
                j = j - 1;
            }
            arr[j + 1] = number;
        }
    }

    // Bubble Sort
    // Bu algoritma ikili sıralama yapıp en büyük değeri dizinin en sonuna yazar.
    //Time complexity: 0(n^2) , Space complexity: 0(1) => var olan yeri kullandık.
    public static void bubbleSort(int[] arr) {
        int n = arr.length;
        for (int i = 0; i < n - 1; i++)
            for (int j = 0; j < n - i - 1; j++)
                if (arr[j] > arr[j + 1]) {
                    // swap temp and arr[i]
                    int temp = arr[j];
                    arr[j] = arr[j + 1];
                    arr[j + 1] = temp;
                }

    }
    //

    // faktoriyel hesaplama
    public static void faktoriyel() {
        Scanner scanner = new Scanner(System.in);
        int faktoriyel = 1;
        System.out.println("Bir sayı giriniz :");
        int sayı = scanner.nextInt();
        while (sayı > 0) {
            faktoriyel *= sayı;
            sayı--;
        }
        System.out.println("Faktoriyel hesabı : " + faktoriyel);
    }


}
