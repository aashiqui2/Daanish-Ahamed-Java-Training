public class StringDemo2 {
    public static void main(String[] args) {
        // String s1="abc";
        // String s2="ABC";
        // System.out.println(s1.equalsIgnoreCase(s2));

        String s1="abc";
        String s2="ABC";
        System.out.println(s1.compareTo(s2));
        // return 0 is both the string are same
        // return negative if not same s1<s2
        // return positive if not same s1>s2

        System.out.println(s1.compareToIgnoreCase(s2));
    }
}
