package OrdenacaoBusca.Ordenacao;

import java.util.Arrays;

public class SelectionSort {
    public static void main(String[] args) {
        int[] array = {20, 9, 86, -2, 16, 13, 34, 4};
        selectionSort(array);
        System.out.println(Arrays.toString(array));

    }

    // O(N²)
    public static void selectionSort(int[] a) {
        for (int i = 0; i < a.length; i++) {
            int min = i;
            for (int j = i + 1; j < a.length; j++) {
                if(a[j] < a[min]) {
                    min = j;
                }
            }
            if(min != i) {
                swap(a, i, min);
            }
        }
    }

    private static void swap(int[] array, int a, int b) {
        int temp = array[a];
        array[a] = array[b];
        array[b] = temp;
    }

}
