// package Day9;

public class Child extends Parent{
    public static void main(String[] args) {
        Child c=new Child();
        c.study();
        c.job();
        c.watching();
        //these methods got overriden 
    }
    void study(){
        System.out.println("studying Java Programming");
    }
    void job(){
        System.out.println("working as a developer");
    }
}
