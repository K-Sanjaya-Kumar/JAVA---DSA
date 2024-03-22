import java.util.Scanner;

public class Basic {
    public static void main(String[] args) {
        int marks[] = new int[100];
        Scanner scanner = new Scanner(System.in);
        System.out.println("marks[0]");
        marks[0] = scanner.nextInt();
        System.out.println("marks[1]");
        marks[1] = scanner.nextInt();
        System.out.println("marks[2]");
        marks[2] = scanner.nextInt();

        System.out.println("physics =" + marks[0]);
        System.out.println("Chemistry =" + marks[1]);
        System.out.println("Math = " + marks[2]);
        scanner.close();
        //for update
        marks[2]=94;
        System.out.println("math = " + marks[2]);
        System.out.println("marks length = " + marks.length);
        int percentage=(marks[0]+marks[1]+marks[2])/3;
        System.out.println("percentage = " + percentage + "%");
    }
}
