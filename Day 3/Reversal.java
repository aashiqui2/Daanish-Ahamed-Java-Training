import java.util.Scanner;

public class Reversal {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the number:");
        int n=sc.nextInt();//123
        int sum=0;
        int rem=0;

        // while(n!=0){
        //     rem=n%10;
        //     sum=sum*10+rem;//321
        //     n=n/10;//12


        // }
        // System.out.println(sum);

        while(n!=0){
            rem=n%10;//3
            sum=sum+rem;//3
            n=n/10;//12


        }
        System.out.println(sum);


    }
    
}
