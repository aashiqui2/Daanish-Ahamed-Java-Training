public class MainThread1 {
    public static void main(String[] args) throws InterruptedException {
        ChildThread1 ct1 = new ChildThread1();
        ct1.start();
        System.out.println(ct1.getState());
        System.out.println(ct1.getName());
        ct1.interrupt();
        ct1.join();
        for (int i = 1; i <= 5; i++) {
            System.out.println("Mainthread " + i);
        }
        System.out.println(ct1.getState());
    }
}


