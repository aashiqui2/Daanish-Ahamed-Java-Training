package Day7;

public class StringMethods3 {
    public static void main(String[] args) {
        String s1="hello";
        System.out.println(s1.contentEquals("hello"));
        System.out.println(s1.equals("hello"));

        String newStr="today is Monday";
        System.out.println(newStr.contains("is"));
    }
}
