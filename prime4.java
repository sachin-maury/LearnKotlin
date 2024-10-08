public class prime4 {

    public static void main(String[] args) {

        System.out.println("Prime numbers from 1 to 100 are:");
        printPrimesUpTo100();
    }

    public static void printPrimesUpTo100() {
        for (int i = 2; i <= 50; i++) {
            if (isPrime(i)) {
                System.out.print(i + " ");
            }
        }
    }

    public static boolean isPrime(int num) {
        if (num <= 1) {
            return false;
        }
        for (int i = 2; i <= Math.sqrt(num); i++) {
            if (num % i == 0) {
                return false;
            }
        }
        return true;
    }

}
