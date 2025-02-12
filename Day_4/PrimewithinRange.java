import java.util.Scanner;
public class PrimewithinRange {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the start of range:");
        int i = sc.nextInt();
        System.out.println("Enter the end of range:");
        int n = sc.nextInt();
        while(i<=n){
            int div =2;
            boolean isprime = true;
            while(div<=i/2){
                if(i%div==0){
                    isprime=false;
                    break;
                }
                div++;
            }
            i++;
            System.out.print(isprime?i+" ":" ");
        }
    }
}