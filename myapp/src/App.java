public class App {
    public static void main(String[] args) {
        /*
         * static: modifier. A single copy of a variable/method is created and shared.
         * 
         * The class "owns" the static member.
         */

        Friend friend1 = new Friend("Pokemon");
        Friend friend2 = new Friend("Ozzi");
        Friend friend3 = new Friend("Momo");
        Friend friend4 = new Friend("Lala");


        Friend.displayFriends();
    }
}
