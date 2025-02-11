package Day4;

import java.util.Scanner;

public class LCM {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter two numbers");
        int a=sc.nextInt();
        int b=sc.nextInt();
        // int count=1;
        int max= (a>b)?a:b;
        // for(int i=2;i<=largest;i++){
        //     if((a%i==0) || (b%i==0)){
        //         count*=i;
                
        //     }
        // }
        // int i=0;
        //a=3, b=2
        while (true) {
            if(max%a==0 && max%b==0){
                System.out.println("LCM is: "+max);
                break;
            }
            max++;
        }
        // System.out.println(count);
    }
}
