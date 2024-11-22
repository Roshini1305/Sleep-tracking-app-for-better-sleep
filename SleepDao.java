import androidx.room.Dao;
import androidx.room.Insert;
import androidx.room.Query;

import java.util.List;

@Dao
public interface SleepDao {

    @Insert
    void insert(SleepData sleepData);

    @Query("SELECT * FROM sleep_data ORDER BY id DESC")
    List<SleepData> getAllSleepData();
}
