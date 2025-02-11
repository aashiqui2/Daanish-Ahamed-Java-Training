package Day4;

import java.util.Scanner;

public class SquareRoot {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the number:");
        int n=sc.nextInt();
        // int sqrr= (int)Math.sqrt(n);

        // System.out.println(sqrr);
        int div=2; // start from 2, bcz, 1 is factor of all.
        while(div<=n/2){
            if(n/div==div){
                System.out.println(div);
                break;
            }
            div++;
        }
        //this program only work for perfect squares.
        sc.close();
    }
}
