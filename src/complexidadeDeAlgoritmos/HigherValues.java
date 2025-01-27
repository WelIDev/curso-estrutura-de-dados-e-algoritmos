package complexidadeDeAlgoritmos;

import java.util.Arrays;

public class HigherValues {
    public static void main(String[] args) {

        System.out.println(Arrays.toString(higherValues(new int[]{7, 3, 8, 7, 5})));
    }

    // Complexidade de Tempo: O (N²)
    // Complexidade de Espaço: O (N)
    public static int[] higherValues(int[] arr) {
        int[] newArr = new int[arr.length];
        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr.length; j++) {
                if (arr[j] > arr[i]) {
                    newArr[i]++;
                }
            }
        }
        return newArr;
    }
}
