package DSA.string;

//Reverse a String 
//time Compexcity n/2----> O(n)
//space complexcity O(1);
public class reversestring {
    public static void printReverse(char[] chars) {
        int first = 0;
        int last = chars.length - 1;
        char temp;
        while (first < last) {
            temp = chars[last];
            chars[last] = chars[first];
            chars[first] = temp;
            first++;
            last--;
        }

    }

    public static void main(String[] args) {
        char[] chars = "sanjaya".toCharArray();
        System.out.println( " Original String = " +new String(chars));
        printReverse(chars);

       // String reverseString = new String(chars);
        System.out.println( " Reverse String = " + new String(chars));
       

    }
}
