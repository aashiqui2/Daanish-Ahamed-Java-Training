public class StringBuilderDemo2 {
    public static void main(String[] args) {
        StringBuilder sb = new StringBuilder("abc");
        sb.insert(3,"pqr");
        System.out.println(sb);
        System.out.println(sb.capacity());
        System.out.println(sb.length());
        

    }
}
