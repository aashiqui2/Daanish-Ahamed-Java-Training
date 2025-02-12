public class Supermarket {

    String name;
    String pname;
    int price;
    int discount;
    // global variables,non-static variabe fields

    public static void main(String[] args) {
        Supermarket product1=new Supermarket();
        int a=20;
      

        product1.name="rice";
        product1.price=50;
        product1.discount=5;
        System.out.println(product1.name);

        Supermarket product2=new Supermarket();
        product2.pname="biscuit";
        product2.price=100;
        product2.discount=5;
        System.out.println(product2.pname);
        

    



    }
    
}
