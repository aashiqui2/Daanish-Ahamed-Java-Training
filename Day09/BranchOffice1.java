package tamilnadu.kallakurichi;

import tamilnadu.BranchOffice;

public class BranchOffice1 extends BranchOffice{
    BranchOffice1(){
        System.out.println("Welcome to kallakurichi");
    }
    
    public static void main(String[] args) {
        BranchOffice1 bf1 = new BranchOffice1();
        bf1.hike();
        bf1.work();
    }

    void hike(){
        System.out.println();
    }
}
