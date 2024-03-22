package operator;

public class increment {
    public static void main(String[] args) {
        int a = 10;
        int b = a++;
        int c = 20;
        int d = ++c;
        int e = 30;
        int f = e--;
        int g = 45;
        int h = --g;
        System.out.println("a = " + a);
        System.out.println("b = " + b);
        System.out.println("c = " + c);
        System.out.println("d = " + d);
        System.out.println("e = " + e);
        System.out.println("f = " + f);
        System.out.println("g = " + g);
        System.out.println("h = " + h);
    }
}
