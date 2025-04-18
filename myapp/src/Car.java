public class Car {

  String make = "Nissan";
  String model = "Rogue";
  int year = 2024;
  String color = "White";
  double price = 40000.00;

  public String toString() {
    // You can write this like this:
    // String myString = make + "\n" + model + "\n" + color + "\n" + year;

    // You can also write it like this:
    return make + "\n" + model + "\n" + color + "\n" + year;
  }

  // void examples:
  void drive() {
    System.out.println("You drive the car");
  }

  void brake() {
    System.out.println("You stepped on the brakes");
  }
}
