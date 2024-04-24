package DSA.Recursion;

//Time Complexity=O(n)
//Space Complexity=O(n)
public class xpowern {
    public static int xPowern(int x, int n) {
        if (n == 0) {
            return 1;
        }
        // if (x == 0) {
        // return 0;
        // }

        int xpnm1 = xPowern(x, n - 1);
        int xn = x * xpnm1;
        return xn;
    }

    public static void main(String[] args) {
        int x = 2;
        int n = 10;
        System.out.println(xPowern(x, n));
    }
}
