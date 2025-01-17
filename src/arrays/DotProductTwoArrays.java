package arrays;

public class DotProductTwoArrays {

    public static void main(String[] args) {

        int[] nums1 = {1,0,0,2,3};
        int[] nums2 = {0,3,0,4,0};
        System.out.println(dotProduct(nums1, nums2));

        int[] nums3 = {0,1,0,0,0};
        int[] nums4 = {0,0,0,0,2};
        System.out.println(dotProduct(nums3, nums4));

        int[] nums5 = {0,1,0,0,2,0,0};
        int[] nums6 = {1,0,0,0,3,0,4};
        System.out.println(dotProduct(nums5, nums6));


    }

    public static int dotProduct(int[] arr1, int[] arr2) {

        int min = Math.min(arr1.length, arr2.length);
        int result = 0;

        for (int i = 0; i < min; i++) {
            result += arr1[i] * arr2[i];
        }
        return result;
    }
}
