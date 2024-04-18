package DSA.Recursion;

public class countoffirstNnum {
    public static int countDigits(int n) {
        if (n == 0) {
            return 0;
        }

        return countDigits(n / 10) + 1;
    }

    public static void main(String[] args) {
        int n = 143546;
        System.out.println(countDigits(n));
    }
}
