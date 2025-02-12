public class LCMCalculator {
    // Method to calculate GCD using Euclidean algorithm
    public static int gcd(int a, int b) {
        if (b == 0) {
            return a;
        }
        return gcd(b, a % b);
    }

    // Method to calculate LCM
    public static int lcm(int a, int b) {
        return (a * b) / gcd(a, b);
    }

    public static void main(String[] args) {
        int num1 = 30;
        int num2 = 60;

        int lcmResult = lcm(num1, num2);

        System.out.println("LCM of " + num1 + " and " + num2 + " is: " + lcmResult);
    }
}

