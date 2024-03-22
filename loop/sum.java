package loop;

import java.util.Scanner;

public class sum {
    public static void main(String[] args) {
       Scanner scanner=new Scanner(System.in);

       System.out.println("Enter Range");
       int range= scanner.nextInt();
        int counter=1;
        int sum =0;

        while (counter<=range) {
            sum+=counter;
            counter++;
        }
        System.out.println("sum = " + sum);
        scanner.close();
    }
}
