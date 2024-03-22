package DSA.Matrix;

import java.util.Scanner;

public class basic {
    public static boolean search(int matrix[][], int key) {

        // find index and print
        for (int i = 0; i < matrix.length; i++) {
            for (int j = 0; j < matrix.length; j++) {
                if (matrix[i][j] == key) {
                    System.out.println(" found index at cell(" + i + "  , " + j + ")");
                    return true;
                }
            }
        }
        return false;
    }

    public static void main(String[] args) {

        int matrix[][] = new int[4][4];
        int rows = matrix.length;
        int colms = matrix.length;
        Scanner scanner = new Scanner(System.in);
        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < colms; j++) {
                matrix[i][j] = scanner.nextInt();
            }
        }

        for (int i = 0; i < matrix.length; i++) {
            for (int j = 0; j < matrix.length; j++) {
                System.out.print(matrix[i][j] + " ");
            }
            System.out.println();
        }
        scanner.close();
        search(matrix, 5);
    }

}
