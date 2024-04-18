package DSA.Recursion;

public class firstNnaturalnum {
    public static int printN(int n) {
        if (n == 0) {
            return 0;
        }
        // System.out.print(n + " ");
        // this print is for reverse
        int num = printN(n - 1);
        // this print is for forward
        System.out.print(n + " ");
        return num;
    }

    public static void main(String[] args) {
        printN(5);
    }
}
