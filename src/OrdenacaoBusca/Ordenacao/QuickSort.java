package OrdenacaoBusca.Ordenacao;

import java.util.Arrays;

public class QuickSort {
    public static void main(String[] args) {
        int[] array = {20, 9, 86, -2, 16, 13, 34, 4};
        System.out.println(Arrays.toString(quickSort(array, 0, array.length - 1)));
    }
    // O(N log N)
    public static int[] quickSort(int[] array, int left, int right) {
        if (left < right) {
            int pivot = partition(array, left, right);
            quickSort(array, left, pivot - 1);
            quickSort(array, pivot + 1, right);
        }
        return array;
    }

    private static int partition(int[] array, int left, int right) {
        int pivot = array[right];
        int i = left;
        for (int j = left; j < right; j++) {
            if (array[j] <= pivot) {
                swap(array, j, i);
                i++;
            }
        }
        swap(array, i, right);
        return i;
    }

    private static void swap(int[] array, int a, int b) {
        int temp = array[a];
        array[a] = array[b];
        array[b] = temp;
    }
}
