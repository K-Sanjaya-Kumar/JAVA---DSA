package function;

import java.util.Scanner;

public class table {
    public static void printTable(int n){
        for (int i=1;i<=10;i++){
            System.out.println(n+ "*" +i+"="+ n*i);
        }
        
    }
    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);

        int n=scanner.nextInt();
        scanner.close();
        printTable(n);
    }
}
