package Day3;

public class SixtyFactors {
    public static void main(String[] args) {
        for (int i = 1; i <= 60/2; i++) {
            if (60 % i == 0) {
                System.out.println(i);
            }
        }
        System.out.println("60");
    }
}
