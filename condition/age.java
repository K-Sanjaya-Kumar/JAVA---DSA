package condition;

import java.util.Scanner;

public class age {
    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);
        //Q1
        System.out.println("Income = ");
        float income=scanner.nextFloat();
        float tax=0;

        if(income<500000){
            tax=0;
        }
        else if (income>=500000 && income<=1000000){
            tax = (int)(income*0.2);
        }
        else{
            tax = (int)(income*0.3);
        }
        System.out.println("tax = " + tax);

        //Q2
        System.out.println("Age : ");
        int age = scanner.nextInt();
        if(age>=18){
            System.out.println("adult");
        }
        else if(age>=13 && age<18){
            System.out.println("Teenager");
        }
        else{
            System.out.println("child");
        }
        scanner.close();

    }
}
