import java.text.SimpleDateFormat;
import java.util.Date;

public class Recorder {

    private int xPos, yPos;
    private String eventType;
    private int EVENT_MAX = 10;
    private String[] event = new String[EVENT_MAX];
    private EventInformation[] eventInfo = new EventInformation[EVENT_MAX];
    private int xEvent = 0;  // keeps track of how many events have occurred
    public Recorder(int xPos, int yPos, String eventType) {
        this.xPos = xPos;
        this.yPos = yPos;
        this.eventType = eventType;
    }

    public void recordEvent(String eventTime) {
        if (xEvent + 1 > EVENT_MAX) {
            System.out.println("Event log overflow - terminating");
            throw new ArrayIndexOutOfBoundsException();
        }
        event[xEvent] = eventTime;
        xEvent++;
    }

    public void recordEvent(String eventTime, int datum) {
        if (xEvent >= EVENT_MAX - 1) {
            System.out.println("Event log overflow - terminating");
            throw new ArrayIndexOutOfBoundsException();
        }
        String[] timeArr = eventTime.split(":");
        if (timeArr.length != 2)
        {
            System.out.println("Invalid time format: " + eventTime +", ignoring event");
            return;
        }
        try
        {
            double hour = Double.parseDouble(timeArr[0]);
            if (hour > 23 || hour < 1 || timeArr[0].length() > 2) {
                System.out.println("Invalid hour in time: " + eventTime + ", ignoring event");
                return;
            }
        }
        catch (Exception ex) {
            System.out.println("Invalid time format: " + eventTime +", ignoring event");
            return;
        }
        try
        {
            double minutes = Double.parseDouble(timeArr[1]);
            if (minutes > 59 || minutes < 1 || timeArr[1].length() > 2) {
                System.out.println("Invalid minute in time: " + eventTime + ", ignoring event");
                return;
            }
        }
        catch (Exception ex) {
            System.out.println("Invalid time format: " + eventTime +", ignoring event");

            return;
        }

        if(xEvent > 0) {
            try
            {
                EventInformation lastInfo = eventInfo[xEvent - 1];
                if(lastInfo != null) {
                    String lastTime = lastInfo.getEventTime();
                    SimpleDateFormat parser = new SimpleDateFormat("HH:mm");

                    Date last = parser.parse(lastTime);

                    Date now = parser.parse(eventTime);

                    if (now.compareTo(last) <= 0)
                    {
                        System.out.println("Event out of sequence: " + eventTime + ", ignoring event");
                        return;
                    }
                }
            }
            catch(Exception ignoreEx){
            }
        }
        eventInfo[xEvent] = new EventInformation(eventTime, datum);
        xEvent++;
    }

    public void printEvents() {
        System.out.println("Record of " + eventType
                + " events at [" + xPos + "," + yPos + "]");
        for (int i = 0; i < event.length; i++) {
            String flag = event[i];
            if(flag != null) {
                System.out.println("Event number " + i + " was recorded at " + flag);
            }
        }
    }

    public void printInfoEvents() {
        System.out.println("Record of " + eventType
                + " events at [" + xPos + "," + yPos + "]");
        for (int i = 0; i < eventInfo.length; i++) {
            EventInformation flag = eventInfo[i];
            if(flag != null) {
                System.out.println("Event number " + i + " was recorded at " + flag.getEventTime() + " with datum = " + flag.getEventDatum());
            }
        }
    }
}
