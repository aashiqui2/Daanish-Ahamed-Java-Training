import java.util.Scanner;

public class LastWordLength {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter a string: ");
        String s = scanner.nextLine();
        scanner.close();

        int length = lengthOfLastWord(s);
        System.out.println("Length of the last word: " + length);
    }

    public static int lengthOfLastWord(String s) {
        s = s.trim(); // Remove trailing spaces
        int lastSpaceIndex = s.lastIndexOf(' ');
        return s.length() - lastSpaceIndex - 1;
    }
}