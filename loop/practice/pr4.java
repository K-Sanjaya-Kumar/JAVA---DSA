package loop.practice;

import java.util.Scanner;

public class pr4 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter integer : ");
        int count = scanner.nextInt();
        int evenSum = 0;
        int oddSum = 0;
        System.out.println("Enter " + count + " integers:");
        for (int i = 1; i <= count; i++) {
            int num = scanner.nextInt();

            if (num % 2 == 0) {
                evenSum += num;
            } else {
                oddSum += num;
            }

        }
        System.out.println("evensum = " + evenSum);
        System.out.println("oddsum = " + oddSum);
        scanner.close();

    }
}
