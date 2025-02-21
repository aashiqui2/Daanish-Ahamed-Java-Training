public class AbcCaller extends Abc {
    public static void main(String[] args) {
        // Abc abc= new Abc();
        AbcCaller abc= new AbcCaller();
        abc.start();
    }
    void display()
    {
        System.out.println("i am from abc Caller class");
    }
}
class Abc extends Thread{

    // void start(){
    //     display();
    // }

    void display()
    {
        System.out.println("i am in abc class");
    }
}
