package tamilnadu.chennai;

// import tamilnadu.chennai.Office;

public class BranchOffice extends Office{
    public BranchOffice(){
        System.out.println("Welcome to Branch Office");
    }
    public static void main(String[] args) {
        BranchOffice bff = new BranchOffice();
        bff.do_celebrate();
        bff.work();
        
    }
    void do_celebrate(){
        System.out.println("Celebrate Local functions");
    }
}
