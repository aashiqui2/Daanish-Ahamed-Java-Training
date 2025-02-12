import java.util.Scanner;
 public class SumofDigits {
    public static void main(String[] args) {
        Scanner sc =new Scanner(System.in);
        int n =sc.nextInt();
        int sum=0;
        int rem=0;
        while (n!=0) {
            rem=n%10;
            sum=sum+rem;
            n=n/10;
        }
        System.out.println(sum);
        
    }
}
