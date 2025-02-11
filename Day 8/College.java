package tamilnadu.chennai;

public class College {
    static String Clgname="DACE";
    int fees=20000;
    public static void main(String[] args) {
        display();
        College clg=new College();
        clg.studying();
        clg.recruit();
        clg.write();
        clg.semesterpaper();
    }
    static void display()
    {
        System.out.println("welcome to College "+Clgname);
    }
    void studying()
    {
        System.out.println("students are stydying");
    }
    public void recruit()
    {
        System.out.println("company is recruiting");
    }
    protected void write()
    {
        System.out.println("exam are going on");
    
    }

    private void semesterpaper()
    {
        System.out.println("this is top secret");
    }
}
