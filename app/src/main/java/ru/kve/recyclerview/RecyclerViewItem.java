package ru.kve.recyclerview;

public class RecyclerViewItem {
  private int imageResource;
  private String textFirst;
  private String textSecond;

  public RecyclerViewItem(int imageResource, String textFirst, String textSecond) {
    this.imageResource = imageResource;
    this.textFirst = textFirst;
    this.textSecond = textSecond;
  }

  public int getImageResource() {
    return imageResource;
  }

  public String getTextFirst() {
    return textFirst;
  }

  public String getTextSecond() {
    return textSecond;
  }
}
