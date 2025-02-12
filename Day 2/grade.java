public class grade {
    public static void main(String[] args) {
        int a=59;
        if (a<=100&&a>=90) {
            System.out.println(a+ " Grade A");
            
        }
        else if (a<90&&a>=80) {
            System.out.println(a+ " Grade B");
            
        }
        else if (a<80&&a>=70) {
            System.out.println(a+ " Grade c");
            
        }
        else if (a<70&&a>=60) {
            System.out.println(a+ " Grade D");
            
        }
        else
         {
            System.out.println(a+  " fail");
        }
    }
    
}
