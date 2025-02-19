
// public package Day10;

public interface InnerInterf {
    public static void main(String[] args) {
        System.out.println("hello");
    }
    default void display(){
        System.out.println("from display");
    }
    static void prin(){
        System.out.println("from print");
    }
    default void sum(int a , int b){
        System.out.println(a-b);
    }

    void result(); //public abstract because of semicolin


    //we can also have main method,static method in pakage after from java8
}
