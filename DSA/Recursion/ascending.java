package DSA.Recursion;

public class ascending {
    public static void printNumber(int n) {
        if (n ==21 ) {
            
            return ;
        }
        System.out.print(n + " ");          //this is for ascending 
        printNumber(n+1);
        // System.out.print(n + " ");    //this is for descending 
        
        
    }
    public static void main(String[] args) {
        int n=1;
        printNumber(n);
    }
}
