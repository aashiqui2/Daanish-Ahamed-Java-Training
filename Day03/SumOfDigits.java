package Day3;

public class SumOfDigits {
    public static void main(String[] args) {
        

         int n=555;
         int digitSum=0;
         int totalDigit=0;
         while (n!=0) {
            digitSum=n%10;
            totalDigit=totalDigit+digitSum;
            n/=10;

         }
         System.out.println(totalDigit);
    }
}
