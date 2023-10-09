import java.util.Scanner;

public class Echo {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        String message1;
        String message2;

        System.out.println("Enter a line of text:");
        message1 = scan.nextLine();


        System.out.println("Enter another line of text:");
        message2 = scan.nextLine();

        System.out.println("You entered " + message2+", "+message1);
    }
//    done
}
