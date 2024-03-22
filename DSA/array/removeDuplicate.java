package DSA.array;

public class removeDuplicate {
    public static int removeDuplicates(int[] nums) {
        int j = 0;
        for (int i = 0; i < nums.length; i++) {
            if (j < 2 || nums[i] > nums[j - 2]) {
                nums[j] = nums[i];
                j++;
            }
        }
        return j;
    }

    public static void main(String[] args) {

        int[] nums ={ 1, 1, 1,  2, 2, 3 };

        for (int i = 0; i < nums.length; i++) {
            System.out.print(nums[i] + " ");
        }
        System.out.println();
        int j=removeDuplicates(nums);

        for (int i = 0; i< j; i++) {
            System.out.print(nums[i] + " ");
        }

    }
}
