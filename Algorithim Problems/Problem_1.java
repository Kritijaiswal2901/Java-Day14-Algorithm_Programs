import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Problem_1 {
    public static List<String> generateIterativePermutations(String inputString) {
        List<String> result = new ArrayList<>();
        result.add("");

        for (char currentChar : inputString.toCharArray()) {
            List<String> newPermutations = new ArrayList<>();
            for (String existingPermutation : result) {
                for (int i = 0; i <= existingPermutation.length(); i++) {
                    newPermutations.add(existingPermutation.substring(0, i) + currentChar + existingPermutation.substring(i));
                }
            }
            result = newPermutations;
        }

        return result;
    }

    public static List<String> generateRecursivePermutations(String inputString) {
        List<String> result = new ArrayList<>();
        recursivelyGeneratePermutations("", inputString, result);
        return result;
    }

    private static void recursivelyGeneratePermutations(String prefix, String remaining, List<String> result) {
        if (remaining.length() == 0) {
            result.add(prefix);
        } else {
            for (int i = 0; i < remaining.length(); i++) {
                recursivelyGeneratePermutations(prefix + remaining.charAt(i), remaining.substring(0, i) + remaining.substring(i + 1), result);
            }
        }
    }
    public static boolean arePermutationArraysEqual(String[] array1, String[] array2) {
        Arrays.sort(array1);
        Arrays.sort(array2);
        return Arrays.equals(array1, array2);
    }
    public static void main(String[] args) {
        String input = "abc";
        List<String> iterativeResult = generateIterativePermutations(input);
        System.out.println("Iterative Permutations: " + iterativeResult);
        List<String> recursiveResult = generateRecursivePermutations(input);
        System.out.println("Recursive Permutations: " + recursiveResult);
        boolean isEqual = arePermutationArraysEqual(iterativeResult.toArray(new String[0]), recursiveResult.toArray(new String[0]));
        System.out.println("Array Equality: " + isEqual);
    }
}
