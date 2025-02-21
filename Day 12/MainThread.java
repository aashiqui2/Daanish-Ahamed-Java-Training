public class MainThread {
    public static void main(String[] args) {
        ChildThread ct= new ChildThread();
        System.out.println(ct.getState());//new
        // ct.run();
        ct.start(); //new thread created
        System.out.println(ct.getState());//runnable
        System.out.println(ct.getName());//Thread-0
        ct.setName("practice thread");
        System.out.println(ct.getName());
        System.out.println(ct.getPriority());//5
        // ct.setPriority(11);
        // Abc abc= new Abc();
        // System.out.println(abc.getState());
        // abc.start();
        // System.out.println(abc.getState());
       
        for(int i=1;i<=5;i++)
        {
            System.out.println("MainThread "+ i);
        }
        System.out.println(ct.getState());
    }
}

class ChildThread extends Thread{
    // start()
    // run()
    @Override
    public void run()
    {
        // Thread.yield();
        for(int i=1;i<=5;i++)
        {
            System.out.println("Childthread "+ i);
        }
    }
}

// for()
// run()           for()
// main()          run()
// single thread  child thread