package OrdenacaoBusca.Ordenacao;

import java.util.Arrays;

public class BubbleSort {
    public static void main(String[] args) {

        int[] array = {20, 9, 86, -2, 16, 13, 34, 4};
        bubbleSort(array);
        System.out.println(Arrays.toString(array));
    }

    //O (N²)
    public static void bubbleSort(int[] array) {

        for (int i = 0; i < array.length - 1; i++) {
            boolean swapped = false;
            for (int j = 0; j < array.length - i - 1; j++) {
                if (array[j] > array[j + 1]) {
                    swap(array, j, j + 1);
                    swapped = true;
                }
            }
            if (!swapped) {
                break;
            }
        }
    }

    private static void swap(int[] array, int a, int b) {
        int temp = array[a];
        array[a] = array[b];
        array[b] = temp;
    }
}
