import java.util.Scanner;

public class Countofdiv {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        
        System.out.print("Enter a number: ");
        int num = scanner.nextInt();

        int count = 0;
        int i = 1;

        
        while (i <= num) {
            if (num % i == 0) {  
                count++;
            }
            i++;
        }

        
        System.out.println("The number of divisors of " + num + " is: " + count);
        
        scanner.close();
    }
}

