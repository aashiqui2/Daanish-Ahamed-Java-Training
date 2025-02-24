package Day3;

public class PrimeNumberRange {
    static boolean isPrime(int n){
        int factor=0;
        for(int i=1;i<=n;i++){
            if(n%i==0){
                factor++;
            }
        }
        return ((factor>2)?false:true);
    }
    public static void main(String[] args) {
        int range=100;
        int factor=0;
        for(int i=2;i<range;i++){
            if (isPrime(i)) {
                System.out.println(i);
            }
        }

    }
}