
public class Reverse {
   public static void main(String[] args) {
       int a = 1234;
       System.out.println(rev(a));
   }
   static int rev(int n){
      int rev =0;
      while ((n>0)) {
       int rem =n%10;

       rev= rev*10+rem;
       n = n/10;
       
      }
      return rev;

   }
   
}