package OrdenacaoBusca.Ordenacao;

import java.util.Arrays;

public class MergeSort {

    public static void main(String[] args) {
        int[] array = {20, 9, 86, -2, 16, 13, 34, 4};
        System.out.println(Arrays.toString(mergeSort(array)));
    }
    // O(N log N)
    public static int[] mergeSort(int[] array){
        mergeSortTailRecursive(array, 0, array.length - 1);
        return array;
    }
    
    public static void mergeSortTailRecursive(int[] array, int left, int right){
        if (left < right) {
            int middle = (left + right) / 2;
            mergeSortTailRecursive(array, left, middle);
            mergeSortTailRecursive(array, middle + 1, right);
            merge(array, left, middle, right);
       }
    }

    private static void merge(int[] array, int left, int middle, int right) {
        int[] result = new int[right - left + 1];
        int i = left;
        int j = middle + 1;
        int k = 0;

        while (i <= middle && j <= right) {
            if (array[i] < array[j]) {
                result[k++] = array[i++];
            }else{
                result[k++] = array[j++];
            }
        }

        while (i <= middle) {
            result[k++] = array[i++];
        }

        while (j <= right) {
            result[k++] = array[j++];
        }

        for (i = 0; i < result.length; i++){
            array[left + i] = result[i];
        }
    }
}
