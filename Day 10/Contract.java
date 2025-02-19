public interface Contract {
    public static void main(String[] args) {
        System.out.println("hello");
    }

    static void print() {
        System.out.println("i am from print");
    }
    
    default void display() {
        System.out.println("i am from display");
    }


    default void calculate(int a, int b) {
        System.out.println(a - b);
    }

    public abstract void result();
    
    // defendender methods or virtual extension methods
    // ! we can also have main method in the interafce after java version 8
    // we can have static and non-static(default) method in interface
    // backward compatability
    // we can override the default methods in the interface
}
