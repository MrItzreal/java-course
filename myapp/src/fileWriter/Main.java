import java.io.FileWriter;
import java.io.IOException;

public class Main {
  public static void main(String[] args) {
    try {
      FileWriter writer = new FileWriter("poem.txt");
      writer.write("Lorem ipson soooonnnnn \nGetting goooo rocket \neating good food \nbut im not hungry right now!");
      writer.append("\n(A story by Izzy)");
      writer.close(); // Make sure to close before moving forward
    } catch (IOException e) {
      e.printStackTrace();
    }
  }
}
