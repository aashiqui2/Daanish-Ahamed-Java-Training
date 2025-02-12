public class StrDemo4 {
    public static void main(String[] args) {
        String s="hello world";

        System.out.println(s.indexOf("o"));

        System.out.println(s.indexOf("o",5));

        System.out.println(s.lastIndexOf("o"));

        System.out.println(s.substring(2));
        System.out.println(s.substring(7,s.length()-1));

        System.out.println(s.charAt(7));

        System.out.println(s.subSequence(2,6));
    }
}
