import java.util.Scanner;

public class Vouvle {
    public static void main(String[] args) {
        System.out.print("Enter the alphabet: ");
        Scanner sc = new Scanner(System.in);
        char c= sc.next().charAt(0);

         if (c=='a'||c=='e'||c=='i'||c=='o'||c=='u'){
            System.out.println("its a vouvle");
         }
         else{
            System.out.println("it's not a vouvle");
         }
    }
}
