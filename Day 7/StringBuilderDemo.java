public class StringBuilderDemo {
    public static void main(String[] args) {
        StringBuilder sb= new StringBuilder("abc");
        StringBuilder sb1 = new StringBuilder("abc");
        System.out.println(sb==sb1);
        System.out.println(sb.equals(sb1));
        sb.append("abc");

    }
}
