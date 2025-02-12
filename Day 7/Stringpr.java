public class Stringpr {
    public int lengthOfLastWord(String s) {
        s = s.trim(); // Remove leading and trailing spaces
        int lastSpaceIndex = s.lastIndexOf(" ");
        return s.length() - lastSpaceIndex - 1;
    }

    public static void main(String[] args) {
        Stringpr solution = new Stringpr();
        String s = "Hello World";
        System.out.println(solution.lengthOfLastWord(s)); // Output: 5
    }
}