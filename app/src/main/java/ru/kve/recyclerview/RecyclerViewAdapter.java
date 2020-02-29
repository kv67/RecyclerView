package ru.kve.recyclerview;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import java.util.List;

public class RecyclerViewAdapter extends RecyclerView.Adapter<RecyclerViewAdapter.RecyclerViewHolder> {

  private List<RecyclerViewItem> items;

  public RecyclerViewAdapter(List<RecyclerViewItem> items) {
    this.items = items;
  }

  @NonNull
  @Override
  public RecyclerViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
    View view = LayoutInflater.from(parent.getContext()).inflate(R.layout.recycler_item,
        parent, false);
    return new RecyclerViewHolder(view);
  }

  @Override
  public void onBindViewHolder(@NonNull RecyclerViewHolder holder, int position) {
    holder.imageView.setImageResource(items.get(position).getImageResource());
    holder.textViewFirst.setText(items.get(position).getTextFirst());
    holder.textViewSecond.setText(items.get(position).getTextSecond());
  }

  @Override
  public int getItemCount() {
    return items.size();
  }

  public static class RecyclerViewHolder extends RecyclerView.ViewHolder {

    private ImageView imageView;
    private TextView textViewFirst;
    private TextView textViewSecond;

    public RecyclerViewHolder(@NonNull View itemView) {
      super(itemView);
      imageView = itemView.findViewById(R.id.imageView);
      textViewFirst = itemView.findViewById(R.id.textViewFirst);
      textViewSecond = itemView.findViewById(R.id.textViewSecond);
    }
  }
}
