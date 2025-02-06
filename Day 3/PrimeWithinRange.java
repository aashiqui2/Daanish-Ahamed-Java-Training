public class PrimeWithinRange {
    public static void main(String[] args) {
       
        for(int i=2;i<=25;i++)
        {
           boolean isprime=true;
           for(int j=2;j<=i/2;j++){
              if(i%j==0)
              {
                isprime=false;
                break;
              }
           } 
           System.out.print(isprime?i+" ":"");
        }
    }
}
