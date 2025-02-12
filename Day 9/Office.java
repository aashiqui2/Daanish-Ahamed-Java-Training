package tamilnadu.chennai;
public class Office {
    public Office(){
        System.out.println("welcome to Office");
    }
    public static void main(String[] args) {
        Office off=new Office();
        off.work();
        off.do_planning();
    }

    void work()//package private
    {
        System.out.println("working in Office");
    }
   public void wfh()
    {
        System.out.println("working in home");
    }
    public void recruit()//package private
    {
        System.out.println("recruitment");
    }
    void get_travel_allowance()
    {
        System.out.println("got money");
    }
    private void do_planning()
    {
        System.out.println("planning....");
    }
}
