
import java.util.Arrays;

public class Problem_9_1<T extends Comparable<T>> {

    public boolean binarySearch(T[] array, T key) {
        Arrays.sort(array);
        int result = binarySearchRecursive(array, key, 0, array.length - 1);
        return result != -1;
    }

    private int binarySearchRecursive(T[] array, T key, int low, int high) {
        if (low <= high) {
            int mid = low + (high - low) / 2;
            int comparisonResult = key.toString().toLowerCase().compareTo(array[mid].toString().toLowerCase());

            if (comparisonResult == 0) {
                return mid;
            } else if (comparisonResult < 0) {
                return binarySearchRecursive(array, key, low, mid - 1);
            } else {
                return binarySearchRecursive(array, key, mid + 1, high);
            }
        }

        return -1;
    }

    public static void main(String[] args) {
        String[] words = {"banana", "apple", "cherry", "date", "grape", "lemon", "mango", "orange"};
        Problem_9_1<String> searcher = new Problem_9_1<>();
        String searchKey = "Mango";
        boolean isFound = searcher.binarySearch(words, searchKey);
        
        if (isFound) {
            System.out.println("'" + searchKey + "' found in the array.");
        } else {
            System.out.println("'" + searchKey + "' not found in the array.");
        }
    }
}
