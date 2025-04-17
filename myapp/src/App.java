public class App {
    public static void main(String[] args) {
        /*
         * constructor = special method that is called when an object is
         * 'instantiated' fancy word for 'created'.
         */
        Human human1 = new Human("Izzy", 49, 70);
        Human human2 = new Human("Bro", 92, 30);

        System.out.println(human1.name);
        System.out.println(human2.name);
        human1.eat();
        human2.drink();
    }
}
