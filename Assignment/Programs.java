import java.util.HashSet;
import java.util.ArrayList;

public class Programs {
    public static void main(String[] args) {
        int[] array = {1, 2, 3, 4, 2, 3, 5, 6, 4};

        HashSet<Integer> seen = new HashSet<>();
        ArrayList<Integer> duplicates = new ArrayList<>();

        for (int num : array) {
            if (seen.contains(num)) {
                duplicates.add(num);
            } else {
                seen.add(num);
            }
        }

        System.out.println("Duplicate elements: " + duplicates);
    }
}