package condition;

import java.util.Scanner;

public class student {
   public static void main(String[] args) {
     Scanner scanner = new Scanner(System.in);

     //Q1
     System.out.println("number : ");
     int number=scanner.nextInt();
     if(number%2==0){
        System.out.println("it is even number");
     }
     else{
        System.out.println("it is  an odd number");
     }

     System.out.println("enter a:");
     int a=scanner.nextInt();
     System.out.println("enter b");
     int b=scanner.nextInt();

     if(a>b){
        System.out.println("a is gteater than b :");
     }
     else{
        System.out.println("b is greater than a");
     }

     //Q2
     System.out.println("Enter your age :");
     int age =scanner.nextInt();
     if(age>=18){
        System.out.println("adult");
     } 
     else{
        System.out.println("Teenager");
     }  
     scanner.close();
   }

   
}
