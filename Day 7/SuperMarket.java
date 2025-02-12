public class SuperMarket {
    String name;
    String pname;
    int price;
    int discount;
    //global variables,non ststic variable,fields
    public static void main(String[] args) {
        int a = 20;
        SuperMarket product1  = new SuperMarket();
        product1.name = "rice";
        product1.price = 50;
        product1.discount = 5;
        System.out.println(product1.name);
        
    }
}
