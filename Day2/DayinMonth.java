import java.util.Scanner;

public class DayinMonth {
    public static void main(String[] args) {
        System.out.print("Enter the month 1 to 12: ");
        Scanner sc = new Scanner(System.in);
        int month = sc.nextInt();
        if(month>12){
            System.out.println("Invalid input");
        }

        switch (month) {
            case 1:
            case 3:
            case 5:
            case 7:
            case 8:
            case 10:
            case 12:
                System.out.println("31 days");
                break;
            case 4:
            case 6:
            case 9:
            case 11:
                System.out.println("30 days");
                break;
            case 2:
                System.out.print("Enter the year: ");
                int year = sc.nextInt();     
                if(year%4==0 && year%100!=0 || year%400==0){ //orelse(year%4==0 && year%100!=0 || year%400==0)?(29 days):(28 days)
                    System.out.print("29 days");
                } 
                else{
                    System.out.println("28 days");
                }
               break;  
                
        }
    }

}
