package arrays;

public class FindEvenNumberDigits {

    public static void main(String[] args) {

        int[] nums = {12,345,2,6,7896};
        int[] nums2 = {555,901,482,1771};

        System.out.println(findEvenNumberDigits(nums));
        System.out.println(findEvenNumberDigits(nums2));
    }

    public static int findEvenNumberDigits(int[] nums) {
        int count = 0;

        for (int n : nums) {
            String num = String.valueOf(n);

            if (num.length() % 2 == 0) {
                count++;
            }
        }
        return count;
    }
}
