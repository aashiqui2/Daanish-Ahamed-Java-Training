import java.util.Scanner;
public class UserInput {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the numbers:");

        int a = sc.nextInt();
        // int b = sc.nextInt();
        // float b = sc.nextFloat();
        
        //string
        String b = sc.next();
        
        // System.out.println(a+" "+b);//it cosider next line as a string//
        
        
       // String b = sc.nextLine();
        

        //for charector 
        
        char c = sc.next().charAt(0);
        System.out.println(a+"  "+b+" "+c);
    }    
}
