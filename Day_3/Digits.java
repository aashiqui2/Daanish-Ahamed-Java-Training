import java.util.Scanner;
public class Digits {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter n:");
        int n = sc.nextInt();
        int count = 0;
        // while(n!=0){
        //     int rem = n%10;
        //     count++;
        //     n=n/10;
        // }
        for(int i=n;i>0;i=i/10){
            count++;
        }
        System.out.println(count);
    }
}
