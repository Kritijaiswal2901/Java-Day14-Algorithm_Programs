import java.util.Arrays;
import java.util.Scanner;

public class Problem_6 {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter the first string: ");
        String str1 = scanner.nextLine().toLowerCase();
        System.out.print("Enter the second string: ");
        String str2 = scanner.nextLine().toLowerCase();

        if (areAnagrams(str1, str2)) {
            System.out.println("The two strings are Anagrams.");
        } else {
            System.out.println("The two strings are not Anagrams.");
        }
        scanner.close();
    }

    private static boolean areAnagrams(String str1, String str2) {
        char[] charArray1 = str1.replaceAll("\\s", "").toCharArray();
        char[] charArray2 = str2.replaceAll("\\s", "").toCharArray();

        Arrays.sort(charArray1);
        Arrays.sort(charArray2);
        return Arrays.equals(charArray1, charArray2);
    }
}

