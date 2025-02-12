public class StringBuffer {
    public static void main(String[] args) {
        String s1="mufn";
        String s2=s1;
        s1="pqrs";
        System.out.println(s1==s2);

        StringBuilder sb=new StringBuilder("abc");
        StringBuilder sb1=new StringBuilder("abc");
        System.out.println(sb == sb1);
        System.out.println(sb.equals(sb1));
        sb.append("abc");




        
    }

    
}