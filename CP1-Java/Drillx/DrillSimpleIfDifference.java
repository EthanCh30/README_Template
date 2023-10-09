package org.example;

import java.util.Scanner;

public class DrillSimpleIfDifference {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int num1;
        int num2;
        System.out.println("Enter two integers:");
        num1 = scan.nextInt();
        num2 = scan.nextInt();
        if (num1>num2){
            System.out.println(num1+" - 17 =" +(num1-17));
        }else {
            System.out.println(num2+" + 17 = "+(num2+17));
        }
    }
}
