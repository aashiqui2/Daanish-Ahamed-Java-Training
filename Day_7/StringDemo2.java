public class StringDemo2 {
    public static void main(String[] args) {
        // String s1 = "abc";
        // String s2 = "ABC";
        // System.out.println(s1.equalsIgnoreCase(s2));

        String s1 ="ABC";
        String s2 ="abc";
        System.out.println(s1.compareTo(s2));
        // return 0 if both the Strings are same
        // return -ve if not same s1<s2
        // return +ve if not same s1>s2
        System.out.println(s1.compareToIgnoreCase(s2));

    
    
    }
   
}
