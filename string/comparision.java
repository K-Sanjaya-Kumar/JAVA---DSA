package string;

public class comparision {
    public static void main(String[] args) {
        String s1 = "sanjaya";
        //String s2 = "sanjaya";
        String s3 = new String("sanjaya");

        // if (s1 == s2) {
        // System.out.println("strings are equal");
        // } else {
        // System.out.println("strings are not equals");
        // }

        // if (s1 == s3) {
        // System.out.println("strings are equal");
        // } else {
        // System.out.println("strings are not equal");
        // }

        if (s1.equals(s3)) {
            System.out.println("strings are equals");
        } else {
            System.out.println("strings are not equals");
        }
    }
}
