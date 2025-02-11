package Day4;

public class AmstrongOther {
    public static void main(String[] args) {
        int n=153;

        int count=0;
        for(int i=n;i>0;i=i/10){
            count++;
        }
        int rem=0,result=0;
        int temp=n;

        while (temp!=0) {
            rem=temp%10;
            result=result+(int)Math.pow(rem, count);
            temp/=10;
        }

        System.out.println((n==result)?"Armstrong":"Not Armstrong");
    }
}
