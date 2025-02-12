public class Stringdemo3
 {
    public static void main(String[] args) {
        String s="hello world";
        System.out.println(s.substring(2));
        System.out.println(s.substring(6,s.length()));
        System.out.println(s.subSequence(-1,10));
        System.out.println(s.substring(-1,10));
        System.out.println(s.trim());
        System.out.println(s.repeat(3));


    }
    
    
}
