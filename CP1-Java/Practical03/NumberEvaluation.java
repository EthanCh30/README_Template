import java.util.Scanner;

/**
 * @author moon0016
 */
public class NumberEvaluation {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        // prompt the user for a number
        System.out.println("Enter an integer:");
        int num = scan.nextInt();
        String num1;
        String num2;
        // determine whether it is positive, negative, or zero
        if (num>0){
            num1="Positive";
        }else if (num<0){
            num1="Negative";
        }else {
            num1="Zero";
        }
        // determine whether it is odd or even
        if (num%2==0){
            num2="even";
        }else {
            num2="odd";
        }
        // output the results
        System.out.println(num1 + " and "+num2);
    }

}
//done
