package tamilnadu.kallakurichi;
public class Office{
    int salary = 450000;
    public Office(){
         System.out.println("welcome to Head");
    }
    public static void main(String[] args) {
        Office o =new Office();
        o.work();
        o.recuit();
        
    }
    public void recuit(){
        System.out.println("recuit");
    }
    public void work(){
        System.out.println("working in office");
    }
    
}