import java.util.*;

public class App {
    public static void main(String[] args) {
        // 2D ArrayList: a dynamic list of lists
        // You can change the size of these lists during runtime
        // To retrieve an element we use .get()

        ArrayList<ArrayList<String>> groceryList = new ArrayList();

        ArrayList<String> bakeryList = new ArrayList();
        bakeryList.add("pasta");
        bakeryList.add("garlic bread");
        bakeryList.add("donuts");

        // System.out.println(bakeryList.get(0));

        ArrayList<String> produceList = new ArrayList();
        produceList.add("tomatoes");
        produceList.add("zucchini");
        produceList.add("peppers");

        // System.out.println(produceList.get(0));

        ArrayList<String> drinksList = new ArrayList();
        drinksList.add("soda");
        drinksList.add("coffee");

        // System.out.println(drinksList.get(0));

        // We are using a double array to print every list within the groceryList
        groceryList.add(bakeryList);
        groceryList.add(produceList);
        groceryList.add(drinksList);

        // Gets one of the arrays
        System.out.println(groceryList.get(1));

        // Gets both the array and the specific element you want
        System.out.println(groceryList.get(1).get(1));
    }
}
