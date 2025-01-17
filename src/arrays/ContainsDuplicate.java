package arrays;

public class ContainsDuplicate {
    public static void main(String[] args) {

        int[] nums = {1,2,3,1};
        System.out.println(containsDuplicate(nums));

        int[] nums2 = {1,2,3,4};
        System.out.println(containsDuplicate(nums2));

        int[] nums3 = {1,1,1,3,3,4,3,2,4,2};
        System.out.println(containsDuplicate(nums3));
    }

    public static boolean containsDuplicate(int[] nums) {

        for (int i = 0; i < nums.length; i++) {
            for (int j = i + 1; j < nums.length; j++) {
                if (nums[i] == nums[j]) {
                    return true;
                }
            }
        }

        return false;
    }
}
