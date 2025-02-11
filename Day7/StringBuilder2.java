package Day7;

public class StringBuilder2 {
    public static void main(String[] args) {
        String s="hellos";
        StringBuilder sb=new StringBuilder(s);
        sb.append(" world");
        s =sb.toString();
        System.out.println(s);
        StringBuilder sb1=new StringBuilder("cat");
        sb1.reverse();
        System.out.println(sb1);

        StringBuilder sb2= new StringBuilder("muhammad");
        sb2.insert(8," P");
        System.out.println(sb2);
        sb.replace(0,  sb.capacity(),"Hel");
        System.out.println(sb);
        System.out.println(sb.capacity());
    }
}
