public class SuperMarket {
    static Strimg name="Reliance Mall";
    String pname;
    int price;
    int discount;
    // global variable,non static variable,fileds

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
    
}
