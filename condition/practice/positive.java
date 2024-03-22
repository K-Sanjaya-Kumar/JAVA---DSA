package condition.practice;

import java.util.Scanner;

public class positive {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        //Q2
        int temperature=scanner.nextInt();
        if(temperature>100){
            System.out.println("fever");
        }
        else{
            System.out.println("you dont have a fever");
        }

        //Q1
        int number = scanner.nextInt();

        if (number > 0) {
            System.out.println("positive");
        }
        else{
            System.out.println("negative");
        }
        scanner.close();
    }
}
