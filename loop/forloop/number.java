package loop.forloop;

import java.util.Scanner;

public class number {
    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);
        System.out.println("Enter range :");
        int range=scanner.nextInt();
        int sum =0;
        for(int i=1;i<=range;i++){
           sum+=i;
        }
        System.out.println("sum : " + sum);
        scanner.close();
    }
}
