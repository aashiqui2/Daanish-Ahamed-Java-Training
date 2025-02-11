// package Day6;

public class WordCount {
    public static void main(String[] args) {
        String s="Hello world";
        int count=0;
        for(int i=0;i<s.length();i++){
            if(s.equals("")){
                count=0;
                break;
            }else if(s.charAt(i)==' '){
                count++;
            }else{
                continue;
            }
        
        }
        System.out.println(count);
    }
}
