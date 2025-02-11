package tamilnadu.puthukotai;

import tamilnadu.kallakurichi.Branchoffice;

public class BranchOffice2 extends Branchoffice {
    BranchOffice2(){
        System.out.println("Welcome to puthukottai");
    }
    public static void main(String[] args) {
        BranchOffice2 bf2 = new BranchOffice2();
        bf2.no();
        bf2.work();

    }
    public void no(){
        System.out.println("no holiday");
    }
}
