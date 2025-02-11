import java.util.Scanner;

public class DayNumber {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int dayNumber = sc.nextInt();
        String day = null;
        switch (dayNumber) {
            case 1:
                day = "MONDAY";
                break;
            case 2:
                day = "TUESDAY";
                break;
            case 3:
                day = "WEDNESDAY";
                break;
            case 4:
                day = "THURSDAY";
                break;
            case 5:
                day = "FRIDAY";
                break;
            case 6:
                day = "SATURDAY";
                break;
            case 7:
                day = "SUNDAY";
                break;
            default:
                System.out.println("Invalid Input");
        }

        System.out.println("The day is :" + day);
        sc.close();

    }
}
