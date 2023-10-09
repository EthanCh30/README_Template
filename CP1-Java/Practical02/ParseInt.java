import java.util.Scanner;

public class ParseInt {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        String message1;
        String message2;

        System.out.println("Enter a line of text:");
        message1 = scan.nextLine();

        System.out.println("Enter another line of text:");
        message2 = scan.nextLine();
        String ms3 = message1+message2;
        System.out.println("The complete number is "+(ms3)+" and adding 1 gives "+(Integer.parseInt(ms3) + 1));

    }
//    Done
}
