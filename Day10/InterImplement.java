// package Day10;

public class InterImplement implements InnerInterf,Interf1 {
    public static void main(String[] args) {
        InnerInterf im = new InterImplement();   //Dinamic binding
        InnerInterf.prin();
        im.sum(45, 67);
    }
    @Override
    public void sum(int a,int b){
        InnerInterf.super.sum(a,b);
        Interf1.super.sum(a,b);
    }

    public void result(){
        System.out.println("result");
    }
}
