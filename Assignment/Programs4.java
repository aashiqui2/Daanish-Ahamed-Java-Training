
public class Programs4 {
    public static void main(String[] args) {
        String s="abcd";
        String res="";
        for(int i=s.length()-1;i>=0;i--){
            res=res+s.charAt(i);
        }
        System.out.println(res);
    }
}