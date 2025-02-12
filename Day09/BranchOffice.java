package tamilnadu;

// import tamilnadu.Office;


public class BranchOffice extends Office {
    public BranchOffice(){  //pakage private//
        System.out.println("Wellcome to Branch Chennai");
    }
    public static void main(String[] args) {
        BranchOffice bff = new BranchOffice();
        bff.holi();
        bff.work();
    }
    void holi(){
        System.out.println("holyday");
    }
}
