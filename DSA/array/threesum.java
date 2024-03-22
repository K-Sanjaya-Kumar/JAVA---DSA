package DSA.array;

public class threesum {
    public static int[] threeSum(int[] nums) {
        for (int i = 0; i < nums.length - 2; i++) {
            for (int j = i + 1; j < nums.length - 1; j++) {
                for (int k = j + 1; k < nums.length; k++) {
                    if (nums[i] + nums[j] + nums[k] == 0) {
                        int[] result = { i, j, k };
                        return result;
                    }
                }
            }
        }
        return null;
    }

    public static void main(String[] args) {
        int[] nums = { -2,-2,-2,-1,-1,-1,0,0,0,2,2,2,2};
        int result[] = threeSum(nums);
        if (result != null) {
            System.out.println("Indices of (" + result[0] + " , " + result[1] + " , " + result[2] +")");
        } else {
            System.out.println("Indices is not found");
        }
    }
}
