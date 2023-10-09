public class CountNumbers {

    public static int arrayCountNumber(int[] array) {
        int count = 0;
        for (int num : array) {
            if (num == 3) {
                count++;
            }
        }
        return count;
    }

    public static void main(String[] args) {
        int[] array1 = {8, 6, 3};
        System.out.println(arrayCountNumber(array1)); // Expected output: 1

        int[] array2 = {7, 3, 3};
        System.out.println(arrayCountNumber(array2)); // Expected output: 2

        int[] array3 = {5, 3, 3, 5, 3};
        System.out.println(arrayCountNumber(array3)); // Expected output: 3

        int[] array4 = {3, 9, 5, 3};
        System.out.println(arrayCountNumber(array4)); // Expected output: 2
    }
}
