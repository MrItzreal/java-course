public class Car {
  private String make;
  private String model;
  private int year;

  Car(String make, String model, int year) {
    this.make = make;
    this.model = model;
    this.year = year;

  }

  // Getter method:
  public String getMake() {
    return make;
  }

  public String getModel() {
    return model;
  }

  public int getYear() {
    return year;
  }

  // Setter method:
  public void setMake(String make) {
    this.make = make;
  }

  public void setModel(String model) {
    this.model = model;
  }

  public void setYear(int year) {
    this.year = year;
  }

}
