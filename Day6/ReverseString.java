// package Day6;

public class ReverseString {
    public static void main(String[] args) {
        String word="muhammadpp";
        String reversed = "";
        for(int i=word.length()-1;i>=0;i--){
            reversed=reversed+word.charAt(i);
        }

        System.out.println(reversed);
    }
}
