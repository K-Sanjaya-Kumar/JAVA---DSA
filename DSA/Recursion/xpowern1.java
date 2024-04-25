package DSA.Recursion;

public class xpowern1 {
    public static int xPower1(int x, int n) {

        if (n == 0) {
            return 1;
        }

        int halfPower = xPower1(x, n / 2);
        int halfPowersq = halfPower * halfPower;

        if (n % 2 == 1) {
            halfPowersq = x * halfPowersq;
        }
        return halfPowersq;

    }

    public static void main(String[] args) {
        int x = 2;
        int n = 4;
        System.out.println(xPower1(x, n));
    }
}
