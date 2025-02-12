import java.util.Scanner;

public class AssignReverse {
    public static int rev(int num) {
        int reversed = 0;
        while (num != 0) {
            int digit = num % 10;
            reversed = reversed * 10 + digit;
            num /= 10;
        }
        return reversed;
    }
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        // Reverse number test
        System.out.print("Enter a number to reverse: ");
        int num = scanner.nextInt();
        System.out.println("Reversed number: " + rev(num));

    }
}
