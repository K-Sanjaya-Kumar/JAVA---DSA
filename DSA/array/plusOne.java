package DSA.array;

public class plusOne {
    public static int[] PlusOne(int[] digits) {
        for (int i = digits.length - 1; i >=0; i--) {
            if (digits[i]==9) {
                digits[i]=0;
                
            }
            else{
                digits[i]++;
                return digits;
            }
        }

        digits = new int[digits.length + 1];
        digits[0] = 1;
        return digits;
    }

    public static void main(String[] args) {
        int[] digits = { 1, 2, 3 };
        int[] result = PlusOne(digits);
        for (int nums : result) {
            System.out.print(nums + " ");
        }
    }
}
