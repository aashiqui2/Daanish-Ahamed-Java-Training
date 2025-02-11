package Day7;

public class StringBuilderDemo {
    public static void main(String[] args) {
        String s="hello"; //scp, immutable
    StringBuilder sb=new StringBuilder("abc");

    // System.out.println("Hi");
    String s1="abcd";
    String s2=s1;
    s1="abcd";
    System.out.println(s1==s2);
    StringBuilder sb1=new StringBuilder("abc");
    StringBuilder sb2=new StringBuilder("abc");

    System.out.println(sb1==sb2);
    System.out.println(sb1.equals(sb2));
    }

    
    



}
