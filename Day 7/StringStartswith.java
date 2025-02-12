public class StringStartswith {
    public static void main(String[] args) {
        String s1="silence please";
        // System.out.println(s1.startsWith("s"));

        System.out.println(s1.startsWith("please", 8));
        System.out.println(s1.contentEquals(s1));
    }
    
}
