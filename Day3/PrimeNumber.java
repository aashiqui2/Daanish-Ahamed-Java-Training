package Day3;

import java.util.Scanner;

public class PrimeNumber {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the number");
        int n=sc.nextInt();
        if(n==2){
            System.out.println("Prime");
        }else if(n<2){
            System.out.println("no prime less than 2");
        }
        else{

            for(int i=2;i<n;i++){
                if(n%i==0){
                    System.out.println("not Prime");
                    break;
                }else{
                    System.out.println(" prime");
                    break;
                }
            }
        }
    }
}
