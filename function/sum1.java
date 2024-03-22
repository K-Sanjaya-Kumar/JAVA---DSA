package function;
import java.util.Scanner;
public class sum1 {
    public static void calculateSum(int a,int b){
        int sum =a+b;
        System.out.println("sum = " + sum);

    }
    public static void main(String[] args) {
        Scanner scanner=new Scanner (System.in);

        int a=scanner.nextInt();
        int b=scanner.nextInt();
        scanner.close();
        calculateSum(a, b);
    }
}
