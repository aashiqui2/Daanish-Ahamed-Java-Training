public class CountZeros {
    public static void main(String[] args) {
        int number = 1020304050; // Change this number to test with different values
        System.out.println("Number of zeros: " + countZeros(number));
    }

    public static int countZeros(int number) {
        int count = 0;
        while (number != 0) {
            if (number % 10 == 0) {
                count++;
            }
            number /= 10;
        }
        return count;
    }
}

