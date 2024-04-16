package DSA.Recursion;

public class fibonacci {
    public static int calcFibonacci(int n) {
        if (n == 1 || n ==2) {
            return 1;
        }
        // int fnm1 = calcFibonacci(n - 1);
        // int fnm2 = calcFibonacci(n - 2);
        // int fn = fnm1 + fnm2;
        return calcFibonacci(n - 1) + calcFibonacci(n - 2);
    }

    public static void main(String[] args) {

        int n = 7;
        System.out.println(calcFibonacci(n));
    }
}
