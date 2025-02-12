package tamilnade.madurai;
import tamilnade.chennai.BranchOffice;
public class BranchOffice1 extends BranchOffice {
    BranchOffice1(){
        System.out.println("Welcome to Branch Office1");
    }
    public static void main(String[] args) {
        BranchOffice1 bff1=new BranchOffice1();
        bff1.work();
    }
    void hike(){
        System.out.println("got office");
    }
}
