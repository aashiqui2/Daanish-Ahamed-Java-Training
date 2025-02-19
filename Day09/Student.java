public class Student extends Teacher{
    public static void main(String[] args) {
       Student stu = new Student();
       stu.teaching();
       stu.questionpaper(); 
    }
    void questionpaper(){
        System.out.println("its easy");
    }
}
