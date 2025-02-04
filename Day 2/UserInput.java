import java.util.Scanner;

public class UserInput {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        //int
        int a = sc.nextInt();
        System.out.println(a);

        // float
        float f=sc.nextFloat();
        System.out.println(f);

        // String 
        String s1=sc.next();//for one word
        System.out.println(s1);

        String s2=sc.nextLine();
        System.out.println(s2);

        // char 
        char c=sc.next().charAt(0);
        System.out.println(c);


    }
}