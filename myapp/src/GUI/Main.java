import java.awt.Color;
import javax.swing.ImageIcon;
import javax.swing.JFrame;

public class Main {
  public static void main(String[] args) {
    // JFrame = a GUI window to add components to.
    /*
     * JFrame frame = new JFrame(); // creates an instance of a frame.
     * frame.setTitle("JFrame Title Here!"); // sets title of frame.
     * frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE); // exit out
     * application.
     * frame.setResizable(false); // prevents frame from being resized.
     * frame.setSize(420, 420); // sets width & height of frame.
     * frame.setVisible(true); // makes frame visible.
     * 
     * ImageIcon image = new ImageIcon("sonic.png"); // create an ImageIcon.
     * frame.setIconImage(image.getImage()); // change icon of frame.
     * 
     * // Different ways to changing background colors:
     * // frame.getContentPane().setBackground(Color.blue); // change color of
     * background.
     * frame.getContentPane().setBackground(new Color(123, 50, 250)); //changes with
     * rgb's.
     */

    MyFrame myFrame = new MyFrame();
  }
}
