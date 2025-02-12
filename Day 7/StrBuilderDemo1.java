public class StrBuilderDemo1 {
    public static void main(String[] args) {
        String s="hello";
        StringBuilder sb=new StringBuilder(s);

        sb.append("world");

        sb.toString();
        System.out.println(s);

        StringBuilder sb1=new StringBuilder("cat");
        sb.reverse();
        System.out.println(sb1);
        }
}
