public class StringDemo5 {
    public static void main(String[] args) {
        String s1="Hello world";
        System.out.println(s1.indexOf("w"));
        System.out.println(s1.indexOf("o"));
        System.out.println(s1.lastIndexOf("o"));

        System.out.println(s1.substring(2));
        System.out.println(s1.substring(6,s1.length()-1));

        System.out.println(s1.charAt(2));

        System.out.println(s1.subSequence(1, 8));
    }
    
}
