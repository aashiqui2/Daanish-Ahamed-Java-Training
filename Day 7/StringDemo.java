import javax.print.DocFlavor.STRING;

public class StringDemo {

    public static void main(String[] args) {
        String s="hello";
        System.out.println(s.length());

        String s1="ad";
        System.out.println(s1.isBlank());
        //? return true if the string is empty or contains whitespace

        String s2="";
        System.out.println(s2.length());
        System.out.println(s2.isEmpty());
        //? return true if length is 0
    }
}