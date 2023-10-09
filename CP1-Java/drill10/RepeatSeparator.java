public class RepeatSeparator {
    public static void main(String[] args) {
        System.out.println(repeatSeparator("E", "Sek", 3));
        System.out.println(repeatSeparator("Word", "X", 3));
        System.out.println(repeatSeparator("This", "And", 2));
        System.out.println(repeatSeparator("This", "And", 1));
    }

    public static String repeatSeparator(String word, String sep, int count) {
        if (count <= 0) {
            return "";
        }

        StringBuilder result = new StringBuilder(word);

        for (int i = 1; i < count; i++) {
            result.append(sep).append(word);
        }

        return result.toString();
    }
}
