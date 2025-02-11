public class Conditional {
    public static void main(String[] args) {
        //If conditions:
        if (true) {
            System.out.println("Hello");
        }
        
        int a=10,b=20;
        if(a>b){
            System.out.println(a+" is greater");
        }else{
            System.out.println(b+" is greater");
        }
        //Using Ternary Operator
        // System.out.println((a>b)?(a+" is greater"):(b+" is greater"));
        int ab=10,ba=10;

        System.out.println("Start of if-else-if Block");
        System.out.println("___________________________");
        if(ab>ba){
            System.out.println(a+" is greater");
        }else if (ba>ab) {
            System.out.println(b+" is greater");
        }
        else{
            System.out.println("Both are same");
        }
    }
}
