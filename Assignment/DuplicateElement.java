import java.util.ArrayList;
import java.util.HashSet;

public class DuplicateElement {
    public static void main(String[] args) {
        int[] array = {1, 2, 3, 4, 5, 3, 2, 1, 5};

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