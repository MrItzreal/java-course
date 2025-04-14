import java.util.ArrayList;

public class App {
    public static void main(String[] args) {
        // ArrayList = a resizable array.
        // Elements can be added and removed after compilation phase.
        // Stores reference data types such as strings.

        ArrayList<String> food = new ArrayList<String>();

        food.add("Pizza");
        food.add("Hamburger");
        food.add("Pizza");

        // Useful ArrayList methods:
        food.set(0, "Sushi");
        food.remove(2);
        // food.clear(); removes the elements.

        for (int i = 0; i < food.size(); i++) {
            System.out.println(food.get(i));
        }
    }
}
