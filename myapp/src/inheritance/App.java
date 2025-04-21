public class App {
    public static void main(String[] args) {
        /*
         * inheritance = the process where one class acquires,
         * the attributes and methods of another.
         * 
         * NOTES: In order to use inheritance, you first define a class and then use the
         * "extend" keywor alongside the name of the
         * class you want to receive from.
         */

        Car car = new Car();
        // car.go();

        Bicycle bicycle = new Bicycle();
        // bicycle.stop();

        // System.out.println(car.speed);
        // System.out.println(bicycle.speed);

        System.out.println(car.doors);
        System.out.println(bicycle.pedals);

    }
}
