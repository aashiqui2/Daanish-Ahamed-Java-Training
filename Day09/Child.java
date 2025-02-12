// package Day09;

public class Child extends Parent{
    public static void main(String[] args) {
        Child ch = new Child();
        ch.study();
        ch.watch();
    }
    void study(){
        System.out.println("study java");
    }
    void job(){
        System.out.println("work");
    }
}
