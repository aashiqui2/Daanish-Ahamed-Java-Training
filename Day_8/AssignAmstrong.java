import java.util.Scanner;

public class AssignAmstrong {
    public static boolean arm(int num) {
        int original = num, sum = 0, digits = 0, temp = num;
        while (temp > 0) {
            temp /= 10;
            digits++;
        }
        temp = num;
        while (temp > 0) {
            int digit = temp % 10;
            sum += Math.pow(digit, digits);
            temp /= 10;
        }
        return sum == original;
    }

    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter a number to check if it's Armstrong: ");
        int num = sc.nextInt();
        System.out.println(arm(num) ? "The number is an Armstrong number." : "The number is not an Armstrong number.");

    }
}