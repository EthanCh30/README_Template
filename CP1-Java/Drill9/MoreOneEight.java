public class MoreOneEight {

    public static boolean moreOneEight(int[] numbers) {
        int countOne = 0;
        int countEight = 0;

        for (int num : numbers) {
            if (num == 1) {
                countOne++;
            } else if (num == 8) {
                countEight++;
            }
        }

        return countOne > countEight;
    }

    public static void main(String[] args) {
        int[] nums = {8, 1, 1, 8, 1, 8, 8, 8, 8, 8};
        System.out.println(moreOneEight(nums)); // Expected output: false
    }
}
