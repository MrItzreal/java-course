public class App {
    public static void main(String[] args) {
        /*
         * toString() = special method that all objects inherit,
         * that returns a string that "textually represents" an object.
         * 
         * NOTES:
         * - Can be used both implicitly and explicitly.
         * - You can override the toString method to return a
         * a string representation of all of the atributes of an object.
         */

        Car car = new Car();

        // Explicit use of the toString method.
        System.out.println(car.toString());

        System.out.println("===OR====");

        // implicit use of the toString method.
        System.out.println(car);
    }
}
