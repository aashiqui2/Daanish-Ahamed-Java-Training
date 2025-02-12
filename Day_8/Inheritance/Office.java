package tamilnadu.chennai;

public class Office {
    final int salary=45000;
    public Office(){
        System.out.println("Welcome to office");
    }
    public static void main(String[] args) {
        Office off =new Office();
        off.work();
    }
    public void work(){
        System.out.println("Working in Office");
    }
    void recruit(){
        System.out.println("recruitment");
    }
    protected void wfh(){
        System.out.println("Work from Home");
    }
    private void businessplan(){
        System.out.println("Private");
    }
}
