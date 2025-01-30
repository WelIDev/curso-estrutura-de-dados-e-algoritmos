package OrdenacaoBusca.Ordenacao;

import java.util.Arrays;

public class InsertionSort {

    public static void main(String[] args) {
        int[] array = {20, 9, 86, -2, 16, 13, 34, 4};
        insertionSort(array);
        System.out.println(Arrays.toString(array));
    }

    // O (N²)
    public static void insertionSort(int[] array) {
        for(int i = 1; i < array.length; i++){
            int temp = array[i];
            int j = i - 1;
            while (j >= 0 && array[j] > temp) {
                array[j + 1] = array[j];
                j--;
            }
            array[j + 1] = temp;
        }
    }
    
}