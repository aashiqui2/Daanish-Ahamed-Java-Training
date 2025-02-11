package Day7;

public class StringMethods {
    public static void main(String[] args) {
        String s = "hello";
        String s1 = "";
        // return string length
        System.out.println(s.length());
        // return true if the string is blank, (length is 0 or contains only whitespace)
        System.out.println(s1.isBlank());

        // return true if the String length is 0.
        System.out.println(s1.isEmpty());
        String s3 = "Jav";
        s3 += "a";
        System.out.println(s3); // Java
        String s5 = new String("abc");
        String s6 = new String(s5);
        System.out.println(s5 == s6); // false
        System.out.println(s5.equals(s6)); // true

        //equalsIgnoreCase
        String s10="abc";
        String s11="ABC";
        System.out.println(s10.equalsIgnoreCase(s11));

        //compare to
        String a="abc";
        String b="ABC";
        //return 0 if both the string are same
        //return negative if not same s1<s2
        //return positive if noot same s1>s2

        System.out.println(a.compareTo(b));
        System.out.println(a.compareToIgnoreCase(b));
    }
}
