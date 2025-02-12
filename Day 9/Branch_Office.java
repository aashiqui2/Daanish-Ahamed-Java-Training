package tamilnadu.chennai;
public class Branch_Office extends Office {
    public Branch_Office()//package private
    {
        System.out.println("welcome to Branch_Office");
    }
    public static void main(String[] args) {
        Branch_Office bff=new Branch_Office();
        bff.celebrate_local_function();
        bff.work();
    }
    void celebrate_local_function()
    {
        System.out.println("celebrating");
    }
}
