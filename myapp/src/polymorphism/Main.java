public class Main {
  public static void main(String[] args) {
    /*
     * polymorphism = Greek work for poly-"many", morph-"form".
     * The ability of an object to identify as more than one type.
     */

    // Car, bicycle, boat identify as car, bicycle and boat but also as vehicles:
    Car car = new Car();
    Bicycle bicycle = new Bicycle();
    Boat boat = new Boat();

    // We use Vehicle as data type since all 3 instances are extensions of it
    Vehicle[] racers = { car, bicycle, boat };

    // We could call each class like this
    // car.go();
    // bicycle.go();
    // boat.go();

    for (Vehicle x : racers) {
      x.go();
    }
  }

}