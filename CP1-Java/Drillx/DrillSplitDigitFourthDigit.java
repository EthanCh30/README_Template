package org.example;

import java.util.Scanner;

public class DrillSplitDigitFourthDigit {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int num;
        System.out.print("Enter a 5-digit integer");
        num = scan.nextInt();
        num=(num / 10) % 10;
        if (num>=6){
            System.out.println("The number is true");
        }else {
            System.out.println("The number is false");
        }

    }

}
