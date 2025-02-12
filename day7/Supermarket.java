public class Supermarket {
    static String name="reliance";

    
    String pname;
    int price;
    int discount;
    //four variables are called global,nonstatic,or fields
    Supermarket(){
        System.out.println("welcome");

    }
    Supermarket(String pname,int price,int discount){
       this.pname=pname;
       this. price=price;
        this.discount=discount;

    }
    public static void main(String[] args) {
        Supermarket product=new Supermarket();
        Supermarket product1=new Supermarket("rice",50,10);
        //product1.name="rice";
        //product1.price=50;
        //product1.discount=5;
        System.out.println(product1.name);

        Supermarket product2=new Supermarket("biscuit",10,5);
        //product1.pname="biscuit";
        //product1.price=10;
        //product1.discount=2;
        System.out.println(product2.pname);
        System.out.println(name);
        product1.display();
        

        

        
    }void display(){
        System.out.println(this.pname);
    }

    
}
