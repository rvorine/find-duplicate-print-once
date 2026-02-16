import java.util.*;

public class FindDuplicatePrintOnce {
    public static void main(String[] args) {
        // Sample array with duplicates
        int[] numbers = {1, 2, 3, 4, 2, 5, 6, 3, 7, 8, 1, 9, 4};
        
        System.out.println("Original Array: " + Arrays.toString(numbers));
        System.out.println("\nDuplicate elements (printed once):");
        
        findAndPrintDuplicates(numbers);
    }
    
    public static void findAndPrintDuplicates(int[] arr) {
        Set<Integer> seen = new HashSet<>();
        Set<Integer> duplicates = new HashSet<>();
        
        // Find duplicates
        for (int num : arr) {
            if (seen.contains(num)) {
                duplicates.add(num);
            } else {
                seen.add(num);
            }
        }
        
        // Print duplicates (automatically printed once due to Set)
        if (duplicates.isEmpty()) {
            System.out.println("No duplicates found.");
        } else {
            for (int duplicate : duplicates) {
                System.out.println(duplicate);
            }
        }
    }
}
