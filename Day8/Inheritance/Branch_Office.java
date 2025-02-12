package tamilnadu.chennai;

public class Branch_Office extends Office {

    public  Branch_Office()
    {
        System.out.println("welcome to branch_office");
    }
    public static void main(String[] args) {
        Branch_Office bff=new Branch_Office();
        bff.work();
        bff.wfm();
        bff.recuit();
        System.out.println(bff.salary);
    }
    public void celebrate_local_function()
    {
        System.out.println("celebrating");
    }
}
