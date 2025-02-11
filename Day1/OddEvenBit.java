/*
 * The below program is for checking Odd or Even using
 * Manipulation
 */
import java.util.Scanner;

public class OddEvenBit {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Enter Number:");

        int a = scan.nextInt();
        scan.close();
        int check = a & 1;
        String result = (check == 0) ? "even" : "odd";
        System.out.println(result);
    }
}
