public class Switch {
    public static void main(String[] args) {
        int a=1;
        switch (a) {
            case 1:
                a++;
                // break;
            case 2:
                ++a;
                // break;
            case 3:
                --a;
                // break;
            default:
                a--;
                // break;
        }

        System.out.println(a);
    }
}
