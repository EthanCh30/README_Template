import java.util.Arrays;
import java.util.Scanner;


    //For each multiple of 10 in the given array, change all the values following it to be that multiple of 10, until encountering another multiple of 10.
    public static int[] tenRun(int[] intArr) {
        int lastTen = 0;
        int[] returnArr = new int[intArr.length];
        for (int i = 0; i < intArr.length; i++) {
            if (intArr[i]%10 == 0) {
                lastTen = intArr[i];
                returnArr[i] = intArr[i];
            } else {
                if (lastTen == 0) {
                    returnArr[i] = intArr[i];
                } else {
                    returnArr[i] = lastTen;
                }
            }
        }
        return returnArr;
    }

    //Return the sum of the numbers in the array, returning 0 for an empty array. Except the number 5 is very unlucky, so it does not count and numbers that come immediately after a 5 also do not count.
    //
    //sumUnlucky([1, 2, 2, 1, 5]) → 6
    //
    //sumUnlucky([1, 1]) → 2
    //
    //sumUnlucky([1, 2, 2, 1, 5, 2, 2]) → 8

    public static int sumUnlucky(int[] intArr) {
        int sum = 0;
        if (intArr.length != 0) {
            for (int i = 0; i < intArr.length; i++) {
                if (intArr[i] != 5) {
                    if ((i > 0 && intArr[i - 1] !=5) || i == 0) {
                        sum += intArr[i];
                    }
                }
            }
        }
        return sum;
    }

    //Given arrays nums1 and nums2 of the same length, for every element in nums1, consider the corresponding element in nums2 (at the same index). Return the count of the number of times that the two elements differ by 2 or less, but are not equal.
    //
    //matchUp([1, 2, 3], [2, 3, 10]) → 2
    //
    //matchUp([1, 2, 3], [2, 3, 5]) → 3
    //
    //matchUp([1, 2, 3], [2, 3, 3]) → 2

    public static int matchUp(int[] nums1, int[] nums2) {
        int cnt = 0;
        for (int i = 0; i < nums1.length; i++) {
            if (Math.abs(nums1[i] - nums2[i]) <= 2 && nums1[i] != nums2[i]) {
                cnt++;
            }
        }
        return cnt;
    }

    //Given a string, return a new string where the first 5 characters and last 5 characters have been exchanged. If the string length is less than 10 return the unaltered string.
    //
    //
    //
    //frontBack("fligigjqwi") → "gjqwifligi"
    //
    //frontBack("bewikcf") → "bewikcf"
    //
    //frontBack("exbgvvar

    public static String frontBack(String input) {
        if (input.length() < 10) {
            return input;
        }
        String starter = input.substring(0, 5);
        String middle = input.substring(5, input.length() - 5);
        String ender = input.substring(input.length() - 5, input.length());

        return ender + middle + starter;
    }

    //Given an array of ints, return true if the sequence of numbers 1, 2, 3 appears in the array somewhere.
    //
    //Examples
    //arrayOneTwoThree([1, 1, 2, 3, 1])       → true
    //arrayOneTwoThree([1, 1, 2, 4, 1])       → false
    //arrayOneTwoThree([1, 1, 2, 1, 2, 3])   → true
    public static boolean arrayOneTwoThree(int[] ints) {
        for (int i = 0; i < ints.length - 2; i++) {
            if (ints[i] == 1 && ints[i+1] == 2 && ints[i + 2] == 3) {
                return true;
            }
        }
        return false;
    }

    //Write a method which will find the largest integer in an array passed as a parameter.
    //Also output the count of the maximum value.
    //
    //For example:
    //
    //int[] array = {30, 9, 20, 9};
    //findMax(array) →
    //The maximum is: 30
    //The count is: 1
    //
    //int[] array = {15, 2, 3, 15, 12, 6};
    //findMax(array) →
    //The maximum is: 15
    //The count is: 2
    public static void findMax(int[] ints) {
        int max = ints[0];
        boolean hasMax = false;
        int maxCnt = 1;
        for (int i = 1; i < ints.length; i++) {
            if (max < ints[i]) {
                max = ints[i];
            }
            if (max == ints[i]) {
                maxCnt++;
            }
        }
        System.out.println("The maximum is: " + max);
        System.out.println("The count is: " + maxCnt);
    }

    //Given 2 non-negative ints, a and b, return their sum, so long as the sum has the same number of digits as a. If the sum has more digits than a, just return a without b.
    //
    //Note: one way to compute the number of digits of a non-negative int n is to convert it to a string with String.valueOf(n) and then check the length of the string.
    //
    //sumLimit(2, 3) → 5
    //
    //sumLimit(8, 3) → 8
    //
    //sumLimit(8, 1) → 9

    public static int sumLimit(int a, int b) {
        int total = a + b;
        String totalStr = Integer.toString(total);
        String aStr = Integer.toString(a);
        if (totalStr.length() > aStr.length()) {
            return a;
        }
        return total;
    }

    //Given 2 int values, return true if one is negative and one is positive.
    //Except if the parameter "negative" is true, then return true only if both are negative.
    //
    //Examples
    //posNeg(1, -1, false) → true
    //posNeg(-1, 1, false) → true
    //posNeg(-4, -5, true) → true

    public static boolean posNeg(int a, int b, boolean flag) {
        if (flag) {
            return a < 0 && b < 0;
        } else {
            return a * b < 0;
        }
    }


    //Write a program that accepts an array of ints as a parameter,
    // prints the reverse alternating sum -
    // that is, if the array index is even add the value to the total, or if the array index is odd subtract the value from the total,
    // and then prints the array out (on a new line) in the following format:
    //
    //[an, ..., , a2, a1, a0]
    //
    //Note: The array prints with '[' and ']' and the final number prints without a trailing comma.
    //
    //Sample Input:
    //
    //alternatingSum(new int[]{4, 14, 28, 37, 13, 14, 48, 6, 46});
    //
    //Sample Output:
    //
    //68
    //[46, 6, 48, 14, 13, 37, 28, 14, 4]

    public static void alternatingSum(int[] ints) {
        int sum = 0;
        int[] newInts = new int[ints.length];
        for (int i = 0; i < ints.length; i++) {
            if (i % 2 == 0) {
                sum += ints[i];
            } else {
                sum -= ints[i];
            }
            newInts[i] = ints[ints.length - i - 1];
        }
        System.out.println(sum);
        System.out.println(Arrays.toString(newInts));
    }

    //Given two temperatures, return true if one is less than -11 and the other is greater than 78.
    //
    //Examples:
    //icyHot(85, -13)  --> true
    //icyHot(-14, 85) --> true
    //icyHot(2, 85)    --> false

    public static boolean icyHot(int a, int b) {
        if (a < b) {
            return a < -11 && b > 78;
        } else {
            return b < -11 && a > 78;
        }
    }

    //Write a program that reads data from the keyboard creates an array and finds the index of the first maximum in that array.
    //Input data format:
    //The first line contains the number of elements in the array.
    //The second line contains the array elements separated by spaces.
    //*An array always has at least one element.
    //Output data format:
    //Only a single integer value - the first index at which the maximum occurs.
    //Sample Input:
    //
    //5
    //
    //2 5 3 4 5
    //
    //Sample Output:
    //
    //1
    public static void findMax() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Input the size of array, please!");
        int arraySize = scanner.nextInt();
        scanner.nextLine();
        int[] ints = new int[arraySize];
        System.out.println("Input the integer array separated by spaces:");
        String inputArr = scanner.nextLine();
        String[] transformedArr = inputArr.split(" ");
        for (int i = 0; i < transformedArr.length; i++) {
            transformedArr[i] = transformedArr[i].trim();
            ints[i] = Integer.parseInt(transformedArr[i]);
        }
        int max = ints[0];
        int maxIndex = 0;
        for (int i = 1; i < ints.length; i++) {
            if (max < ints[i]) {
                max = ints[i];
                maxIndex = i;
            }
        }
        System.out.println(maxIndex);
    }

    //Given a string, return true if "bad" appears starting at index 0 or 1 in the string, such as with "badxxxor" "xbadxx" but not "xxbadxx". The string may beany length,including O.
    //Note: use .equals() to compare 2 strings
    //hasBad("badxx")-true
    //hasBad("xbadxx")-true
    //hasBad("xxbadxx")->false
    //有没有bad

    public static boolean hasBad(String input) {
        int index = input.indexOf("bad");
        return index == 1 || index == 0;
    }

    public static boolean hadBad(String input) {
        if (input.length() < 3) {
            return false;
        }
        if (input.length() == 3) {
            return input.equals("bad");
        } else {
            String fir = input.substring(0,3);
            String sec = input.substring(1,4);
            return fir.equals("bad") || sec.equals("bad");
        }
    }

    //Write a program that reads the (x, y) coordinates for two points.Compute the distance between the two points using the following formula:
    //Distance = √((x2-x1)2 +(2 -Y1)2)
    //Your output should conform to the following
    //template where distanceis the computed value to a
    //maximum of 2 decimal places:
    //The distance between (x1,y1) and(x2,y2) is
    //distance
    //坐标点问题
    public static double computeDistance() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("input the coordinate of point 1");
        int x1 = scanner.nextInt();
        int y1 = scanner.nextInt();
        System.out.println("input the coordinate of point 2");
        int x2 = scanner.nextInt();
        int y2 = scanner.nextInt();

        double distance = Math.sqrt(Math.pow((x1 - x2),2) + Math.pow((y1 - y2), 2));
        return distance;
    }

