package condition.practice;

import java.util.Scanner;

public class leap {
    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);
        //Q5
        System.out.println("Enter Year :");
        int year =scanner.nextInt();
        if(year%4==0){
            System.out.println("this is a leap year");
        }
        else{
            System.out.println("this is not a leap year");
        }
        scanner.close();
        int a=34;
        int b=22;
        boolean x=(a<b)? true:false;
        System.out.println(x);
        boolean y=(a>b)? true:false;
        System.out.println(y);
    }    
}
