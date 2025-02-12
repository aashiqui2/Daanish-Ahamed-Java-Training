import java.util.Scanner;
public class Leap_year {
    public static void main(String[] args) {
        Scanner obj= new Scanner(System.in);
        System.out.println("Enter a year:");
        int a = obj.nextInt();
        if(a%4==0 && a%100!=0 || a%400 == 0){
            System.out.println(a+" is a leap year");
        }
        else{
            System.out.println(a+" is not a leap year");
        }
    }
}
