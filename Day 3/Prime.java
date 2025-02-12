import java.util.Scanner;
public class Prime {
    public static void main(String[] args) {
        int n=11;

        int div=2;
        boolean isprime=true;

        while(div<=n/2){
            if(n%div==0)
            {
                isprime=false;
            }
        }
        if(isprime)
        {
            System.out.println("prime");
        }
        else{
            System.out.println("not a prime");
        }

    }
}
