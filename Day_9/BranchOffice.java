package tamilnade.chennai;
public class BranchOffice extends Office {
    public BranchOffice(){
        System.out.println("Welcome to branch Office");
    }
    public static void main(String[] args) {
       BranchOffice bff = new BranchOffice();
       bff.work();
       bff.celebrate_local_fun();
       
    }
    void celebrate_local_fun(){
        System.out.println("Celebration");
    }
}
