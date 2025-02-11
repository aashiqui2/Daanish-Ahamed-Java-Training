// package Day6;

public class StringToChar {
    public static void main(String[] args) {
        String s="hello";
        char[] c=s.toCharArray();
        for(int i=0;i<c.length;i++){
            System.out.println(c[i]);
        }
        String str=new String(c);
        
    }
}
