package DSA.array;

public class Threeplets1 {
    public static int threeSumClosest(int[] nums, int target) {
        int resultSum = nums[0] + nums[1] + nums[2];
        int minDifference = Integer.MAX_VALUE;
        for (int i = 0; i < nums.length - 2; i++) {
            for (int j = i + 1; j < nums.length - 1; j++) {
                for (int k = j + 1; k < nums.length; k++) {
                    int sum = nums[i] + nums[j] + nums[k];
                    if (sum == target) {
                        return target;
                    }
                    int diffTotarget = Math.abs(sum - target);
                    if (diffTotarget < minDifference) {
                        resultSum = sum;
                        minDifference = diffTotarget;
                    }
                }
            }
        }
        return resultSum;

    }

    public static void main(String[] args) {
        // Threeplets1 threeplets1=new Threeplets1();
        int[] nums = {-1,2,1,-4};
        int target = 1;
        System.out.println(threeSumClosest(nums, target));
    }
}
