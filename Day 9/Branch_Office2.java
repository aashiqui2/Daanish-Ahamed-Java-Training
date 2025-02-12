package tamilnadu.kerala;

import tamilnadu.chennai.Office;

public class Branch_Office2  extends Office{
    Branch_Office2()
    {
        System.out.println("welcome to Branch_Office2");
    }

    public static void main(String[] args) {
        Branch_Office2 bff2=new Branch_Office2();
        bff2.promoted();
        bff2.recruit();
    }
    void promoted()
    {
        System.out.println("got promotion");
    }
}