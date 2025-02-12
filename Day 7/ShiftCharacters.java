public class ShiftCharacters {
    public static void main(String[] args) {
        String str = "abc";
        int n = 3;

        StringBuilder shifted = new StringBuilder();
        for (char c : str.toCharArray()) {
            shifted.append((char) ((c - 'a' + n) % 26 + 'a'));
        }

        System.out.println("Output: " + shifted.toString());
    }
}
