package org.example;

import java.util.Scanner;

public class DrillSplitDigitProduct {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int num;
        System.out.println("Enter a 6-digit integer");
        num = scan.nextInt();
        int product = 1;

        for (int i = 0; i < 6; i++) {
            product *= num % 10;  // 乘以当前位的数字
            num /= 10;           // 去掉当前位数字
        }
        System.out.println("The product of all of the digits is "+product);

    }
}
