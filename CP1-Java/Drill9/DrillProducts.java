import java.util.Scanner;

public class DrillProducts {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter 7 integers");

        int[] numbers = new int[7];
        for (int i = 0; i < 7; i++) {
            numbers[i] = scanner.nextInt();
        }

        int nonNegativeProduct = 1;
        int negativeProduct = 1;
        boolean hasNonNegatives = false;
        boolean hasNegatives = false;

        for (int num : numbers) {
            if (num >= 0) {
                nonNegativeProduct *= num;
                hasNonNegatives = true;
            } else {
                negativeProduct *= num;
                hasNegatives = true;
            }
        }

        if (!hasNonNegatives) {
            nonNegativeProduct = 0;
        }

        if (!hasNegatives) {
            negativeProduct = 0;
        }

        System.out.println("Product of non-negatives = " + nonNegativeProduct);
        System.out.println("Product of negatives = " + negativeProduct);
    }
}
