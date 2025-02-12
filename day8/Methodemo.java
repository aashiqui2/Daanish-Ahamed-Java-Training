public class Methodemo {
    public static void main(String[] args) {
        int a=2,b=3,c=5;
        add(a,b);
        add(a,b,c);//arguments
    }
    static void add(int a,int b){
        System.out.println(a+b);
        return a+b;

    }static void add(int a,int b,int c){
        //parameter
        System.out.println(a+b+c);
    }
} 

