// import java.util.Scanner;
public class Prime {
    public static void main(String[] args) {
        // Scanner sc = new Scanner(System.in);
        // System.out.println("Enter n:");
        // int n = sc.nextInt();
        int n = 11;
        int div = 2;
        boolean isprime = true;
        while(div<=n/2){
            if(n%div==0){
                isprime = false;
            }
        }
        if(isprime){
            System.out.println("Prime number");
        }
        else{
            System.out.println("Not a prime no");
        }
        
        
    }
    
}
