package DSA.Recursion;
// Time and space complexity is O(logn).
public class ckecksortedarray {
    public static boolean checkSortedArray(int arr[],int i){
        if(i==arr.length-1){
            return true;
        }

        if(arr[i]>arr[i+1]){
            return false;
        }

        return checkSortedArray(arr, i+1);
    }
    public static void main(String[] args) {
        int arr[]={1,2,3,4,5,6};
        int i=0;
        System.out.println(checkSortedArray(arr, i));
    }
}
