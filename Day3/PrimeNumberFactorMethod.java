package Day3;

import java.util.Scanner;

public class PrimeNumberFactorMethod {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);

        int n=sc.nextInt();
        int factor=0;
        for(int i=1;i<=n;i++){
            if(n%i==0){
                factor++;
            }   
        }

        System.out.println("Heyyyy");
        System.out.println((factor>2)?"Not Prime":"Prime");
    }
}
// dhjadxzwic