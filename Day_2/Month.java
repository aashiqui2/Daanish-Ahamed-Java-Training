import java.util.Scanner;
public class Month {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int days = 0;
        System.out.println("Enter a month:");
        int month = sc.nextInt();
        switch (month){
            case 1:
            case 3:
            case 5:
            case 7:
            case 8:
            case 10:
            case 12:days = 31;
                    break; 
            case 2:
                System.out.println("Enter the year:");
                int year = sc.nextInt();
                if(year%4==0 && year%100!=0 || year%400==0){
                    days = 29;
                }
                else{
                    days = 28;
                }
                break;
            case 4:
            case 6:
            case 9:
            case 11:days = 30;
                    break;
            default:System.out.println("Invalid entry");
                    break;
                
        }
        System.out.println(days);
    }
}
