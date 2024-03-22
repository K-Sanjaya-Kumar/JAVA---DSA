package practice;

import java.util.Scanner;

public class average {
    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);
        System.out.println("Enter A : ");
        int a = scanner.nextInt();
        System.out.println("Enter B : ");
        int b = scanner.nextInt();
        System.out.println("Enter C");
        int c = scanner.nextInt();
        int average =  (a+b+c)/3;
        System.out.println("Average  = " + average);
        scanner.close();
    }
}
