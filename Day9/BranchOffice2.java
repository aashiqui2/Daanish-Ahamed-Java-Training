package tamilnadu.kerala;

import tamilnadu.chennai.Office;

public class BranchOffice2 extends Office{
    BranchOffice2(){
        System.out.println("Welcome to Kerala");
    }
    public static void main(String[] args) {
        BranchOffice2 bfo2=new BranchOffice2();
        bfo2.promoted();
        bfo2.recruit();
    }
    void promoted(){
        System.out.println("got promotion");
    }
}
