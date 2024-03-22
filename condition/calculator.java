package condition;

import java.util.Scanner;

public class calculator {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter a:");
        int a = scanner.nextInt();
        System.out.println("Enter b:");
        int b = scanner.nextInt();
        System.out.println("Enter operator");
        char operator = scanner.next().charAt(0);

        switch (operator) {
            case  '+':
                System.out.println("a+b = "+ (a+b));
                break;
            case '-':
                System.out.println( "a-b" + (a-b));
                break;
            case '*':
                System.out.println("a*b = " + (a*b));
                break;
            case '/':
                System.out.println("a/b = " + (a/b));
                break;
            case '%':
                System.out.println("a%b = " + (a % b));
                break;
            default:
                System.out.println("wrong operator");

        }
        scanner.close();

    }
}
