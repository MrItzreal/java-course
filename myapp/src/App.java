public class App {
    public static void main(String[] args) {

        /*
         * What is a 2D array? an array of arrays.
         * 
         * NOTE: There are different ways to work with arrays. You can either:
         * 1-) Create a new array using the "new" keyword without initializing it
         * immediately with values, you use [] to specify its size.
         * 
         * 2-) Declare, create, and initialize an array with values in one step.
         */

        // Dealing with arrays with method "1".
        String[][] cars = new String[3][3];

        // cars [row] [column]
        cars[0][0] = "Camaro";
        cars[0][1] = "Corvette";
        cars[0][2] = "Silverado";
        cars[1][0] = "Mustang";
        cars[1][1] = "Ranger";
        cars[1][2] = "F-150";
        cars[2][0] = "Ferrari";
        cars[2][1] = "Lambo";
        cars[2][2] = "Nissan";

        // Nested loop
        for (int i = 0; i < cars.length; i++) {
            System.out.println();
            for (int j = 0; j < cars[i].length; j++) {
                System.out.print(cars[i][j] + " ");
            }
        }

        System.out.println();

        // Dealing with arrays with method "2".
        String[][] foods = {
                { "Pizza", "Tacos", "Sushi" },
                { "Burger", "HotDog", "Sandwich" },
                { "Oatmeal", "Soup", "Pasta" } };

        // Nested loop
        for (int i = 0; i < foods.length; i++) {
            System.out.println();
            for (int k = 0; k < foods[i].length; k++) {
                System.out.print(foods[i][k] + " ");
            }
        }
    }
}
