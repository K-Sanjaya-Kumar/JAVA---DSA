package DSA.string;

public class compress {
    public static String compression(String str) {
        // if (str == null || str.isEmpty()) {
        //     return str;
        // }

        StringBuilder compressed = new StringBuilder();
        int count = 1;
        char prevChar = str.charAt(0);

        for (int i = 1; i < str.length(); i++) {
            char currentChar = str.charAt(i);

            if (currentChar == prevChar) {
                count++;
            } else {
                compressed.append(prevChar);
                if (count > 1) {
                    compressed.append(count);
                }
                count = 1;
                prevChar = currentChar;
            }
        }

        // Append the last character and its count
        compressed.append(prevChar);
        if (count > 1) {
            compressed.append(count);
        }

        return compressed.toString();
    }

    public static void main(String[] args) {
        String str = "aaabbbcceee";
        System.out.println(compression(str));
    }
}
