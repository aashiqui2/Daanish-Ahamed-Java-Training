public class Stringvowel {
    public static void main(String[] args) {
        String str="Hello World";
        str=str.toLowerCase();
        //System.out.println(str.toLowerCase());
        for(int  i=1;i<str.length();i++){
            if(str.charAt(i)=='a'||str.charAt(i)=='e'||str.charAt(i)=='i'||str.charAt(i)=='o'||str.charAt(i)=='u'){
                System.out.println(str.charAt(i));
            }

        }
        
    }
    
}
