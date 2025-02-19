
public interface Contract1 {
    default void calculate(int a, int b) {
        System.out.println(a + b);
    }
}
