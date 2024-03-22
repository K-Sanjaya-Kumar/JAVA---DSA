package string;

public class basic2 {

    public static void printLetters(String str) {
        for (int i = 0; i < str.length(); i++) {
            System.out.print(str.charAt(i));
        }
        ;
        System.out.println();
    }

    public static void main(String[] args) {

        String firstName = "K";
        String middleName = "Sanjaya";
        String lastName = "Kumar";
        String fullName = firstName + " " + middleName + " " + lastName;
       printLetters(fullName);
       System.out.println(fullName.charAt(0));

    }
}
