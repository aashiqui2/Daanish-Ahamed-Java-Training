import java.util.Scanner;
public class Zero {
    public static void main(String []args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter num:");
        int num = sc.nextInt();
        
        int count=0;
        for (int i=num;i>0; i=i/= 10) {
            if (num % 10==0) {
                count++;
            }
        }
        System.out.println(count);
    }
}

