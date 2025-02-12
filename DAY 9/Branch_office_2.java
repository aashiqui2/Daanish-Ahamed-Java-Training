package tamilnadu.uk;

import tamilnadu.chennai.Office;

public class Branch_office_2 extends Office {
    Branch_office_2(){
        System.out.println("welcome bff2");
    }
    public static void main(String[] args) {
        Branch_office_2 bff2= new Branch_office_2();
        bff2.promoted();
        bff2.work();
    }
    void promoted(){
        System.out.println("got promoted");
    }

}
