package tamilnadu.chennai;
public class Office {
    final int salary = 45000;
    public Office(){
        System.out.println("Welcome");
    }
    

    public static void main(String[] args) {
        Office off=new Office();
        off.work();
        off.do_business_plan();

    }

    public void work() {
        System.out.println("working in office");
    }

    public void wfm() {
        System.out.println("working in home");
    }

    void do_business_plan() {
        System.out.println("planning ....");
    }
}
