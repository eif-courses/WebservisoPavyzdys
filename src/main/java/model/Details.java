package model;

public class Details {
  private String id;
  private String productName;

  public String getId() {
    return id;
  }

  public String getProductName() {
    return productName;
  }

  @Override
  public String toString() {
    return "Details{" +
        "id='" + id + '\'' +
        ", productName='" + productName + '\'' +
        '}';
  }
}
