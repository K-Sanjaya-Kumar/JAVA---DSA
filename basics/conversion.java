import java.util.Scanner;

public class conversion {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("enter a number");
        float number = scanner.nextInt();
        System.out.println("number = " + number);
        scanner.close();
    }
}
