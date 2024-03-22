package string;

public class stringbuilder {
    public static void main(String[] args) {
        StringBuilder sb = new StringBuilder(" ");
        for (char ch = 'a'; ch < 'z'; ch++) {
            sb.append(ch);
        }
        System.out.println(sb);

        // System.out.println(sb);
        // System.out.println(sb.charAt(4));
        // sb.setCharAt(0, 'm');
        // System.out.println(sb);
        // sb.insert(3, 'o');
        // System.out.println(sb);
        // sb.delete(3, 4);
        // System.out.println(sb);
        // System.out.println(sb.length());
    }
}
