package DSA.Recursion;

public class sumofNdigit {
    public static int printTotal(int n) {
        if (n == 0) {
            return 0;
        }
        int printTotal = printTotal(n / 10) + (n % 10);
        // System.out.print(printTotal + " ");
        return printTotal;
    }

    public static void main(String[] args) {
        int n = 123456789;
        System.out.println(printTotal(n));
    }
}
