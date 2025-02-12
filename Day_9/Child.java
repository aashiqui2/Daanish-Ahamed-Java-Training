public class Child extends Parent {
    public static void main(String[] args) {
        Child child=new Child();
        child.study();
        child.watching_tv();

    }
    protected void study(){
        System.out.println("Studying java");
    }
    void job(){
        System.out.println("Working");
    }
    void watching_tv(){
        System.out.println("Watching KNY");
    }
}
