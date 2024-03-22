package practice;

import java.util.Scanner;

public class gst {
    public static void main(String[] args) {
        Scanner scanner= new Scanner(System.in);
        System.out.println("pencil price :");
        float pencil = scanner.nextFloat();
        System.out.println("Enter pen");
        float pen = scanner.nextFloat();
        System.out.println("Enter Eraser");
        float eraser = scanner.nextFloat();
        float total = pencil+pen+eraser;
        System.out.println("total = " + total);
        float newtotal = total+(0.18f*total);
        System.out.println("newtotal = " + newtotal);
        scanner.close();
    }
    
}
