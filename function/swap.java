package function;

public class swap {
    public static void calculateSwap(int a,int b){
        int temp=a;
        a=b;
        b=temp;
        System.out.println("a = " +a);
        System.out.println("b = " +b);
    }
    public static void main(String[] args) {
       
        calculateSwap(4, 5);
    }
}
