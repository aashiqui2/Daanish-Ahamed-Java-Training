package tamilnadu.chennai;
public class Branchoffice extends Office {
    public Branchoffice(){//subclass,package private
        System.out.println("welcome to branchoffice");
    }
    public static void main(String[] args) {
        Branchoffice bff=new Branchoffice();
        bff.celebrate_local_function();
        bff.wfh();//can be accessed since both are in same branch or package
        
    }void celebrate_local_function(){
        System.out.println("celebrating");
    }
    
}
