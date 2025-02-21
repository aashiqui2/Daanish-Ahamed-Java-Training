


public class MainThread1 {
    public static void main(String[] args) throws InterruptedException{
        ChildTheard c = new ChildTheard();
        c.start();
        System.out.println(c.getState());
        System.out.println(c.getName());
        Thread.yield();
        c.interrupt();
        c.join();
        for(int i= 1;i<=5;i++){
            System.out.println("bye");
        }
        System.out.println(c.getState());
    }
}

class ChildTheard extends Thread{
    @Override
    
    public void run(){
        Thread.yield();
        for(int i= 1;i<=5;i++){
            try{
                Thread.sleep(1000);
            }
            catch(InterruptedException n){
                System.out.println("i am slepping");
            }
            System.out.println("see u later");
        }
        System.out.println(getState());

    }
}
