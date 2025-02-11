package Day4;
public class SumofDigitsTillOne {
    public static void main(String[] args) {


        int num=129;
        int count=0;
        int rem=0;
        int n=num;

        

        // int n=555;
         int digitSum=0;
         int totalDigit=0;
         while (n!=0) {
            digitSum=n%10;
            totalDigit=totalDigit+digitSum;
            n/=10;

    }

    while (totalDigit!=0) {
        rem=n%10;
        count++;
        totalDigit/=10;

    }

    if(count>1)

        System.out.println(totalDigit);
}

}
