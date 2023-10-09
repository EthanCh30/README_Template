public class Calculation {
    public static void main(String[] args) {
        double num1 = 56.87, num2 = 616.29;
        char c = '-';
        System.out.println("The value of the calculation is: " + doCalculation(num1, num2, c));
    }

    public static double doCalculation(double num1, double num2, char type) {
        double result = 0;

        switch (type) {
            case '+':
                result = num1 + num2;
                break;
            case '-':
                result = (num1 > num2) ? num1 - num2 : num2 - num1;
                break;
            case '*':
                result = num1 * num2;
                break;
            case '/':
                result = (num2 == 0) ? 0 : num1 / num2;
                break;
            case '%':
                result = num1 % num2;
                break;
            default:
                return -1.0;
        }

        // Round to two decimal places
        result = Math.round(result * 100.0) / 100.0;
        return result;
    }
}
