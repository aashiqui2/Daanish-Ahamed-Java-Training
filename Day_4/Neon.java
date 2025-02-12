public class Neon{
    public static void main(String[] args) {
        int n=9,rem=0;
        int sq=n*n,sq1=0;
        while(sq!=0){
            rem=sq%10;
            sq1=sq1+rem;
            sq=sq/10;
        }
       System.out.println((sq1==n)?"Yes":"No");
    }
}
