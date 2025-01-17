package arrays;

import java.util.Arrays;

public class DuplicateZeros {
    public static void main(String[] args) {

        int[] arr = {1, 0, 2, 3, 0, 4, 5, 0};
        int[] arr2 = {1, 2, 3};

        duplicateZeros(arr);
        duplicateZeros(arr2);

        System.out.println(Arrays.toString(arr));
        System.out.println(Arrays.toString(arr2));
    }

    public static void duplicateZeros(int[] arr) {

        for (int i = 0; i < arr.length - 1; i++) {
            if (arr[i] == 0) {
                for (int j = arr.length - 2; j >= i; j--) {
                    if (j + 1 < arr.length) {
                        arr[j + 1] = arr[j];
                    }
                }
                i++;
            }
        }
    }
}
