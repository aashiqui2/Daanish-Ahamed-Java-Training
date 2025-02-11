package Day7;

public class StringMethods4 {
    public static void main(String[] args) {
        String s = "HELLO WORLD";
        System.out.println(s.indexOf("orld"));
        System.out.println(s.indexOf(68, 5)); // unicode of D is 68
        System.out.println(s.lastIndexOf("o"));
        System.out.println(s.substring(6,s.length()));
        // System.out.println(s.subSequence(-1, 10));
        // System.out.println("helllooooo");

        String another=" hello world    ";
        String aa=another;
        System.out.println(another);
        System.out.println(aa.trim());
        
        System.out.println(aa.repeat(10));
    }
}
