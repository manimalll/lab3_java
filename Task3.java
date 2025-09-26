package lab03;

public class Task3 {

    public static void main(String[] args) {
        System.out.println("Testing Task 3");
        printResults(0.1);
        printResults(0.01);
        printResults(1E-5);

        printResults(0);
        printResults(-0.5);
    }

    public static double calculateInfiniteSum(double epsilon) {
        if (epsilon <= 0) {
            throw new IllegalArgumentException("Epsilon must be positive. epsilon = " + epsilon);
        }

        double sum = 0.0;
        int i = 1;
        while (true) {
            double term = 1.0 / (i * (i + 1.0));
            if (term < epsilon) {
                break;
            }
            sum += term;
            i++;
        }
        return sum;
    }

    static void printResults(double epsilon) {
        System.out.print("epsilon:" + epsilon + " result: ");
        try {
            System.out.println(calculateInfiniteSum(epsilon));
        } catch (IllegalArgumentException e) {
            System.out.println("EXCEPTION! " + e.getMessage());
        }
    }
}