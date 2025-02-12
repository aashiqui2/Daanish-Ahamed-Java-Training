
import java.util.Arrays;

public class StringDemo6 {
    public static void main(String[] args) {
        String s="Hello";
        char c[]=s.toCharcArray();
        for(int i=0;i<c.length;i++)
        {
            System.out.println(c[i]);
        }
        String s1=new String(c);
        System.out.println(s1);
        System.out.println(Arrays.toString(C));
    }
    
}
