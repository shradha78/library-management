package Adapter;

import android.content.Context;
import android.content.Intent;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import android.widget.Toast;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import com.example.library.LibraryDetailsActivity;
import com.example.library.R;

import java.util.List;

import Model.LibraryList;

public class MyAdapter extends RecyclerView.Adapter<MyAdapter.ViewHolder> {
    private Context context;
    private List<LibraryList> listItems;
    public MyAdapter(Context context, List LibraryList){
        this.context=context;
        this.listItems= LibraryList;

    }
    @NonNull
    @Override
    public MyAdapter.ViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View view= LayoutInflater.from(parent.getContext()).inflate(R.layout.listview,parent,false);
        return new ViewHolder(view);
    }

    @Override
    public void onBindViewHolder(@NonNull MyAdapter.ViewHolder holder, int position) {
        LibraryList items=listItems.get(position);
        holder.name.setText(items.getName());
        holder.desc.setText(items.getDescription());

    }

    @Override
    public int getItemCount() {

        return listItems.size();
    }
    //hold all of the list
    public class ViewHolder extends RecyclerView.ViewHolder implements View.OnClickListener {
        public TextView name;
        public TextView desc;
        public ViewHolder(@NonNull View itemView) {
            super(itemView);
            itemView.setOnClickListener(this);
            name=(TextView) itemView.findViewById(R.id.title);
            desc=(TextView) itemView.findViewById(R.id.description);

        }

        @Override
        public void onClick(View v) {
            int position=getAdapterPosition();
            LibraryList item=listItems.get(position);
            Intent intent=new Intent(context, LibraryDetailsActivity.class);

            intent.putExtra("Name",item.getName());
            intent.putExtra("Region",item.getDescription());
            context.startActivity(intent);

            Toast.makeText(context,item.getName(),Toast.LENGTH_LONG).show();
        }
    }
}
