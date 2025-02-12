public class Stringbuilderdemo1 {
    public static void main(String[] args) {
        StringBuilder sb=new StringBuilder("abc");
        System.out.println(sb);
        sb.replace(0,sb.capacity(),"hello world");
        System.out.println(sb);
        System.out.println(sb.length());
        sb.replace(0)
    }
    
}
