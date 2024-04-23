package DSA.Recursion;

public class countdigits {
    public static int countDigits(int n) {
        if (n == 0) {
            return 0;
        }

        return countDigits(n / 10) + 1;
    }

    public static void main(String[] args) {
        int n = 325376;
        System.out.print(countDigits(n));
    }
}
