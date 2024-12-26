public interface Event {
    Long getTimeStamp();
    String getFormattedTimeStamp();
    void process();
}
