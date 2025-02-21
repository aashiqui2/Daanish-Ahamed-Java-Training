// package Day12;

public class MainTheard {
    public static void main(String[] args) {
    ChildTheard c = new ChildTheard();
    // ChildTheard c1= new ChildTheard(); 
    // c.run();
    System.out.println(c.getState()); 
     
    System.out.println(c.getName());
    c.start(); 
    c.setName("Tread1");
    System.out.println(c.getName());
    System.out.println(c.getState());


    c.setPriority(1);
    
    // Abc a = new Abc();
    // System.out.println(a.getState());
    // a.start();
    

    for(int i=1;i<=5;i++){
        System.out.println("Main Thread");
    }
    System.out.println(c.getState());  
    }

}
class ChildTheard extends Thread{
    
    // @Override
    public void run(){
        for(int i =1;i<=5;i++){
            System.out.println("hello");
        }

    }
}
