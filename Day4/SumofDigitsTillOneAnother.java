package Day4;

import java.util.Scanner;

public class SumofDigitsTillOneAnother {
    public static void main(String[] args) {
        // int n=12345;
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the number pleaseeee..");
        int n=sc.nextInt();
        int sum=sumOfDigit(n);

        while (sum>9) {
            sum=sumOfDigit(sum);
        }

        System.out.println("sum is "+sum);
    }

    public static int sumOfDigit(int n){
        int sum=0;
        while (n!=0) {
            int rem=n%10;
            sum=sum+=rem;
            n/=10;
        }
        // System.out.println(sum);
        return sum;
    }


}
