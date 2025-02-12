package tamilnade.kerala;
import tamilnade.chennai.Office;
public class BranchOffice2 extends Office {
    BranchOffice2(){
        System.out.println("Welcome to BranchOffice2");
    }
    public static void main(String[] args) {
        BranchOffice2 bff2=new BranchOffice2();
        bff2.promoted();
        bff2.work();

    }
    void promoted(){
        System.out.println("Employee got promoted");
    }

}
