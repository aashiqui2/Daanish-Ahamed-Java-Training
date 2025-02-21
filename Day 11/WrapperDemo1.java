public class WrapperDemo1 {
    public static void main(String[] args) {
        Integer a=20;
        int b=a;

        Float c=2.4f;
        float d=c;

        Character e='d';
        char f=e;

        Double g=2.34d;
        double h=g;

        Boolean i=true;
        boolean j=i;



        String s="123";
        // NumberFormatException
        int w=1;
        Integer result=Integer.valueOf(s);
        System.out.println(result+w);

        int p=1234;
        String r=String.valueOf(p);//"1234"
        System.out.println(r+12);
    }
}
