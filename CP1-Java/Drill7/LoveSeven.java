public class LoveSeven {

    public static boolean loveSeven(int a, int b) {
        // Check if either one is 7
        if (a == 7 || b == 7) {
            return true;
        }

        // Check if their sum is 7
        if (a + b == 7) {
            return true;
        }

        // Check if their absolute difference is 7
        if (Math.abs(a - b) == 7) {
            return true;
        }

        return false;
    }

    public static void main(String[] args) {
        // Test the function
        System.out.println(loveSeven(7, 5));  // Output should be true
        System.out.println(loveSeven(9, 5));  // Output should be false
        System.out.println(loveSeven(6, 1));  // Output should be true
        System.out.println(loveSeven(15, 2)); // Output should be false
    }
}
