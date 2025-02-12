package tamilnadu.chennai;
public class College {
    static String Clgname ="DACE";
    int fees=82000;
    public static void main(String[] args) {
        display();
        College clg =new College();
        clg.recurit();
        clg.studying();
    }
    static void display(){
        System.out.println("Welcome to College");
    }
    void studying(){
        System.out.println("Students are Studying");
    }
    public void recurit(){
        System.out.println("Company  is Recruiting");
    }
    void write(){
        System.out.println("Exams are going");
    }
    private void SemQn(){
        
    }
}
