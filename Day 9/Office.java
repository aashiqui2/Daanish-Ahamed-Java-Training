package tamilnadu.chennai;
public class Office {
    Office(){
        System.out.println("welcome to office");
    }
    public static void main(String[] args) {
        Office off=new Office();
        off.work();
        off.do_planning();

    }
    void work(){
        System.out.println("working in office");
    }
    void wfh()
    {
        System.out.println("Working in home");
    }
    void recruit()
    {
        System.out.println("recuirement");
    }
    private void do_planning(){
        System.out.println("Success");
    }
}

    



    
