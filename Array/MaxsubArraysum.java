public class MaxsubArraysum {
    public static void maxSubarraysum(int numbers[]) {
        int maxSum = Integer.MIN_VALUE;
        int currsum = 0;
        for (int i = 0; i < numbers.length; i++) {
            int start = i;
            for (int j = i; j < numbers.length; j++) {
                int end = j;
                currsum = 0;
                for (int k = start; k <= end; k++) {
                    currsum += numbers[k];
                }
                System.out.println(currsum);
                if (maxSum < currsum) {
                   maxSum=currsum;
                }
            }
        }
        System.out.println("maximum subArray Sum = " + maxSum);
    }

    public static void main(String[] args) {
        int numbers[] = { 2, 4, 6, 8, 10 };
        maxSubarraysum(numbers);
    }
}
