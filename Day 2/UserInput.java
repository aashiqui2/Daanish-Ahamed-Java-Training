import java.util.Scanner;
public class UserInput {
        public static void main(String[] args) {
            Scanner sc=new Scanner(System.in);
            //integer
            int a = sc.nextInt();
            System.out.println("Enter the integer");
            //float
            float f=sc.nextFloat();
            System.out.println("Enter the float");
            System.out.println(a);
            System.out.println(f);
        }
}