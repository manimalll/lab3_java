package lab03;

public class Task2 {

    public static void main(String[] args) {
        System.out.println("Testing Task 2");

        printResults(2.0, -5.0);
        printResults(3.0, 4.0);
        printResults(1.0, 0.0);

        printResults(-1.0, 10.0);
    }

    public static double calculateFunction(double a, double x) {
        if (a <= 0) {
            throw new IllegalArgumentException("Parameter a must be positive. a = " + a);
        }

        if (x < 0) {
            return Math.sin(a * x) / x;
        } else {
            return a * x * x;
        }
    }

    static void printResults(double a, double x) {
        System.out.print("a:" + a + " x:" + x + " result: ");
        try {
            System.out.println(calculateFunction(a, x));
        } catch (IllegalArgumentException e) {
            System.out.println("EXCEPTION! " + e.getMessage());
        }
    }
}