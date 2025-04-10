public class App {
    public static void main(String[] args) {

        // array = Stores multiple values in a single variable.

        /* Simple way to work with arrays */
        System.out.println("Phone Brands: ");
        String[] cellphones = { "Motorola", "iPhone", "Nokia" };
        cellphones[1] = "BlackBerry";
        System.out.println(cellphones[2]);

        /*
         * This is another method to work with arrays by first declaring
         * the amount of elements we would like to have in the array and then
         * we assign the values.
         */
        System.out.println("Car Brands: ");
        String[] cars = new String[3];

        cars[0] = "Nissan";
        cars[1] = "Toyota";
        cars[2] = "Tesla";

        for (int i = 0; i < cars.length; i++) {
            System.out.println(cars[i]);
        }
    }
}
