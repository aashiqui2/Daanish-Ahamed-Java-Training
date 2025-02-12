import java.util.Scanner;
public class Digit {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.print(" Enter the number:");
        int n=sc.nextInt();
        int count=0;
        // while (n!=0) {
        //     int rem=n%100;//8//7//6//5
        //     count++;//1//2//3//4
        //     n=n/10;//567//56/5/0
            
        // }
        for(int i=n;i>0;i=i/10){
            count++;

        }
        System.out.println(count);
    }
    
}
