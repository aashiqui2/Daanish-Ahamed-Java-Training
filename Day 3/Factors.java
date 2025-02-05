import java.util.Scanner;

public class Factors {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        // for (int i = 2; i <= n / 2; i++) {
        // if(n%i==0)
        // {
        // System.out.print(i+" ");
        // }
        // }

        int count=0;
        for (int i = 2; i <= n / 2; i++) {
            if (n % i == 0) {
                count++;
            }
        }
        System.out.println(count);
    }
}
