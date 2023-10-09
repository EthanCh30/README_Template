public class FindMin {

    public static void findMin(int[] array) {
        if (array == null || array.length == 0) {
            System.out.println("Array is empty or null.");
            return;
        }

        int minValue = array[0];
        int count = 1;

        for (int i = 1; i < array.length; i++) {
            if (array[i] < minValue) {
                minValue = array[i];
                count = 1;
            } else if (array[i] == minValue) {
                count++;
            }
        }

        System.out.println("The minimum is: " + minValue);
        System.out.println("The count is: " + count);
    }

    public static void main(String[] args) {
        int[] array1 = {30, 9, 20, 9};
        findMin(array1);

        int[] array2 = {19, -6, 10, 25, 31, -3, 17, 20, 9};
        findMin(array2);
    }
}
