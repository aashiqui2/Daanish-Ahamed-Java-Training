package tamilnadu.trichy;
import tamilnadu.chennai.*;

public class Branch_Office extends Office{

     public Branch_Office() {
        System.out.println("welcome to Branch_Office");
    }
    
    public static void main(String[] args) {
        Branch_Office bff=new Branch_Office();
        bff.work();
        bff.wfm();
        bff.recruit();
        System.out.println(bff.salary);
    }
    public void celebrate_local_function()
    {
        System.out.println("celebrating");
    }
}