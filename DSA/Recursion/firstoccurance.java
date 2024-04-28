package DSA.Recursion;

public class firstoccurance {
    public static int firstOccurance(int arr[], int key, int i) {
        if (i == arr.length) {
            return -1;
        }
        if (arr[i] == key) {
            return i;
        }
        return firstOccurance(arr, key, i + 1);
    }

    public static void main(String[] args) {
        int arr[] = { 1, 3, 5, 7, 8, 10 };
        int key = 5;
        int i = 0;
        System.out.println(firstOccurance(arr, key, i));
    }
}
