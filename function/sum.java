package function;

import java.util.Scanner;

public class sum {
    public static void calculateSum( ){
        Scanner scanner=new Scanner(System.in);
        System.out.println("enter a =");
        int a=scanner.nextInt();
        System.out.println("enter n b = ");
        int b=scanner.nextInt();
        int sum=a+b;
        System.out.println("sum =" +sum);
        scanner.close();
    }
    public static void main(String[] args) {
        calculateSum();
    }
}
