import java.io.File;

public class Main {
  public static void main(String[] args) {
    // file = An abstract representation of file and directory pathnames.

    File file = new File("secret_message.txt");

    if (file.exists()) {
      System.out.println("This file exists");
      System.out.println(file.getPath()); // secret_message.txt
      System.out.println(file.getAbsolutePath()); // /Users/callmeizzy/Desktop/java-course/myapp/src/file_class/secret_message.txt
      System.out.println(file.isFile()); // This determines if it is a file by true/false in this case is 'true'.
      file.delete(); // Deletes the file in question.
    } else {
      System.out.println("This file does not exist");
    }
  }
}
