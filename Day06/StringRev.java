// package Day06;

public class StringRev {
    public static void main(String[] args) {
        String s1 = "abcd";
        String re = "";
        for(int i =s1.length()-1;i>=0;i--){
            // System.out.println(s1.charAt(i));
            re =re+s1.charAt(i); 

        }
        System.out.println(re);
    }
}
