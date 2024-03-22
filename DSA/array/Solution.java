package DSA.array;
import java.util.*;
// import java.util.ArrayList;
// import java.util.HashSet;
// import java.util.Arrays;
// import java.util.List;
// import java.util.Set;
public class Solution {
    public  List<List<Integer>>  ThreeSum(int[] nums) {
        if (nums == null || nums.length < 3) {
            return new ArrayList<>();
        }

        Arrays.sort(nums);
        Set<List<Integer>> result = new HashSet<>();
        for (int i = 0; i < nums.length - 2; i++) {
            int j = i + 1;
            int k = nums.length - 1;

            while (j < k) {
                int sum = nums[i] + nums[j] + nums[k];
                if (sum == 0) {
                    result.add(Arrays.asList(nums[i], nums[j], nums[k]));
                    j++;
                    k--;
                } else if (sum < 0) {
                    j++;
                } else {
                    k--;
                }
            }
        }
        return new ArrayList<>(result);
    }

   public static void main(String[] args) {
    Solution store= new Solution();

        int[] nums = { -1, 0, 1, 2, -1, -4 };
         List<List<Integer>> result = store.ThreeSum(nums);

        // Print the result
        for (List<Integer> triplet : result) {
            System.out.println(triplet);
        }
   }
}
