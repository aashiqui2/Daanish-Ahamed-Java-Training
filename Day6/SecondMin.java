public class SecondMin {
    public static void main(String[] args) {
        int[] a = { 4, 8, 3, 6, 1 };
        // find second minimum
        int first = Integer.MAX_VALUE;
        int second = Integer.MAX_VALUE;

        // int min=a[0];
        for (int i = 0; i < a.length; i++) {
            if (first > a[i]) {
                second = first;
                first = a[i];
            } else if (second > a[i]) {
                second = a[i];
            }
        }
        System.out.println(second);
    }
}
