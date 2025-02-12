import java.util.Scanner;


public class ZeroCntInNum {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int num = sc.nextInt();
        
        int count=0;
        for (; num >0; num /= 10) {
            if (num % 10==0) {
                count++;
            }
        }
        System.out.println(count);
    }
}
    

