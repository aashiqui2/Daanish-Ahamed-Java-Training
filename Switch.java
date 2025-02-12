public class Switch {
    public static void main(String[] args) {
        int a=1;
        switch(a){
            case 1: a++;
            case 2: ++a;
            case 3: --a;
            default: a--;
        }
        System.out.println(a);
    }
}
