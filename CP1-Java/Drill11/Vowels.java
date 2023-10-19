public class Vowels {
    public static String howManyVowels(String sentence) {
        int aCount = 0, eCount = 0, iCount = 0, oCount = 0, uCount = 0, otherCount = 0;

        for (int i = 0; i < sentence.length(); i++) {
            char c = sentence.charAt(i);

            switch (c) {
                case 'a':
                    aCount++;
                    break;
                case 'e':
                    eCount++;
                    break;
                case 'i':
                    iCount++;
                    break;
                case 'o':
                    oCount++;
                    break;
                case 'u':
                    uCount++;
                    break;
                default:
                    otherCount++;
                    break;
            }
        }

        return String.format("Number of each lowercase vowel in the string:\n" +
                        "a: %d\ne: %d\ni: %d\no: %d\nu: %d\nother characters: %d ",
                aCount, eCount, iCount, oCount, uCount, otherCount);
    }

    public static void main(String[] args) {
        if (args.length == 1) {
            String sentence = args[0];
            System.out.println(howManyVowels(sentence));
        } else {
            System.out.println("Usage: java TestVowels \"<input sentence>\"");
        }
    }
}
