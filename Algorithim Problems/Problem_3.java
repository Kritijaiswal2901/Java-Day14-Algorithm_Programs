import java.util.Scanner;

public class Problem_3 {
        public static void main(String[] args) {
            Scanner scanner = new Scanner(System.in);
            System.out.print("Enter a list of words separated by commas: ");
            String input = scanner.nextLine();
            String[] words = input.split(",");
    
            insertionSort(words);
            System.out.println("Sorted List:");
            for (String word : words) {
                System.out.print(word + " ");
            }
    
            scanner.close();
        }
    
        private static void insertionSort(String[] array) {
            for (int i = 1; i < array.length; i++) {
                String key = array[i];
                int j = i - 1;
    
                while (j >= 0 && key.compareTo(array[j]) < 0) {
                    array[j + 1] = array[j];
                    j--;
                }
    
                array[j + 1] = key;
            }
        }
    }
    

