// package Assignments;

public class NeonNumber {
    public static void main(String[] args) {
        int n=9;
        int sqr=n*n;
        int temp=sqr;
        int rem=0,sum=0;
        
        while (temp!=0) {
            rem=temp%10;
            sum+=rem;
            temp/=10;

        }
        System.out.println(sum);
    }
}
