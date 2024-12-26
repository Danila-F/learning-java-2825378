import java.sql.Timestamp;
import java.text.SimpleDateFormat;
import java.util.Date;

public abstract class AbstractEvent implements Event {
    protected final Long createdTimestamp;
    protected final String id;

    public AbstractEvent(String id) {
        this.id = id;
        this.createdTimestamp = new Timestamp(System.currentTimeMillis()).getTime();
    }

    @Override
    public Long getTimeStamp() {
        return this.createdTimestamp;
    }

    @Override
    public String getFormattedTimeStamp() {
        return new SimpleDateFormat("yyyy-MM-dd HH:mm:ss.SSS").format(new Date(getTimeStamp()));
    }

    @Override
    public abstract void process();
}
