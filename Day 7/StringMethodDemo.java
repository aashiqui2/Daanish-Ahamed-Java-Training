public class StringMethodDemo {
    public static void main(String[] args) {
        String s1="abc";
        String s2="abc";
        System.out.println(s1==s2);


        String s3="abc";
        String s4=s3;
        System.out.println(s4==s3);

        
        String s5="abc";
        String s6="abc";
        s5+="d";
        System.out.println(s6==s5);
    }
    
}
