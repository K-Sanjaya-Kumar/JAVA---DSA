package practice;

import java.util.Scanner;

public class square {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter side :");
        int side = scanner.nextInt();
        int area = side*side;
        System.out.println("Area = " + area);
        scanner.close();
    }
}
