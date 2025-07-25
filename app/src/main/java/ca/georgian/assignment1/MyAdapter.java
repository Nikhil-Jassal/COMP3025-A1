package ca.georgian.assignment1;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Toast;

import androidx.annotation.NonNull;
import  androidx.recyclerview.widget.RecyclerView;

import java.util.List;

import ca.georgian.assignment1.model.Item;

public class MyAdapter extends RecyclerView.Adapter<MyViewHolder>{

    List<Item> items;
    Context context;

    public  MyAdapter(Context context, List<Item> item){
        this.context = context;
        this.items = item;
    }
    @NonNull
    @Override
    public MyViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View itemView = LayoutInflater.from(parent.getContext()).inflate(R.layout.item_layout, parent, false);

        MyViewHolder myViewHolder = new MyViewHolder(itemView);

        return myViewHolder;
    }

    @Override
    public void onBindViewHolder(@NonNull MyViewHolder holder, int position) {
        Item item = items.get(position);
        holder.title.setOnClickListener(v -> {
            Toast.makeText(context, "Clicked: " + item.getMovieTitle(), Toast.LENGTH_SHORT).show();});
        holder.studio.setText(item.getMovieStudio());
        holder.rating.setText(item.getMovieRating());
        holder.year.setText(item.getMovieYear());
    }

    @Override
    public int getItemCount() {
        return items.size();
    }
}
