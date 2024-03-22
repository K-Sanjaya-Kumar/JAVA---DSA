package DSA.array;

import java.util.*;

public class Threeplets {
    public int threepletSumClosest(int[] nums, int target) {
        Arrays.sort(nums);
        int resultSum = nums[0] + nums[1] + nums[2];
        int minDifference = Integer.MAX_VALUE;
        for (int i = 0; i < nums.length - 2; i++) {
            int j = i + 1;
            int k = nums.length - 1;
            while (j < k) {
                int sum = nums[i] + nums[j] + nums[k];
                if (sum == target) {
                    return target;
                } else if (sum < target) {
                    j++;
                } else {
                    k--;
                }

                int diffTotarget = Math.abs(sum - target);
                if (diffTotarget < minDifference) {
                    resultSum = sum;
                    minDifference = diffTotarget;
                }
            }
        }
        return resultSum;
    }

    public static void main(String[] args) {
        //creates the instance of class
        Threeplets threeplets = new Threeplets();
        int[] nums = { 0,0,0};
        int target = -1;
        System.out.println(threeplets.threepletSumClosest(nums, target));
    }
}
