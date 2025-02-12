public class new {
    public static String reverseSentence(String s) {
        String[] words = s.split(" ");
        StringBuilder result = new StringBuilder();

        for (int i = words.length - 1; i >= 0; i--) {
            result.append(words[i]).append(" ");
        }

        return result.toString().trim();
    }

    public static void main(String[] args) {
        System.out.println(reverseSentence("Today is Holiday")); // Output: "Holiday is Today"
    }
}
