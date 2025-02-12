public class SuperMarket {
    String name;
    String pname;
    int price;
    int discount;

    public static void main(String[] args) {
        int a=20;
        SuperMarket product1=new SuperMarket();
        product1.pname="rice";
        product1.price=50;
        product1.discount=5;
        System.out.println(product1.pname);
        SuperMarket product2=new SuperMarket();
        product2.pname="buscuits";
        product2.price=20;
        System.out.print(product2.price);



    }

    
}