import java.util.Scanner;

public class DrillSumFirstTwoDigits {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Enter a 3-digit integer");

        int num = scan.nextInt();
        int firstDigits = num / 100;
        int secondDigits = num/10 % 10;
        int lastDigit = num % 10;

        if (firstDigits + secondDigits > lastDigit) {
            System.out.println("The number is true");
        }else{
            System.out.println("The number is false");
        }


    }
}
