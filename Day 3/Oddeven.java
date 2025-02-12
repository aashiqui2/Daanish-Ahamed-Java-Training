public class Oddeven {
    public static void main(String[] args) {
        System.out.println("Odd and Even numbers from 1 to 10:");
        
        for (int i = 1; i <= 10; i++) {
            if (i % 2 == 0) {
                System.out.println(i + " is Even");
            } 
            else {
                System.out.println(i + " is Odd");
            }
        }
    }
}