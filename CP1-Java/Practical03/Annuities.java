import java.text.NumberFormat;
import java.util.Scanner;

public class Annuities {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        // declare any variables here
        int PMT;
        double r;
        int n;
        double num;
        // prompt for the PMT value
        System.out.println("Enter the PMT value:");
        PMT = scan.nextInt();
        // Prompt for the interest rate
        System.out.println("Enter the interest rate:");
        r = scan.nextDouble();
        r = r/100;
        // Prompt for the number of payments
        System.out.println("Enter the number of payments:");
        n = scan.nextInt();
        // calculate the present value
        num = PMT * (1 - (1 / Math.pow(1 + r, n))) / r;
        // output the results
        NumberFormat numberFormat = NumberFormat.getCurrencyInstance();
        String formattedNum = numberFormat.format(num);
        System.out.println("Present Value of the annuity is: "+formattedNum);
    }

}