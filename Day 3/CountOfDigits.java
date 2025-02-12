import java .util.Scanner; 
public class CountOfDigits {
    public static void main(String[] args) {
        Scanner sc =new Scanner(System.in);
        int n = sc.nextInt();
        int n = 5678,count=0;

        while(n!=0)
        {
            int rem=n%10;//8
            count++;//1//2
            n=n/10;//567//56//5
        }
        System.out.println(count);
        //for(int i=n;i>0;i=i/10)
        //
    }
}
