package tamilnadu.chennai;
public class Branchoffice extends Office {
    public Branchoffice(){
        System.out.println("welcome to branch office");
    }
    public static void main(String[] args) {
        Branchoffice bff=new Branchoffice();
        bff.work();
        bff.wfm();
        bff.recruit();
        System.out.println(bff.salary);
    }
    public void celebrate_local_function(){
        System.out.println("celebrating");
    }
}
