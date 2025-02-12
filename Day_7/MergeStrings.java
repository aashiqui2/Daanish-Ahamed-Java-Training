public class MergeStrings {
    public static void main(String[] args) {
        String s1="abc";
        String s2="pqr";
        StringBuilder mergedString = new StringBuilder();
        int len1 = s1.length(), len2 = s2.length();
        int i = 0, j = 0;

        while (i < len1 || j < len2) {
            if (i < len1){
                mergedString.append(s1.charAt(i++));
            }
            if (j < len2){ 
                mergedString.append(s2.charAt(j++));
            }
        }
        System.out.println(mergedString);

        
    }
}
