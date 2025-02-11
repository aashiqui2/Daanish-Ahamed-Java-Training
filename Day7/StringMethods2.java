package Day7;

public class StringMethods2 {
    public static void main(String[] args) {
        String s1="silence please! don't talk";
        System.out.println(s1.startsWith("sile"));
        System.out.println(s1.startsWith("please"));
        System.out.println(s1.startsWith("please",8));
        //8 denotes the index value, where have to start

        System.out.println(s1.endsWith("k"));
    }
}
