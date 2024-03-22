package function;

public class overload {
    public static int sum(int a, int b) {
        int sum = a + b;
        return sum;
    }

    public static float sum(float a, float b) {
        float sum = a + b ;
        return sum;
    }

    public static void main(String[] args) {
        System.out.println(sum(4, 5));
        System.out.println(sum(5.7f, 2.5f));
    }

}
