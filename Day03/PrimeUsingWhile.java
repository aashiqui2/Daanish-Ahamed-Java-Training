package Day3;

public class PrimeUsingWhile {
    public static void main(String[] args) {
        System.out.println("Hyyyy");
        int n=11;
        int div=2;
        boolean isPrime=true;

        while (div<=n/2) {
            if (n%div==0) {
                isPrime=false;
            }
            
        }

        System.out.println((isPrime)?"It is a Prime Number":"Not a Prime Number");
    }
}
