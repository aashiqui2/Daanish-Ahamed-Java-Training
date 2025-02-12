public class SuperMarket {
    static String name="Reiance Mall";
    String pname;
    int price;
    int discount;
    // global variables,non-static variable,fields
    
    SuperMarket()
    {
        System.out.println("Welcome");
    }
    SuperMarket(String pname,int price,int discount)
    {
       this.pname=pname;
       this.price=price;
       this.discount=discount;
    }
    public static void main(String[] args) {
        SuperMarket product=new SuperMarket();
        SuperMarket product1=new SuperMarket("rice",50,10);
        // product1.pname="rice";
        // product1.price=50;
        // product1.discount=5;
        System.out.println(product1.pname);
        // System.out.println(this.pname);//cannot  be used inside static block

        SuperMarket product2=new SuperMarket("biscuits",10,2);
        // product2.pname="biscuits";
        // product2.price=10;
        // product2.discount=2;
        System.out.println(product2.pname);
        System.out.println(name);
        product1.display();
    }

    void display()
    {
        System.out.println(this.pname);
    }
}