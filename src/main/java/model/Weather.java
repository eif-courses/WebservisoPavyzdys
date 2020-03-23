package model;

import com.google.gson.annotations.SerializedName;

import java.util.List;

public class Weather {
  private String date;
  List<Celebrations> celebrations;

  public String getDate() {
    return date;
  }

  public List<Celebrations> getList() {
    return celebrations;
  }

  @Override
  public String toString() {
    return "Weather{" +
        "date='" + date + '\'' +
        ", list=" + celebrations +
        '}';
  }
}
