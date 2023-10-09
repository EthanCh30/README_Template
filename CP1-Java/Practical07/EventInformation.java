public class EventInformation {


    private String eventTime;

    public String getEventTime() {
        return this.eventTime;
    }

    private int eventDatum;

    public int getEventDatum() {
        return this.eventDatum;
    }

    public EventInformation(String eventTime, int eventDatum) {
        this.eventTime = eventTime;
        this.eventDatum = eventDatum;
    }
}
