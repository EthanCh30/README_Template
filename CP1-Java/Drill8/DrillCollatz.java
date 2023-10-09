import java.util.Scanner;

public class DrillCollatz{
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        StringBuilder output = new StringBuilder();
        while (n != 1) {
            output.append(n).append(" ");

            if (n % 2 == 0) {
                n /= 2;
            } else {
                n = 3 * n + 1;
            }
        }
        output.append(1);
        System.out.println(output.toString());
    }
}
