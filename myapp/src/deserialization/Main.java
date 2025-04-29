import java.io.*;

public class Main {
  public static void main(String[] args) throws IOException, ClassNotFoundException {

    User user = null;

    FileInputStream fileIn = new FileInputStream(
        "/Users/callmeizzy/Desktop/java-course/myapp/src/serialization/UserInfo.ser");
    ObjectInputStream in = new ObjectInputStream(fileIn);
    user = (User) in.readObject();
    in.close();
    fileIn.close();

    System.out.println(user.name);
    System.out.println(user.password);
    user.sayHello();
  }
}

/*
 * STEPS to Deserialize:
 * 1-) Declare your object (don't instantiate).
 * 2-) Your class should implement 'Serializable' interface.
 * 3-) add import java.io.Serializable.
 * 4-) FileInputStream fileIn = new FileInputStream(file path).
 * 5-) ObjectInputStream in = new ObjectInputStream(fileIn).
 * 6-) objectNam = (Class) in.readObject().
 * 7-) in.close(); fileIn.close();
 */