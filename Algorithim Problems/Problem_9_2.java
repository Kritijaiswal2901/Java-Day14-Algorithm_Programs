import java.util.Arrays;

public class Problem_9_2<T extends Comparable<T>> {

    public void insertionSort(T[] array) {
        for (int i = 1; i < array.length; i++) {
            T key = array[i];
            int j = i - 1;

            while (j >= 0 && key.compareTo(array[j]) < 0) {
                array[j + 1] = array[j];
                j--;
            }

            array[j + 1] = key;
        }
    }
    public static void main(String[] args) {
        String[] words = {"banana", "apple", "cherry", "date", "grape", "lemon", "mango", "orange"};
        Problem_9_2<String> sorter = new Problem_9_2<>();
        sorter.insertionSort(words);
        System.out.println("Sorted List: " + Arrays.toString(words));
    }
}


