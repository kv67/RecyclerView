package ru.kve.recyclerview;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

public class RecyclerViewAdapter extends RecyclerView.Adapter<RecyclerViewAdapter.RecyclerViewHolder> {

  @NonNull
  @Override
  public RecyclerViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
    View view = LayoutInflater.from(parent.getContext()).inflate(R.layout.recycler_item,
        parent, false);
    return new RecyclerViewHolder(view);
  }

  @Override
  public void onBindViewHolder(@NonNull RecyclerViewHolder holder, int position) {

  }

  @Override
  public int getItemCount() {
    return 0;
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
