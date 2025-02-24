package Day3;

import java.util.Scanner;

public class NoOfDigits {
    public static void main(String[] args) {
        // Scanner sc=new Scanner(System.in);
        // System.out.println("Enter Number:");
        // int num=sc.nextInt();
        int num=578;
        int count=0;
        // while (num!=0) {
        //     int rem=num%10;
        //     num=num/10;
        //     count++;

        // }
        // System.out.println(count);


        // String num="5678";
        // int strLength=num.length();
        // System.out.println("count is :"+strLength);
        // String numStr=num.toString();

        ///for loop Method
        for(int i=num;i>0;i/=10){
            
            count++;
        }

        System.out.println(count);
    }
}
