// package Day06;

public class tring1 {
    public static void main(String[] args) {
        String stgr="hello";
        
        String s1 = stgr.toLowerCase();
        for(int i = 0;i<stgr.length();i++){
            if(s1.charAt(i)=='a'||s1.charAt(i)=='e'||s1.charAt(i)=='i'||s1.charAt(i)=='o'||s1.charAt(i)=='u'){
                System.out.println(s1.charAt(i));
            }   
        }
    }
}
