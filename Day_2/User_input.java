import java.util.Scanner;
public class User_input {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        // integer
        System.out.println("Enter a number:");
        int a = sc.nextInt();
        // Float
        System.out.println("Enter a number:");
        float f = sc.nextFloat();
        // String
        sc.nextLine();
        System.out.println("Enter a string:");
        String s = sc.nextLine();
        System.out.println(a);
        System.out.println(f);
        System.out.println(s);
        
    }
}
