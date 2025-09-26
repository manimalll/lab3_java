package lab03;

public class Task1 {

    public static void main(String[] args) {
        System.out.println("Testing Task 1");
        printResults(5, 2.0);
        printResults(3, -1.0);
        printResults(0, 10.0);

        printResults(-1, 5.0);
        printResults(4, 0.0);
    }

    public static double calculateSeriesSum(int n, double x) {
        if (n < 0) {
            throw new IllegalArgumentException("Parameter n cannot be negative. n = " + n);
        }
        if (x == 0) {
            throw new IllegalArgumentException("Parameter x cannot be zero.");
        }

        double sum = 0.0;
        for (int i = 0; i <= n; i++) {
            sum += factorial(2 * i) / Math.pow(x, i);
        }
        return sum;
    }

    private static long factorial(int num) {
        if (num < 0) {
            throw new IllegalArgumentException("Factorial is not defined for negative numbers.");
        }
        long result = 1;
        for (int i = 2; i <= num; i++) {
            result *= i;
        }
        return result;
    }

    static void printResults(int n, double x) {
        System.out.print("n:" + n + " x:" + x + " result: ");
        try {
            System.out.println(calculateSeriesSum(n, x));
        } catch (IllegalArgumentException e) {
            System.out.println("EXCEPTION! " + e.getMessage());
        }
    }
}