import java.util.Scanner;

public class DrillStopZero {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Initialize counter for the sequence length
        int sequenceLength = 0;

        // Loop to read integers until 0 is encountered
        while (true) {
            int number = scanner.nextInt();
            if (number == 0) {
                break; // Exit loop when 0 is encountered
            }
            sequenceLength++; // Increment sequence length counter
        }

        // Close scanner to release resources
        scanner.close();

        // Output the total length of the sequence
        System.out.println(sequenceLength);
    }
}
