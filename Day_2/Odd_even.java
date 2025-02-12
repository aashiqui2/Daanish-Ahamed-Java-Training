import java.util.Scanner;
public class Odd_even {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Enter a number:");
        int a = scan.nextInt();
        if(a%2==0){
            System.out.println(a+" is Even");
        }
        else{
            System.out.println(a+" is Odd");
        }
    }
}
