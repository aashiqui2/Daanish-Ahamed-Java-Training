package tamilnadu.chennai;
import tamilnadu.chennai.College;
public class College1 {

    public static void main(String[] args) {
        College1 clg1=new College1();
        clg1.display();

        College clg=new College();
        clg.studying();
        clg.recruit();
        clg.write();
        clg.semesterpaper();
    }
    void display()
    {
        System.out.println("Welcome to college 1");
    }
}