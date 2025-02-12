public class Child extends Parent {
    public static void main(String[] args) {
        Child child = new Child();
        child.study();
        child.watching();
    }
    void study(){
        System.out.println("studying java");
    }
    void job(){
        System.out.println("Working as java developer");
    }
}
