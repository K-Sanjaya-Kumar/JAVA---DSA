public class subArray {
    public static void printSubarray(int numbers[]) {
        int sp=0;
        for (int i = 0; i < numbers.length; i++) {
            int start = i;
            for (int j = i; j < numbers.length; j++) {
                int end = j;

                for (int k = start; k <= end; k++) {
                    System.out.print( numbers[k]+ " ");
                    
                }
                System.out.println();
                sp++;
            }
            System.out.println();
             System.out.println("total subarray = " + sp);
        }
       
    }

    public static void main(String[] args) {
        int numbers[] = { 2, 4, 6, 8, 10 };
        printSubarray(numbers);
    }
}
