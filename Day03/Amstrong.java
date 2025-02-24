import java.util.Scanner;

public class Amstrong {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int sum = 0;
        int b;
        int i = a;
        int r ;
        while ( i!= 0) {
            
            r =i%10;
            b = r*r*r ;
            sum = sum + b ;
            i = i/10;
            
        }
        // System.out.println(sum);
        if(a==sum){
            System.out.println("its a Amstrong");
        }
        else{
            System.out.println("Not a Amstrong");
        }
        sc.close();
    }

}
