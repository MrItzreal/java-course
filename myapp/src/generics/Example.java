public class Example {
  public static void main(String[] args) {
    /*
     * generics = enables types (classes and interfaces) to be parameters when
     * defining:
     * classes, interfaces and methods.
     * - A benefit is to eliminate the need to create multiple versions of methods
     * or classes for various data types. Use 1 version for all reference data
     * types.
     * 
     * bounded types = you can create the objects of a generic class to have data,
     * of specific derived types ex: Number.
     */

    Integer[] intArray = { 1, 2, 3, 4, 5 };
    Double[] doubleArray = { 5.5, 4.4, 3.3, 2.2, 1.1 };
    Character[] charArray = { 'H', 'E', 'L', 'L', 'O' };
    String[] stringArray = { "B", "Y", "E" };

    // displayArr(intArray);
    // displayArr(doubleArray);
    // displayArr(charArray);
    // displayArr(stringArray);

    System.out.println(getFirst(intArray));
    System.out.println(getFirst(doubleArray));
    System.out.println(getFirst(charArray));
    System.out.println(getFirst(stringArray));
  }

  // public static <T> void displayArr(T[] array) {
  //   for (T x : array) {
  //     System.out.print(x + " ");
  //   }
  //   System.out.println();
  // }

  public static <T> T getFirst(T[] array) {
    return array[0];
  }
}
