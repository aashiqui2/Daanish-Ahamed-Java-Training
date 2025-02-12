package tamilnadu.chennai;
public class Office {
    final int salary=45000;
    public Office(){
        System.out.println("welcome to office");
    }
    public static void main(String[] args) {
        Office off=new Office();
        off.work();
        //off.salary=50000 cannot be done since final is been provided

    }public void work(){
        System.out.println("working in office");
    }
    void recruit(){
        System.out.println("recruitment");
    }
    protected void wfm(){
        System.out.println("working in home");
    }
    private void do_business_plan(){

    }
    
    
}
