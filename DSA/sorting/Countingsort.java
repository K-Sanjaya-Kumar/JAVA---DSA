package DSA.sorting;

//TC--->O(N)
//SPC--->O(k+1)=O(K)

public class Countingsort {
    public static void countingsort(int arr[]) {
        int largest = Integer.MIN_VALUE;
        // finding largest element
        for (int i = 0; i < arr.length; i++) {
            largest = Math.max(largest, arr[i]);

        }

        // distinct numbeer of same element using counting array
        int count[] = new int[largest + 1];
        for (int i = 0; i < arr.length; i++) {
            count[arr[i]]++;
        }

        // sort the distinct array
        int j = 0;
        for (int i = 0; i < count.length; i++) {
            while (count[i] > 0) {
                arr[j] = i;
                j++;
                count[i]--;
            }
        }

        // print
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + " ");
        }
        System.out.println();
    }

    public static void main(String[] args) {
        int arr[] = { 1, 4, 1, 3, 2, 4, 3, 7 };
        countingsort(arr);
    }
}
