public class SuperMarket2 {
    static String name="Reliance Mall";
    String pname;
    int price;
    int discount;

    SuperMarket2(){
        System.out.println("Welcome");
    }
    SuperMarket2(String pname,int price,int discount){
        this.pname = pname;
        this.price=price;
        this.discount=discount;
    }
    public static void main(String[] args) {
        SuperMarket2 product =new SuperMarket2();
        SuperMarket2 product1=new SuperMarket2("rice",50,10);
        System.out.println(product1.pname);

        SuperMarket2 product2=new SuperMarket2();
        System.out.println(product2.pname); 
        
    }
    void display(){
        System.out.println(this.pname);
    }
}
