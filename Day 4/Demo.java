public class Demo {
    public static void main(String[] args) {
        for (int i = 0; i < 10; i++) {
            for (int j = 1; j <= 10; j++) {
                if (j == 7) {
                    break;
                }
                System.out.println("the value of j"+j);
            }
            System.out.println("The value of i "+i);
        }
    }
}
