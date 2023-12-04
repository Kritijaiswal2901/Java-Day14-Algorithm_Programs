import java.util.Arrays;

public class Problem_9_3<T extends Comparable<T>> {

    public void bubbleSort(T[] array) {
        int n = array.length;
        boolean swapped;

        for (int i = 0; i < n - 1; i++) {
            swapped = false;

            for (int j = 0; j < n - i - 1; j++) {
                if (array[j].compareTo(array[j + 1]) > 0) {
                    T temp = array[j];
                    array[j] = array[j + 1];
                    array[j + 1] = temp;
                    swapped = true;
                }
            }

            if (!swapped) {
                break;
            }
        }
    }

    public static void main(String[] args) {
        Integer[] numbers = {5, 2, 8, 1, 4, 7, 3, 6};
        Problem_9_3<Integer> sorter = new Problem_9_3<>();
        sorter.bubbleSort(numbers);
        System.out.println("Sorted List: " + Arrays.toString(numbers));
    }
}

