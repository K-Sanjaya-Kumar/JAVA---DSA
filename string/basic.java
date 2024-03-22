package string;

import java.util.Scanner;

public class basic {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println(" Enter Your Name ");
        String name=scanner.nextLine();
        System.out.println(name);
        scanner.close();
    }
}
