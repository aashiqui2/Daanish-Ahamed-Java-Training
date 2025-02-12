public class StringDemo2a {
    public static void main(String[] args) {
        String str=new String("hello");
        String str1=new String("hello");

        // if(str==str1){
        //     System.out.println("same");
        // }else{
        //     System.out.println("no");
        // }
        if(str.equals(str1)){
            System.out.println("same");
        }
        else{
            System.out.println("no");
        }
    }
    
}

