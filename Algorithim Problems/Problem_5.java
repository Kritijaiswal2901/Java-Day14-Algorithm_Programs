import java.util.Arrays;

public class Problem_5 {

    public static void main(String[] args) {
        String[] inputArray = { "apple", "banana", "cherry", "date", "grape", "lemon", "mango", "orange" };
        mergeSort(inputArray, 0, inputArray.length);
        System.out.println("Sorted Array: " + Arrays.toString(inputArray));
    }

    private static void mergeSort(String[] array, int low, int high) {
        if (high - low > 1) {
            int mid = low + (high - low) / 2;
            mergeSort(array, low, mid);
            mergeSort(array, mid, high);
            merge(array, low, mid, high);
        }
    }

    private static void merge(String[] array, int low, int mid, int high) {
        String[] mergedArray = new String[high - low];
        int i = low;
        int j = mid;
        int k = 0;

        while (i < mid && j < high) {
            if (array[i].compareTo(array[j]) < 0) {
                mergedArray[k++] = array[i++];
            } else {
                mergedArray[k++] = array[j++];
            }
        }

        while (i < mid) {
            mergedArray[k++] = array[i++];
        }

        while (j < high) {
            mergedArray[k++] = array[j++];
        }

        System.arraycopy(mergedArray, 0, array, low, k);
    }
}
