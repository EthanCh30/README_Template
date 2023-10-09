import java.util.Scanner;

class Coins {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int num;

        System.out.print("Enter an amount of cents in the range 0 to 100: ");
        num = scan.nextInt();
        // output goes here
        if (num >= 0 && num <= 100) {
            System.out.println("Dispensing...");
            int[] change = dispenseChange(num);
            System.out.println(change[0] + " 20c coin(s)");
            System.out.println(change[1] + " 5c coin(s)");
            System.out.println(change[2] + " 1c coin(s)");
        } else {
            System.out.println("Please enter a valid amount between 0 and 100.");
        }
    }
    public static int[] dispenseChange(int amount) {
        int[] coins = new int[3]; // Index 0: 20c coins, Index 1: 5c coins, Index 2: 1c coins

        coins[0] = amount / 20;
        amount %= 20;

        coins[1] = amount / 5;
        amount %= 5;

        coins[2] = amount;

        return coins;
    }
}



