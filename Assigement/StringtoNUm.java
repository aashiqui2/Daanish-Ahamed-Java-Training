

public class StringtoNUm {
    public static void main(String[] args) {
        // char[] c = {'a','b','z'};  
        String s="abz";
        char[] c = s.toCharArray();  
        int index = 2;
        // System.out.println(as);
        for(int i =0;i<c.length;i++){
         int as = (int) c[i];   
         as = as+index;
         if(as>122){
            as-=26;
         }
         char ch = (char)as;
        System.out.print(ch);
        }
}
}