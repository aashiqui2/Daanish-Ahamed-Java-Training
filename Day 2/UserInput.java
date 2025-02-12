import java.util.Scanner;
public class Userinput {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        //integer
        System.out.println("Enter the integer:");
        int a = sc.nextInt();
        System.out.println(a);

        //float
        System.out.println("Enter the float");
        float f=sc.nextFloat();
        System.out.println(f);

        //String
        System.out.println("Enter the String:");
        String s=sc.next();
        System.out.println(s);


    }

    
}
