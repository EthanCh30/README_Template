import java.util.Scanner;

public class Ticket {
    public static void main(String[] args) {
        double age;
        double ticket = 12;
        Scanner keyboard = new Scanner(System.in);

        System.out.println("Please enter your age:");
        age = keyboard.nextDouble();

        if (age <= 8||age>=65) {
            ticket = 6;
        }
        System.out.println("Your ticket costs " + ticket);
    }
}
//done