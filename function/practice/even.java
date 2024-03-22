package function.practice;

import java.util.Scanner;

public class even {

    public static boolean isEven(int number) {
        return (number % 2 == 0);

    }

    public static void main(String[] args) {
       
        Scanner scanner = new Scanner(System.in);
        System.out.println("testChecker : ");
        int testChecker = scanner.nextInt();
        boolean result = isEven(testChecker);
        if (result) {
        System.out.println(testChecker + " is even");
        } else {
        System.out.println(testChecker + " is odd");
        }
        scanner.close();
    }
}
