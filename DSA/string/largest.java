package DSA.string;

public class largest {
    public static String findLargest(String[] word) {
        String largest = word[0];
        for (int i = 1; i < word.length; i++) {
            if (largest.compareTo(word[i]) < 0) {
                largest = word[i];
            }
        }
        return largest;
    }

    public static void main(String[] args) {
        String[] word = { "samir", "sanjaya", "kamal" };
        String largest = findLargest(word);
        System.out.println(" the largest string = " + largest);
    }
}
