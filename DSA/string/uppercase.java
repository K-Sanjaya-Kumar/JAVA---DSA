package DSA.string;

public class uppercase {
    public static String toUpperCase(String str) {
        StringBuilder sb = new StringBuilder(' ');
        char ch = Character.toUpperCase(str.charAt(0));
        sb.append(ch);
        for (int i = 1; i < str.length(); i++) {
            if (str.charAt(i) == ' ' && i < str.length() - 1) {
                sb.append(str.charAt(i));
                i++;
                sb.append(Character.toUpperCase(str.charAt(i)));

            } else {
                sb.append(str.charAt(i));
            }
        }
        return sb.toString();
    }

    public static void main(String[] args) {
        String str = "it looks like you're trying to convert the first character of each word in a string to uppercase. there are a few issues in your code. here's the corrected version";
        System.out.println(toUpperCase(str));
    }
}
