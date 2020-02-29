package ru.kve.recyclerview;

import android.os.Bundle;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import java.util.ArrayList;
import java.util.List;

public class MainActivity extends AppCompatActivity {

  private List<RecyclerViewItem> itemsList = new ArrayList<>();
  private RecyclerView recyclerViewMain;
  private RecyclerView.Adapter adapter;
  private RecyclerView.LayoutManager layoutManager;

  @Override
  protected void onCreate(Bundle savedInstanceState) {
    super.onCreate(savedInstanceState);
    setContentView(R.layout.activity_main);

    itemsList.add(new RecyclerViewItem(R.drawable.ic_sentiment_dissatisfied_black_24dp,
        "SAD", "I'm not happy!"));
    itemsList.add(new RecyclerViewItem(R.drawable.ic_sentiment_satisfied_black_24dp,
        "HAPPY", "I'm happy!"));
    itemsList.add(new RecyclerViewItem(R.drawable.ic_sentiment_neutral_black_24dp,
        "NEUTRAL", "I'm neutral!"));

    recyclerViewMain = findViewById(R.id.recyclerViewMain);
    recyclerViewMain.setHasFixedSize(true);
    adapter = new RecyclerViewAdapter(itemsList);
    layoutManager = new LinearLayoutManager(this);
    recyclerViewMain.setAdapter(adapter);
    recyclerViewMain.setLayoutManager(layoutManager);

  }
}
