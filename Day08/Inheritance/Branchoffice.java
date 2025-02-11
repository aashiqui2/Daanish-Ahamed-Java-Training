// package Inheritance;
package tamilnadu.kallakurichi;
public class Branchoffice extends Office {
    public Branchoffice(){
        System.out.println("welcome to Branch Office");
    }

public static void main(String[] args) {
    Branchoffice bff = new Branchoffice();
    bff.work();
    bff.recuit();
}

public void locaLeave(){
    System.out.println("enjoyyyy");
}

}
