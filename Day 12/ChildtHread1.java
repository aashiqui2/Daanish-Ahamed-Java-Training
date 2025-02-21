class ChildThread1 extends Thread {
    @Override
    public void run() {
        Thread.yield();
        for (int i = 1; i <= 5; i++) {
            try{
                Thread.sleep(1000);
                System.out.println("Childthread " + i);
            }
            catch(InterruptedException ie)
            {
                System.out.println("intruppted my sleep");
            }
        }
    }
}