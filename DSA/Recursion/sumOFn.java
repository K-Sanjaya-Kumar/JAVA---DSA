package DSA.Recursion;

public class sumOFn {
    public static int printSum(int n) {
        if (n == 0) {

            return n;
        }

        int sumOFnm1 = printSum(n - 1);
        int sumOFn = n + sumOFnm1;
        System.out.println(n);
        return sumOFn;

    }

    public static void main(String[] args) {
        int n = 5;
        System.out.println("sum of 1 to 5 = " + printSum(n));
    }
}
