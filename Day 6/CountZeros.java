class CountZeros {
    public static int countZeros(int num) {
        int count = 0;
        while (num > 0) {
            if (num % 10 == 0) {
                count++;
            }
            num /= 10;
        }
        return count;
    }

    public static void main(String[] args) {
        System.out.println("Number of zeros: " + countZeros(1020304050)); // Output: 4
    }
}