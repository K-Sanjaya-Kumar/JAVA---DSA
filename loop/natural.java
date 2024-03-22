package loop;

import java.util.Scanner;

public class natural {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("enter range");
        int range = scanner.nextInt();
        int counter = 1;

        while (counter <= range) {
            System.out.println(counter);
            counter++;
        }
        scanner.close();
    }
}
