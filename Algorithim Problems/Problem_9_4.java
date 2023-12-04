import java.util.Arrays;

public class Problem_9_4<T extends Comparable<T>> {

    public void mergeSort(T[] array) {
        mergeSortRecursive(array, 0, array.length - 1);
    }

    private void mergeSortRecursive(T[] array, int low, int high) {
        if (low < high) {
            int mid = low + (high - low) / 2;

            mergeSortRecursive(array, low, mid);
            mergeSortRecursive(array, mid + 1, high);

            merge(array, low, mid, high);
        }
    }

    private void merge(T[] array, int low, int mid, int high) {
        int leftLength = mid - low + 1;
        int rightLength = high - mid;

        T[] leftArray = Arrays.copyOfRange(array, low, low + leftLength);
        T[] rightArray = Arrays.copyOfRange(array, mid + 1, mid + 1 + rightLength);

        int i = 0, j = 0, k = low;

        while (i < leftLength && j < rightLength) {
            if (leftArray[i].compareTo(rightArray[j]) <= 0) {
                array[k++] = leftArray[i++];
            } else {
                array[k++] = rightArray[j++];
            }
        }

        while (i < leftLength) {
            array[k++] = leftArray[i++];
        }

        while (j < rightLength) {
            array[k++] = rightArray[j++];
        }
    }

    public static void main(String[] args) {
        String[] words = {"banana", "apple", "cherry", "date", "grape", "lemon", "mango", "orange"};
        Problem_9_4<String> sorter = new Problem_9_4<>();
        sorter.mergeSort(words);
        System.out.println("Sorted List: " + Arrays.toString(words));
    }
}
