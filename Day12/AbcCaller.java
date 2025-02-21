
public class AbcCaller extends Abc{
    public static void main(String[] args) {
        Abc a = new Abc();
        a.display();
        a.start();
 
    }
    void display(){
        System.out.println("From Abc Cller");
    }
}
class Abc extends Thread{
    // void start(){
    //     display();
    // }
    void display(){
        System.out.println("From Abc");
    }
}
