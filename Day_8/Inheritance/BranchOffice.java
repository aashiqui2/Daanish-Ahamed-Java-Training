package tamilnadu.chennai;

public class BranchOffice extends Office {
    public BranchOffice(){
        System.out.println("welcome to Branch office");
    }
    public static void main(String[] args) {
        BranchOffice bff=new BranchOffice();
        bff.work();
        bff.wfh();

    }
    public void celebrate_local_fun(){
        System.out.println("Celebration");
    }
}
