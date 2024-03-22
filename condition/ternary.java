package condition;

import java.util.Scanner;

public class ternary {
    public static void main(String[] args) {
        // Q1
        // int number = 22;
        // String type=((number%2)==0)? "even":"odd";
        // System.out.println(type);

        // Q2

        // int mark=88;
        // String report_card=(mark>=33) ? "pass" : "fail";
        // System.out.println(report_card);

        Scanner scanner = new Scanner(System.in);
        //Q3
        System.out.println("Day :");
        int Day = scanner.nextInt();
        switch (Day) {
            case 1:
                System.out.println("Monday");
            case 2:
                System.out.println("Tuesday");
            case 3:
                System.out.println("Wednesday");
            case 4:
                System.out.println("Thursday");
            case 5:
                System.out.println("Friday");
            case 6:
                System.out.println("Saturday");
            case 7:
                System.out.println("Sunday");
                break;
            default:System.out.println("you choose wrong day");
                break;
        }

        //Q4
        System.out.println("Item Number : ");
        int Item = scanner.nextInt();

        switch (Item) {
            case 1:
                System.out.println("Panner");
                break;
            case 2:
                System.out.println("chicken");
                break;
            case 3:
                System.out.println("biriyani");
                break;
            case 4:
                System.out.println("Egg");
                break;
            case 5:
                System.out.println("chicken");
                break;
            default:
                System.out.println("kuch nehi milega");
                break;
        }
        scanner.close();
    }

}
