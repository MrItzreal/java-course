public class Main {
  /*
   * Encapsulation = attributes of a class will be hidden or private,
   * Can be accessed only through methods (getters & setters),
   * You should make attributes private if you don't have a reason to
   * make them public or protected.
   */

  public static void main(String[] args) {
    Car car = new Car("Nissan", "Rogue", 2024);
    // Getter:
    System.out.println(car.getMake());
    System.out.println(car.getModel());
    System.out.println(car.getYear());

    car.setMake("Toyota");
    car.setModel("Rav-4");
    car.setYear(2023);

    System.out.println("-----------");
    // Setter:
    System.out.println(car.getMake());
    System.out.println(car.getModel());
    System.out.println(car.getYear());
  }
}
