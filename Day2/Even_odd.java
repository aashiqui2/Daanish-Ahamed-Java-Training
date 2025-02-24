import java.util.Scanner;

public class Even_odd {
    public static void main(String[] args) {
        int num;
        System.out.print("Enter the number;");
        Scanner sc = new Scanner(System.in);
        num = sc.nextInt();
        if (num % 2 == 0) {
            System.out.println("Even");
        } else {
            System.out.println("Odd");
        }
    }

}
