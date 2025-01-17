package arrays;

import java.util.Arrays;

public class SortedSquare {
    public static void main(String[] args) {

        int[] nums = {-4, -1, 0, 3, 10};
        int[] nums2 = {-7, -3, 2, 3, 11};

        System.out.println(Arrays.toString(sortedSquares(nums)));
        System.out.println(Arrays.toString(sortedSquares(nums2)));
    }

    public static int[] sortedSquares(int[] n) {
        for (int i = 0; i < n.length; i++) {
            n[i] = n[i] * n[i];
        }
        Arrays.sort(n);
        return n;
    }
}
