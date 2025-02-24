

public class StringtoNUm {
    public static void main(String[] args) {
        // char[] c = {'a','b','z'};  
        String s="z";
        char[] c = s.toCharArray();  
        int index = 2;
        // System.out.println(as);
        for(int i =0;i<c.length;i++){
         int as = (int) c[i];
         int a = as;
        //  System.out.println(as);   
         as = as+index;
        //  System.out.println(as);
         if(as>122){
            if(a<90){
                a-=26;
            }
            as-=26;
         }
            
        
        char ch = (char)as;
        System.out.print(ch);
        }
    }
}