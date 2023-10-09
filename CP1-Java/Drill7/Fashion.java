public class Fashion {


        public static int dateFashion(int you, int date) {
            // If either of you has style 2 or less, then no table.
            if (you <= 2 || date <= 2) {
                return 0;
            }

            // If either of you is very stylish (8 or more), then yes.
            if (you >= 8 || date >= 8) {
                return 2;
            }

            // Otherwise, maybe.
            return 1;
        }


    public static void main(String[] args) {
        // Test the function
        System.out.println(dateFashion(5, 10));  // Output should be 2
        System.out.println(dateFashion(5, 2));   // Output should be 0
        System.out.println(dateFashion(5, 5));   // Output should be 1
        System.out.println(dateFashion(6, 6));   // Output should be 1
    }


}
