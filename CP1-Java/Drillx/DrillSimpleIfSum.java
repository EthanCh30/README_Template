package org.example;

import java.util.Scanner;

public class DrillSimpleIfSum {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int num1;
        int num2;
        System.out.println("Enter two integers:");
        num1 = scan.nextInt();
        num2 = scan.nextInt();
        if (num1<num2){
            System.out.println(num1+" + 51 = " +(num1+51));
        }else {
            System.out.println(num2+" - 51 = "+(num2-51));
        }
    }
}
