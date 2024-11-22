import androidx.room.Entity;
import androidx.room.PrimaryKey;

@Entity(tableName = "sleep_data")
public class SleepData {

    @PrimaryKey(autoGenerate = true)
    private int id;

    private String sleepStartTime;
    private String sleepEndTime;
    private String duration;

    // Getters and Setters
    public String getSleepStartTime() {
        return sleepStartTime;
    }

    public void setSleepStartTime(String sleepStartTime) {
        this.sleepStartTime = sleepStartTime;
    }

    public String getSleepEndTime() {
        return sleepEndTime;
    }

    public void setSleepEndTime(String sleepEndTime) {
        this.sleepEndTime = sleepEndTime;
    }

    public String getDuration() {
        return duration;
    }

    public void setDuration(String duration) {
        this.duration = duration;
    }
}
