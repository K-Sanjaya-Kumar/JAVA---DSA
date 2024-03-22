package loop.forloop;

public class reverse {
    public static void main(String[] args) {
        int number=2345;
        int rev=0;
        while(number>0){
           int lastDigit= number%10; 
           rev= (rev*10)+lastDigit;
           number=number/10;
        }
        System.out.println("reverse number :"+ rev);
    }
}
