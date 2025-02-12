package tamilnadu.chennai;

public class Branch_office extends Office {
    public Branch_office(){
        System.out.println("Welcome to branch office");
    }
    public static void main(String[] args) {
        Branch_office bff = new Branch_office();
        bff.celeb_functions();
        bff.work();
    }
    void celeb_functions(){
        System.out.println("Celebrate functions");
    }
}
