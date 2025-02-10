public class StringBuilderDemo {
    public static void main(String[] args) {
        String s = "hello";// scp ,immutable
        // StringBuilder sb=new StringBuilder("abc");
        // StringBuilder sb1="abc"; // not a valid way

        // String s1="abc";
        // String s2=s1;
        // s1="pqr";
        // System.out.println(s1==s2);

        StringBuilder sb = new StringBuilder("abc");
        StringBuilder sb1 = new StringBuilder("abc");
        System.out.println(sb == sb1);
        System.out.println(sb.equals(sb1));
        sb.append("abc");
    }

}
