import java.util.function.Predicate;

public class TicketBooking {
    public static void main(String[] args) {
        // TicketBooking tb = new TicketBooking();
        // System.out.println(tb.Test(65));

        // Predicate<Integer> p = (amount) -> (amount > 60);
        // System.out.println(p.test(65));

        int a[] = { 2, 4, 5, 6, 7, 8, 10, 12, 11 };
        Predicate<Integer> p = (n) -> (n % 2 != 0);
        Predicate<Integer> p1 = (n) -> (n < 10);
        // check(p, a);
        // check(p1, a);
        // or,negate,and
        check(p.and(p1),a);
    }

    public static void check(Predicate<Integer> p, int a[]) {
        for (int i : a) {
            boolean result = p.test(i);
            if(result)
            {
                System.out.print(i+" ");
            }
        }
    }

    // public boolean Test(int amount) {
    // if (amount > 60) {
    // return true;
    // } else {
    // return false;
    // }
    // }
}
