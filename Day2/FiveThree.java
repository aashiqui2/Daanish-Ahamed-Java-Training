import java.util.Scanner;

public class FiveThree {

    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int num=sc.nextInt();
        if(num%3==0 && num%5==0){
            System.out.println("number divisble by 5&3");
        }else{
            System.out.println("not diviisble by 5 ,3");
        }

        sc.close();
    }
}