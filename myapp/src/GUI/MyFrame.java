import javax.swing.ImageIcon;
import javax.swing.JFrame;
import java.awt.Color;

public class MyFrame extends JFrame {
  MyFrame() {

    this.setTitle("JFrame Title Here!"); // sets title of frame.
    this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE); // exit out application.
    this.setResizable(false); // prevents frame from being resized.
    this.setSize(420, 420); // sets width & height of frame.
    this.setVisible(true); // makes frame visible.

    ImageIcon image = new ImageIcon("sonic.png"); // create an ImageIcon.
    this.setIconImage(image.getImage()); // change icon of frame.

    // Different ways to changing background colors:
    // frame.getContentPane().setBackground(Color.blue); // change color of
    // background.
    this.getContentPane().setBackground(new Color(123, 50, 250)); // changes with rgb's.
  }
}
