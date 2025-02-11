package tamilnadu.delhi;
import tamilnadu.chennai.College;

public class College2 {
    public static void main(String[] args) {
        College clg=new College();
        clg.studying();
        // studying() is not public in College; cannot be accessed from outside package
    }
    void display()
    {
        System.out.println("welcome to college 2");
    }
}
