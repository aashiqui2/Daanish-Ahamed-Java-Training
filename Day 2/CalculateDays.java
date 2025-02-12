 import java .util.scanner;
 public class CalculateDays{
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int days=0;
        System.out.println("Enter the month");
        int month=sc.nextInt();
        Switch(month){
            case 1:
            case 3:
            case 5:
            case 7:
            case 8:
            case 10:
            case 12:days=31;
                    break;
            System.out.println("Enter the year");
            int year=sc.nextInt();
            if(year%4==0&& year %100! || year%400==0)  
            {
                days=29;
            }      
            else{
                days=28;
            }
            break;
         case 4:
         case 6:
         case 9:
         case 11:
         days=30;
         break;
         default: System.out.println("invalid month");
         break;   
        }
    }
 }
    

