public class App {
    public static void main(String[] args) {

        Garage garage = new Garage();
        Car car1 = new Car("BWM");
        Car car2 = new Car("Nissan");

        garage.park(car1);
        garage.park(car2);

    }
}
