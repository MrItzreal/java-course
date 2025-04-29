public class Main {
  public static void main(String[] args) {
    MyGenericClass<Integer, Integer> myInt = new MyGenericClass<>(1, 2);
    MyGenericClass<Double, Double> myDouble = new MyGenericClass<>(3.14, 4.26);
    
    // bounded 'Number' type so anything that is not Numbers cannot be used:
    // MyGenericClass<Character, Character> myChar = new MyGenericClass<>('@', '$');
    // MyGenericClass<String, Character> myString = new MyGenericClass<>("Hello", '#');

    System.out.println(myInt.getValue());
    System.out.println(myDouble.getValue());
    // System.out.println(myChar.getValue());
    // System.out.println(myString.getValue());
  }
}
