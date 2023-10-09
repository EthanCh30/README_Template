public class CaughtSpeeding {
    public static void main(String[] args) {
        System.out.println(caughtSpeeding(65, false));
    }
    public static int caughtSpeeding(int speed, boolean isBirthday) {
        if (isBirthday) {
            if (speed <= 47) {
                return 0;
            } else if (speed <= 92) {
                return 1;
            } else {
                return 2;
            }
        } else {
            if (speed <= 42) {
                return 0;
            } else if (speed <= 87) {
                return 1;
            } else {
                return 2;
            }
        }
    }
}

