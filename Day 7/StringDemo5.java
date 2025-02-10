public class StringDemo5 {
    public static void main(String[] args) {
        String s="hello world";

        System.out.println(s.indexOf("orld"));

        System.out.println(s.indexOf("o",5));

        System.out.println(s.indexOf("o"));
        System.out.println(s.lastIndexOf("o"));

        System.out.println(s.substring(2));
        System.out.println(s.substring(6,s.length()-1));

        System.out.println(s.subSequence(-1, 10));
        System.out.println(s.substring(-1,10));
    }
}
