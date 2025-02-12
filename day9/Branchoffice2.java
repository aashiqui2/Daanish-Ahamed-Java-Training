package tamilnadu.kerala;
import tamilnadu.chennai.Office;
public class Branchoffice2 extends Office  {
    Branchoffice2(){
        System.out.println("welcome to branchoffice2");
    }
    public static void main(String[] args) {
        Branchoffice2 bff2=new Branchoffice2();
        bff2.recruit();
        bff2.promoted();
        
    }void promoted(){
        System.out.println("got promoted");
    }

    
}
