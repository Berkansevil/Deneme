public class  deneme {

    // Array'i birleştir ve sırala
    public static void merge(int[] array, int left, int middle, int right) {
        int n1 = middle - left + 1;
        int n2 = right - middle;

        // Geçici diziler oluştur
        int[] L = new int[n1];
        int[] R = new int[n2];

        // Geçici dizilere verileri kopyala
        System.arraycopy(array, left, L, 0, n1);
        System.arraycopy(array, middle + 1, R, 0, n2);

        // Geçici dizilerden asıl diziye verileri geri kopyala
        int i = 0, j = 0;
        int k = left;
        while (i < n1 && j < n2) {
            if (L[i] <= R[j]) {
                array[k] = L[i];
                i++;
            } else {
                array[k] = R[j];
                j++;
            }
            k++;
        }

        // Kalan elemanları kopyala (L dizisinden)
        while (i < n1) {
            array[k] = L[i];
            i++;
            k++;
        }

        // Kalan elemanları kopyala (R dizisinden)
        while (j < n2) {
            array[k] = R[j];
            j++;
            k++;
        }
    }

    // Main merge sort metodu
    public static void sort(int[] array, int left, int right) {
        if (left < right) {
            int middle = (left + right) / 2;

            // İlk ve ikinci yarıyı sırala
            sort(array, left, middle);
            sort(array, middle + 1, right);

            // İki yarıyı birleştir
            merge(array, left, middle, right);
        }
    }

    // Ana metod
    public static void main(String[] args) {
        int[] array = {12, 11, 13, 5, 6, 7};
        System.out.println("Verilen dizi");
        printArray(array);

        sort(array, 0, array.length - 1);

        System.out.println("\nSıralanmış dizi");
        printArray(array);
    }

    // Diziyi ekrana yazdıran yardımcı metod
    public static void printArray(int[] array) {
        int n = array.length;
        for (int i = 0; i < n; ++i)
            System.out.print(array[i] + " ");
        System.out.println();
    }
}
