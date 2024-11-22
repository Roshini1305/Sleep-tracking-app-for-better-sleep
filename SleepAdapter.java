import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import androidx.recyclerview.widget.RecyclerView;

import java.util.List;

public class SleepAdapter extends RecyclerView.Adapter<SleepAdapter.SleepViewHolder> {

    private List<SleepData> sleepDataList;

    public SleepAdapter(List<SleepData> sleepDataList) {
        this.sleepDataList = sleepDataList;
    }

    @Override
    public SleepViewHolder onCreateViewHolder(ViewGroup parent, int viewType) {
        View view = LayoutInflater.from(parent.getContext()).inflate(R.layout.item_sleep_data, parent, false);
        return new SleepViewHolder(view);
    }

    @Override
    public void onBindViewHolder(SleepViewHolder holder, int position) {
        SleepData currentData = sleepDataList.get(position);
        holder.sleepStartTextView.setText(currentData.getSleepStartTime());
        holder.sleepEndTextView.setText(currentData.getSleepEndTime());
        holder.durationTextView.setText(currentData.getDuration());
    }

    @Override
    public int getItemCount() {
        return sleepDataList.size();
    }

    public static class SleepViewHolder extends RecyclerView.ViewHolder {

        TextView sleepStartTextView, sleepEndTextView, durationTextView;

        public SleepViewHolder(View itemView) {
            super(itemView);
            sleepStartTextView = itemView.findViewById(R.id.sleepStartTime);
            sleepEndTextView = itemView.findViewById(R.id.sleepEndTime);
            durationTextView = itemView.findViewById(R.id.sleepDuration);
        }
    }
}
