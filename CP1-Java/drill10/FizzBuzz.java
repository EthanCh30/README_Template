public class FizzBuzz {
    public static void main(String[] args) {
        String[] array = fizzBuzz(30, 40);
        int i;
        for(i = 0; i < array.length - 1; i++) {
            System.out.print(array[i] + ", ");
        }
        System.out.println(array[i]);
    }

    public static String[] fizzBuzz(int start, int end) {
        String[] result = new String[end - start];

        for (int i = start; i < end; i++) {
            if (i % 3 == 0 && i % 5 == 0) {
                result[i - start] = "FizzBuzz";
            } else if (i % 3 == 0) {
                result[i - start] = "Fizz";
            } else if (i % 5 == 0) {
                result[i - start] = "Buzz";
            } else {
                result[i - start] = String.valueOf(i);
            }
        }

        return result;
    }
}
