public class prefixMaxsubarraysum {
    public static void maxSubarraysum1(int numbers[]){
        int currsum=0;
        int maxSum=Integer.MIN_VALUE;
        int prefix[]=new int[numbers.length];
         prefix[0]=numbers[0];
         //calculate prefix array

         for(int i=1;i<numbers.length;i++){
            prefix[i]= prefix[i-1] + numbers[i];
         }

         for(int i=0;i<numbers.length;i++){
            int start=i;
            for(int j=i;j<numbers.length;j++){
                int end=j;
                currsum = start==0 ? prefix[end] : prefix[end] - prefix[start-1];
                System.out.println("currsum =" + currsum);
                if(maxSum<currsum){
                    maxSum=currsum;
                }
            }
         }
         System.out.println("maxsum = " + maxSum);

    }
    public static void main(String[] args) {
        int numbers[]={1,-2,6,-1,3};
        maxSubarraysum1(numbers);
    }
}
