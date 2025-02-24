import java.util.Scanner;

public class Amstrong {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int num = sc.nextInt();
        
        int count=0;
        int rem = num ;
        for(int i = num;i>0;i=i/10){
            // num=num/10;
            count++;
        }
        while (( rem!=0)) {
            
             temp=rem%10;
            rem = rem+(int)Math.pow(rem,count); 
            rem=rem/10;
        }
        System.out.println(num==rem ? "amstrong":"not a amstrong) ");
       
    }
}
