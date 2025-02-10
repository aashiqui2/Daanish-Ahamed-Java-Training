public class StringBuilderDemo2 {
    public static void main(String[] args) {
        StringBuilder sb=new StringBuilder("abc");
        sb.insert(3,"pqr");
        System.out.println(sb);//abcpqr
        System.out.println(sb.capacity());//19
        System.out.println(sb.length());//6

        sb.replace(0, sb.capacity(), "hello world");
        System.out.println(sb);

        sb.delete(0, 5);
        System.out.println(sb);


 
    }
}
