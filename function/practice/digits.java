package function.practice;

import java.util.Scanner;

public class digits {
    public static int sumOfDigit(int number){
        int sum=0;
        while(number>0){
            int lastDigit=number%10;
            sum+=lastDigit;
            number=number/10;
        }
        return sum;
    }
    public static void main(String[] args) {
       Scanner scanner =new Scanner(System.in);
       System.out.println("Enter testNumber");
       int testNumber=scanner.nextInt();
        int sum=sumOfDigit(testNumber);
        System.out.println("sum of " + testNumber + " is " + sum);
        scanner.close();
    }
}
