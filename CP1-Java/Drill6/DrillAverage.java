import java.text.DecimalFormat;
import java.util.Scanner;

public class DrillAverage {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        double sum = 0;

        for (int i = 1; i <= 5; i++) {
            System.out.println("Assign " + i + " score:");
            sum += scan.nextInt();
        }

        double average = sum / 5.0;
        DecimalFormat df = new DecimalFormat("#.##");
        System.out.println("Your average score is " + df.format(average));

        scan.close();  // Close the scanner
    }


}
