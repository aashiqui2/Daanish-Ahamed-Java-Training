public class Sumofdigit {
    public static void main(String[] args) {
        int n=12345;
        int Sum=Sumofdigit(n);
        
        while(Sum>9)
        {
            Sum=Sumofdigit(Sum);
        }
        System.out.println(Sum);
    }
    public static int Sumofdigit(int n){
    int sum=0;
    while(n!=0){
        int rem=n%10;
        sum+=rem;
        n=n/10;
    }
    return sum;
}
}