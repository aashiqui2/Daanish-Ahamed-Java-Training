public class SuperMarket {
    // these 4 var are called non satic variables or fields
    Static String name = Reliance;
    String pname;
    int price;
    int discount;
    public static void main(String[] args) {
        int a=20;
        SuperMarket product1 =new SuperMarket();
        product1.pname="rice";
        product1.price=50;
        product1.discount=5;
        System.out.println(product1.pname);

        SuperMarket product2 =new SuperMarket();
        product2.pname="rice";
        product2.price=50;
        product2.discount=5;
        System.out.println(product1.pname);

    }

    }
}
