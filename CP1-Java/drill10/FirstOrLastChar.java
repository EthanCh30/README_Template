public class FirstOrLastChar {
    public static void main(String[] args) {
        System.out.println(firstOrLastChar("yad"));
        System.out.println(firstOrLastChar("kwk"));
        System.out.println(firstOrLastChar("gals"));
        System.out.println(firstOrLastChar("uocrws"));

    }

    public static char firstOrLastChar(String str) {
            return str.length() > 4 ? str.charAt(0) : str.charAt(str.length() - 1);
        }
    }

