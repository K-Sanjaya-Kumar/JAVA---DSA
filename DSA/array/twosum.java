package DSA.array;

public class twosum {
    public static int[] twoSum(int[] nums, int target) {
        int n = nums.length;

        for (int i = 0; i < n; i++) {
            for (int j = i + 1; j < n; j++) {
                if (nums[i] + nums[j] == target) {
                    int result[] = { i, j };
                    return result;
                }
            }
        }
        return null;
    }

    public static void main(String[] args) {
        int nums[] = { 3,5,1,4,-8 };
        int target = 5;
        int[] result = twoSum(nums, target);
        if (result != null) {
            System.out.println("Indices of  " + result[0] + " , " + result[1]);
        } else {
            System.out.println("Indices is not found");
        }
    }
}
