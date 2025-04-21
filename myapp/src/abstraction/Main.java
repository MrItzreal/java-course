public class Main {
  public static void main(String[] args) {

    // abstract classes cannot be instantiated, but they can have a subclass.
    // abstract methods are declared without an implementation.
    // Can be applied to methods and classes when you define them.
    /*
     * It protects from creating an instance of something vague for instance if you
     * ask for a vehicle you would mention the type: truck, car, bike. You wouldnt
     * just say vehicle because it would be vague. Abtract protects your code from
     * this.
     */

    // Vehicle vehicle = new Vehicle();
    Car car = new Car();
    car.go();
  }
}
