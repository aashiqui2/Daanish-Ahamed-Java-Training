package Day3;

public class ReverseANumber {
    public static void main(String[] args) {
        int number=1001;
        int remainder=0;
        int reversed=0;
        while (number!=0) {
            remainder=number%10;
            reversed=reversed*10+remainder;
            number/=10;


        }
        
        System.out.println(reversed);
    }
}
