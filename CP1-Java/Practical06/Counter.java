public class Counter {
    private int currentCount;
    private int stepSize;

    // Constructor with both starting value and step size specified
    public Counter(int startValue, int stepSize) {
        this.currentCount = startValue;
        this.stepSize = stepSize;
        System.out.println("Creating Counter object with a starting value of " + startValue + " and a step size of " + stepSize);
    }

    // Constructor with only starting value specified
    public Counter(int startValue) {
        this.currentCount = startValue;
        this.stepSize = 1;  // Set step size to 1
        System.out.println("Creating Counter object with a starting value of " + startValue);
    }
    public void countUp(int n) {
        System.out.println("*** Counting up " + n);
        for (int step = 1; step <= n; step++) {
            System.out.println("counter = " + currentCount);
            currentCount += stepSize;
        }
    }
    public void countUp(int n, char op) {
        System.out.println("*** Counting up " + n + ", operation is " + op);
        for (int step = 1; step <= n; step++) {
            System.out.println("counter = " + currentCount);
            switch (op) {
                case '+' -> currentCount += stepSize;
                case '-' -> currentCount -= stepSize;
                case '*' -> currentCount *= stepSize;
                default -> {
                    System.out.println("Invalid operation: " + op);
                    return;
                }
            }
        }
    }

    public void countDown(int n) {
        System.out.println("*** Counting down " + n);
        for (int step = 1; step <= n && currentCount > 0; step++) {
            currentCount -= stepSize;
            System.out.println("counter = " + currentCount);
        }
    }
}