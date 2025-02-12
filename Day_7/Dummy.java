public class Dummy {
    public static String shiftString(String str, int n) {
        StringBuilder result = new StringBuilder();
        for (char c : str.toCharArray()) {
            result.append((char) (c + n));
        }
        return result.toString();
    }

    public static void main(String[] args) {
        System.out.println(shiftString("abc", 3)); // Output: "def"
    }
}
