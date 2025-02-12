import java.util.Scanner;
public class Sum_digits {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter n:");
        int n = sc.nextInt();
        int count = 0,rem =0;
        while(n!=0){
            rem = n%10;
            count = count+rem;
            n = n/10;
            
        }
        System.out.println(count);

    }
}
