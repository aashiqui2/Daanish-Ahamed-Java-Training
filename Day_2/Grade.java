import java.util.Scanner;
public class Grade {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Enter your Marks to get Grade:");
        int mark = scan.nextInt();
        
    switch (mark) {
        case 1:
            System.out.println("Your Grade is A");
            break;
        case 2:
            System.out.println("Your grade is B");
            break;
        case 3:
            System.out.println("Your grade is C");
            break;
        case 4:
            System.out.println("Your grade is D");
    
        default:
            System.out.println("You have no grade");
            break;
    }
        
    }
}
