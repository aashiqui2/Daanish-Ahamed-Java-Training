import java.util.Scanner;

public class UserInput {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        // integer
        System.out.println("Enter the Integer");
        int a = sc.nextInt();
        

        // float
        System.out.println("Enter the Float Value");
        float f = sc.nextFloat();
        System.out.println(f);

        // String
        System.out.println("Enter String");
        // sc.nextLine();
        String s= sc.nextLine();
        System.out.println(a);
        System.out.println(s);

sc.close();
    }
}
