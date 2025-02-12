package tamilnade.chennai;
public class Office {
    public Office(){
        System.out.println("Welcome to Office");
    }
    public static void main(String[] args) {
        Office off = new Office();
        off.work();
        off.do_planning();
    }
    public void work(){
        System.out.println("Working in office");
    }
    void wfh(){
        System.out.println("Working in home");
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
