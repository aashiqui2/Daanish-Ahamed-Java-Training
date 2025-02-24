package Day3;

import java.util.Scanner;

public class CountofDivisor {
    public static void main(String[] args) {
        int count=2;
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter number:");
        int num=sc.nextInt();
        for (int i = 2; i <=num/2; i++) {
            if (num % i == 0) {
                // System.out.println(i);
                count++;
            }
        }
        System.out.println("Count is :"+count);
    }
}
