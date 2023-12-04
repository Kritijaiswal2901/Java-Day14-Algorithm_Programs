public class Problem_7 {

    public static void main(String[] args) {
        System.out.println("Prime numbers in the range 0 to 1000:");
        findAndPrintPrimes(0, 1000);
    }
    private static void findAndPrintPrimes(int start, int end) {
        for (int number = start; number <= end; number++) {
            if (isPrime(number)) {
                System.out.print(number + " ");
            }
        }
    }
    private static boolean isPrime(int number) {
        if (number <= 1) {
            return false;
        }

        for (int i = 2; i <= Math.sqrt(number); i++) {
            if (number % i == 0) {
                return false; 
            }
        }

        return true; 
    }
}

