package arrays;

public class MaxConsecutiveOnes {

    public static void main(String[] args) {

        int[] entrada1 = {1,1,0,1,1,1};
        int[] entrada2 = {1,0,1,1,0,1};
        System.out.println(findMaxConsecutiveOnes(entrada1));
        System.out.println(findMaxConsecutiveOnes(entrada2));
    }

    public static int findMaxConsecutiveOnes(int[] nums) {
        int max = 0;
        int count = 0;

        for (int num : nums) {
            if (num == 1) {
                count++;
            } else {
                count = 0;
            }
            if (count > max) {
                max = count;
            }
        }
        return max;
    }
}
