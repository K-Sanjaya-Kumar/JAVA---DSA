import java.util.Scanner;



public class sum{
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter the value of a : ");
        int a = scanner.nextInt();
        System.out.println("Enter the value of b");
        int b = scanner.nextInt();
        int sum =  a+b;
        int product = a*b;
        int subtract = a-b;
        int division = a/b;
        System.out.println("sum = " + sum);
        System.out.println("product = " + product);
        System.out.println("subtract = " + subtract);
        System.out.println("division = " + division);
        scanner.close();

        // Scanner scanner = new Scanner(System.in);
        // System.out.println("enter the word");
        // String input =scanner.next();
        // System.out.println("Name:"+ input);
        // scanner.close();
    }
}
