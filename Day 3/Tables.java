import java.util.Scanner;
public class Tables {
    public static void main(String[] args) {
        // System.out.print("Enter need table:");
        Scanner sc = new Scanner(System.in);
        int table = sc.nextInt();
        for (int i = 1; i <= 10; i++) {
            System.out.println(i + "*" + table + "=" + i * table);
        }

        System.out.println(1+"1");
    }
}
