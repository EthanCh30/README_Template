public class CentredAverage {
    public static int centredAverage(int[] nums) {
        //TODO your code goes here
        int smallest = Integer.MAX_VALUE;
        int largest = Integer.MIN_VALUE;
        int sum = 0;
        int count = 0;

        for (int num : nums) {
            sum += num;
            if (num < smallest) {
                smallest = num;
            }
            if (num > largest) {
                largest = num;
            }
        }

        sum -= smallest;
        sum -= largest;

        count = nums.length - 2;

        return sum / count;
    }
}
