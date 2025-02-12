public class Length {
    public static void main(String[] args) {
        String s="fly me to the moon ";
        s=s.trim();
        int lastIndex=s.lastIndexOf(" ");
        System.out.println(s.length()-lastIndex-1);
        
    }
    
}
