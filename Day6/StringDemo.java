// package Day6;
public class StringDemo {
    public static void main(String[] args) {
        String str="Hello World";
        String str1= new String("Hello World");
        str="Heyy";
        for(int i=0;i<str.length();i++){
            System.out.println(str.charAt(i));
        }
        System.out.println(str.length());

        String s1=new String("Heyy");
        String s2=new String("Heyy");
        System.out.println(s1.equals(s2));
        String ogword="Hello World";
        String word = ogword.toLowerCase();
        int count=0;
        // String vowels="aeiou"
        for(int i=0;i<word.length();i++){
            if(word.charAt(i)=='a' ||word.charAt(i)=='a'||word.charAt(i)=='e'||word.charAt(i)=='i'||word.charAt(i)=='o'||word.charAt(i)=='u'){
                System.out.print(word.charAt(i)+" ");
                count++;
            }
            }
            System.out.println(count);
            }
        
    }

