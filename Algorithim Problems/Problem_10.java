import java.util.Scanner;

public class Problem_10 {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter the value of N (where N = 2^n): ");
        int n = scanner.nextInt();

        int low = 0;
        int high = (int) Math.pow(2, n) - 1;

        System.out.println("Think of a number between 0 and " + (high));

        int steps = findNumber(scanner, low, high);

        System.out.println("Guessed the number in " + steps + " steps.");

        scanner.close();
    }

    private static int findNumber(Scanner scanner, int low, int high) {
        int steps = 0;

        while (low <= high) {
            int mid = (low + high) / 2;

            System.out.print("Is the number between " + low + " and " + mid + "? (true/false): ");
            boolean response = scanner.nextBoolean();

            steps++;

            if (response) {
                high = mid;
            } else {
                low = mid + 1;
            }

            if (low == high) {
                System.out.println("Your number is " + low);
                break;
            }
        }

        return steps;
    }
}

