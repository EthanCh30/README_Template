public class RecordEvents {

    public static void main(String[] args) {

        Recorder r1 = new Recorder(100, 100, "Wombat Detection");
        r1.recordEvent("09:22", 20);
        r1.recordEvent("11:05", 20);
        r1.recordEvent("12:57", 20);
        r1.recordEvent("11:36", 10);
        r1.recordEvent("12:59", 10);
        r1.recordEvent("12:06", 10);
        r1.printInfoEvents();
    }
}
