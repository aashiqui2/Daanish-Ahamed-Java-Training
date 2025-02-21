import java.util.Arrays;

public class ArrDemo {
    public static void main(String[] args) {
        int a[] = { 3, 0, 4, 5, 0, 1, 2 };
        int index = 0;

        for (int i = a.length; i < a.length; i++) {
            if (a[i] != 0) {
                a[i] = a[i + 1];
                a[i + 1] = 0;
            }
            if (a[i] == a[i + 1]) {

            }

            System.out.println(Arrays.toString(a));

        }
    }
}
