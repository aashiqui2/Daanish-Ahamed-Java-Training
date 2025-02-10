public class StringDemo6 {
    public static void main(String[] args) {
        String s1="     hello world   ";
        System.out.println(s1);
       
        System.out.println( s1.trim());
        //? remove spaces from start and end

        String s2="abc";
        System.out.println(s2.repeat(3));//abcabcabc
    }
}
