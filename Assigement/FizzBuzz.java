import java.util.Scanner;

public class FizzBuzz {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        int a = s.nextInt();
        for(int i = 1;i<=a;i++){
            if(i%3==0 & i%5==0){
                System.out.println("FizzBuzz");
            }
            else if(i%3==0){
                System.out.println("Fizz");
            }
            else if(i%5==0){
                System.out.println("buzz");
            }
            else{
                System.out.println(i);
            }
    }
    }
}
