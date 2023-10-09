// it based on tablular values

import java.util.Scanner;

public class CalculateBMI {

    public static void main(String[] args) {
        double weight, height, BMI;
        String ran;
        Scanner scan = new Scanner(System.in);
        //Prompt the user to enter their weight in kilograms
        System.out.print("Enter your weight in kilograms: ");
        weight = scan.nextDouble();
        //Prompt the user to enter their height in metres
        System.out.print("Enter your height in metres: ");
        height = scan.nextDouble();
        // Calculate BMI
        BMI = weight / (height * height);
        // Display the result
        if (BMI < 18.5) {
            ran = "Underweight";
        } else if (BMI >= 18.5 && BMI <= 24.9) {
            ran = "Normal";
        } else if (BMI >= 25.0 && BMI <= 29.9) {
            ran = "Overweight";
        } else{
            ran = "Obese";
        }
        String formattedBMI = String.format("%.1f", BMI);
        System.out.println("Your BMI is " + formattedBMI + ", which means you are in the " + ran + " range.");
    }
}
