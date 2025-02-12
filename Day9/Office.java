package tamilnadu.chennai;
public class Office{
    public Office(){
        System.out.println("Welcome to Office");
    }
    public static void main(String[] args) {
        Office off=new Office();
        off.work();
        off.do_planning();
    }
    void work(){ // package private
        System.out.println("Working in Office   ");
    }
    public void wfh(){
        System.out.println("working from Home");
    }
    public void recruit(){
        System.out.println("recruitment");
    }
    void get_travel_allowance(){
        System.out.println("got money");
    }
    private void do_planning(){
        System.out.println("Planning");
    }
}