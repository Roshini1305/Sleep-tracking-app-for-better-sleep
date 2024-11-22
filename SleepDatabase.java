import androidx.room.Database;
import androidx.room.RoomDatabase;

@Database(entities = {SleepData.class}, version = 1)
public abstract class SleepDatabase extends RoomDatabase {
    public abstract SleepDao sleepDao();
}
