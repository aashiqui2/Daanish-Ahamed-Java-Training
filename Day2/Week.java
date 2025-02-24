import java.util.Scanner;

public class Week {
    public static void main(String[] args) {
        System.out.print("Enter the nunmber 0 to 7:");
        Scanner sc = new Scanner(System.in);
        int day = sc.nextInt();
        if(day>7){
            System.out.println("Invalid input");
        }

        switch (day) {
            case 1:
                System.out.println("Monday");
                break;
            case 2:
                System.out.println("Tuesday");
                break;
            case 3:
                System.out.println("Wednesday");
                break;
            case 4:
                System.out.println("Thursday");
                break;
            case 5:
                System.out.println("Friday");
                break;
            case 6:
                System.out.println("Saturday");
                break;
            case 7:
                System.out.println("Sunday");
                break;        
            default:
                break;
        }
    }

}
