package sy.e.serverconn.Utils;


import android.annotation.SuppressLint;
import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;
import java.util.ArrayList;
import sy.e.serverconn.R;


public class ServerAdapter extends RecyclerView.Adapter<ServerViewHolder> {

    ArrayList<String> arrayList;
    Context context;

    public ServerAdapter(@NonNull ArrayList<String> arrayList) {

        this.arrayList = arrayList;

    }


    @NonNull
    @Override
    public ServerViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        return new ServerViewHolder(LayoutInflater.from(parent.getContext()).inflate(R.layout.activityadapter,parent,false));
    }

    @SuppressLint("SetTextI18n")
    @Override
    public void onBindViewHolder(@NonNull ServerViewHolder holder, int position) {

        String string = arrayList.get(position);
        holder.all.setText(string);
        holder.num.setText(""+(position+1));

    }

    @Override
    public int getItemCount() {
        return arrayList.size();
    }
}
