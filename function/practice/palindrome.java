package function.practice;

import java.util.Scanner;

public class palindrome {
    public static boolean isPalindrome(int number) {
        int reverse = 0;
        int originalNumber = number;
        while (number > 0) {
            int lastDigit = number % 10;
            reverse = (reverse * 10) + lastDigit;
            number = number / 10;
        }

        return originalNumber == reverse;
    }

    public static void main(String[] args) {
       Scanner scanner=new Scanner (System.in);
       System.out.println("Enter testChecker");
       int testChecker=scanner.nextInt();

        if (isPalindrome(testChecker)) {
            System.out.println(testChecker + " it is palindrome");
        } else {
            System.out.println(testChecker + " it is not a palindrome");
        }
        scanner.close();
    }
}
