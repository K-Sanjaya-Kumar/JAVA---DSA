package string;

public class substring {
    public static String SubString(String str, int si, int ei) {
        String substr = " ";
        for (int i = si; i < ei; i++) {
            substr += str.charAt(i);
        }
        return substr;
    }

    public static void main(String[] args) {
        String str = "Helloworld";
        System.out.println(SubString(str, 0, 6));
       
    }
}
