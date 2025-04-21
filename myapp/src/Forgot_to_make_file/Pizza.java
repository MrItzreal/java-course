package Forgot_to_make_file;
public class Pizza {

  String bread;
  String sauce;
  String cheese;
  String topping;

  Pizza() {
    System.out.println("This ain't even a pizza");
  }

  Pizza(String bread) {
    this.bread = bread;

  }

  Pizza(String bread,
      String sauce) {
    this.bread = bread;
    this.sauce = sauce;

  }

  Pizza(String bread,
      String sauce,
      String cheese) {
    this.bread = bread;
    this.sauce = sauce;
    this.cheese = cheese;

  }

  Pizza(String bread,
      String sauce,
      String cheese,
      String topping) {
    this.bread = bread;
    this.sauce = sauce;
    this.cheese = cheese;
    this.topping = topping;
  }

}
