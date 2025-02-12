import java.util.Scanner;

public class MergeAlternately {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter first word:");
        String word1 = scanner.nextLine();

        System.out.println("Enter second word:");
        String word2 = scanner.nextLine();

        String merged = mergeAlternately(word1, word2);
        System.out.println("Merged string: " + merged);

        scanner.close();
    }

    public static String mergeAlternately(String word1, String word2) {
        StringBuilder merged = new StringBuilder();
        int i = 0, j = 0;

        // Merge characters alternately from both words
        while (i < word1.length() && j < word2.length()) {
            merged.append(word1.charAt(i++));
            merged.append(word2.charAt(j++));
        }

        // Append remaining characters from either word
        while (i < word1.length()) {
            merged.append(word1.charAt(i++));
        }

        while (j < word2.length()) {
            merged.append(word2.charAt(j++));
        }

        return merged.toString();
    }
}
