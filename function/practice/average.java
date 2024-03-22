package function.practice;

import java.util.Scanner;

public class average {
    public static void calculateAverage(int a, int b, int c) {
        int average=(a+b+c)/3;
        System.out.println("Average = "+average);
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("enter a :");
        int a = scanner.nextInt();
        System.out.println("enter b = ");
        int b = scanner.nextInt();
        System.out.println("enter c:");
        int c = scanner.nextInt();
        
        scanner.close();

        calculateAverage(a, b, c);

    }
}
