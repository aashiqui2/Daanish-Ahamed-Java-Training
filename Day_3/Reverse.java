import java.util.Scanner;
public class Reverse {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("enter n:");
        int n  = sc.nextInt();
        int count = 0,rem=0;

        // for(int i=n;i>0;i=i/10){
        //     count = 
        // }
        while(n!=0){
            rem = n%10;
            count = count*10+rem;
            n=n/10;
        }
        System.out.println(count);
    }
}
