package arrays;

import java.util.Arrays;

public class MergeArrays {
    public static void main(String[] args) {

        int[] nums1 = {1, 2, 3, 0, 0, 0};
        int m1 = 3;
        int[] nums2 = {2, 5, 6};
        int n1 = 3;

        mergeArrays(nums1, nums2, m1, n1);

        System.out.println(Arrays.toString(nums1));

        int[] nums3 = {1};
        int m2 = 1;
        int[] nums4 = {};
        int n2 = 0;

        mergeArrays(nums3, nums4, m2, n2);

        System.out.println(Arrays.toString(nums3));

        int[] nums5 = {0};
        int m3 = 0;
        int[] nums6 = {1};
        int n3 = 1;

        mergeArrays(nums5, nums6, m3, n3);

        System.out.println(Arrays.toString(nums5));
    }

    public static void mergeArrays(int[] nums1, int[] nums2, int m, int n) {
        for (int i = 0; i < n; i++) {
            nums1[m + i] = nums2[i];
        }
        Arrays.sort(nums1);
    }
}
