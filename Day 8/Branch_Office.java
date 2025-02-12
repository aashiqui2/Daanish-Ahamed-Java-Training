package  tamilnadu.chennai;
public class Office{
    final int salary = 45000;

    public Office()
    {
        System.out.println("Welcome to office");
    }
    public static void main(String[] argss){
        Office off = new Office();
        off.work();
        off.salary=50000;
    }
}