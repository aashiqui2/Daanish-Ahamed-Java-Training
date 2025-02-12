public class If_elseIf {
    public static void main(String[] args) {
        int a=10,b=20,c=30;
        if(a>b && a>c){
            System.out.println(a+" is the greatest");
        }
        else if(b>a && b>c){
            System.out.println(b+" is the greatest");
        }
        else{
            System.out.println(c+" is the greatest");
        }
    }
}
