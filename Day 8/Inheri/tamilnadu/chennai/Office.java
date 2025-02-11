package tamilnadu.chennai;
public class Office {
    final int salary=45000;//global and non_static
    public static void main(String[] args) {
        Office off=new Office();
        off.work(); 
        // off.salary=50000; 
    }
    public void work(){
        System.out.println("Working in Office");
    }
    void recruit(){
        System.out.println("Recuruitment");
    }
    protected void wfh(){
        System.out.println("Work from home");
    }
    private void Do_business_plan(){
        System.out.println("Business plan");
    }
}
