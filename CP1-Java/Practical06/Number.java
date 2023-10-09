public class Number {
    public static void main(String[] args) {
        System.out.println("Starting Application...");
        Counter c = new Counter(1,3);
        c.countUp(5, '*');
        Counter c1 = new Counter(5);
        c1.countUp(2, '-');
        c1.countUp(2, '?');
    }
}