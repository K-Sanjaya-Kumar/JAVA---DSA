package DSA.Matrix;

public class staircasesearch {
    public static boolean staircaseSearch(int matrix[][], int key) {
        int row = 0;
        int n = matrix.length;
        int col = n-1;
        while (row < n && col >= 0) {
            if (matrix[row][col] == key) {
                System.out.println(" found key at : (" + row + " , " + col + ")");
                return true;
            } else if (key < matrix[row][col]) {
                col--;
            } else {
                row++;
            }
        }
        System.out.println("key is not found ");
        return false;
    }

    public static void main(String[] args) {
        int matrix[][] = {
                { 10, 20, 30, 40 },
                { 15, 25, 35, 45 },
                { 27, 29, 37, 48 },
                { 32, 33, 39, 50 }
        };
        int key = 50;
        staircaseSearch(matrix, key);

    }
}
