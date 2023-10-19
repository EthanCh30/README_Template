public class DrawPatch {
    public static void drawPatch(int width, int height, char primary, char secondary) {
        for (int i = 0; i < height; i++) {
            for (int j = 0; j < width; j++) {
                // Check if the column is even or odd and print the respective character with a space.
                if (j % 2 == 0) {
                    System.out.print(primary + " ");
                } else {
                    System.out.print(secondary + " ");
                }
            }
            System.out.println(); // Move to the next line after each row.
        }
    }

    public static void main(String[] args) {
        int width = 8;
        int height = 10;
        char primary = '-';
        char secondary = '+';

        drawPatch(width, height, primary, secondary);
    }
}
