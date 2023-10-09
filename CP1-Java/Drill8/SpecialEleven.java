public class SpecialEleven {
    public static void main(String[] args) {
        System.out.println(specialEleven(10));


    }
    public static boolean specialEleven(int n) {
        return n % 11 == 0 || n % 11 == 1;
    }

}
