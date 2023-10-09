import java.util.Scanner;

public class DrillSleepPattern {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int A = scan.nextInt();
        int B = scan.nextInt();
        int H = scan.nextInt();

        if (H<A){
            System.out.println("Deficiency");
        } else if (H>A&&H<B) {
            System.out.println("Normal");
        }else if (H==A||H==B) {
                System.out.println("Normal");
        }else if (H>B){
            System.out.println("Excess");
        }
    }
}
