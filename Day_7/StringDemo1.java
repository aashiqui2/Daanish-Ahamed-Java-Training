public class StringDemo1 {
    public static void main(String[] args) {
        String s1 = new String("ABC");
        // String s2 = new String("ABC");
        String s2=s1; 
        s1 ="PQR";
        s2="PQR";
        if(s1==s2){
            System.out.println("s1 s2 are ==");
        }
        else{
            System.out.println("s1 s2 are not ==");
        }
        // with equals of method

    }
}
