import java.util.Scanner;

public class Problem_4 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter a list of integers separated by spaces: ");
        String input = scanner.nextLine();
        String[] intStrings = input.split(" ");

        int[] ints = new int[intStrings.length];
        for (int i = 0; i < intStrings.length; i++) {
            ints[i] = Integer.parseInt(intStrings[i]);
        }

        bubbleSort(ints);

        System.out.println("Sorted List:");
        for (int num : ints) {
            System.out.print(num + " ");
        }

        scanner.close();
    }

    private static void bubbleSort(int[] array) {
        int n = array.length;
        boolean swapped;

        for (int i = 0; i < n - 1; i++) {
            swapped = false;

            for (int j = 0; j < n - i - 1; j++) {
                if (array[j] > array[j + 1]) {
                    int temp = array[j];
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
}
