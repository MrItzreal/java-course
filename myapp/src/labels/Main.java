import javax.swing.BorderFactory;
import javax.swing.ImageIcon;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.border.Border;

import java.awt.Color;
import java.awt.Font;
import java.awt.Image;

public class Main {
  public static void main(String[] args) {
    /*
     * JLabel = a GUI display area for a string of text, image or both.
     * You can add text in the label like:
     * JLabel label = new JLabel("Izzy pz lemonsqueezy!");
     * OR you can add the text afterwards using .setText().
     */

    ImageIcon image = new ImageIcon("sonic.png"); // gets image from src.
    Border border = BorderFactory.createLineBorder(Color.green, 3);

    JLabel label = new JLabel(); // creates label
    label.setText("Izzy pz lemon squeezy!"); // sets text of label
    label.setIcon(image); // sets image.
    label.setHorizontalTextPosition(JLabel.CENTER); // set text: LEFT, CENTER, RIGHT of imageicon
    label.setVerticalTextPosition(JLabel.TOP); // set text TOP, CENTER, BOTTOM of imageicon
    label.setForeground(new Color(0x00FF00));
    label.setFont(new Font("MV Boli", Font.PLAIN, 50)); // set font of text.
    label.setIconTextGap(20); // sets gap of text to image it can be a negative number.
    label.setBackground(Color.black); // set background color
    label.setOpaque(true); // display background color
    label.setBorder(border);
    label.setVerticalAlignment(JLabel.CENTER); // set vertical position of icon+text within label
    label.setHorizontalAlignment(JLabel.CENTER); // set horizontal position of icon+text within label
    // label.setBounds(0, 0, 250, 250); // sets x,y position within frame as well as
    // dimensions.
    /*----------------- */
    JFrame frame = new JFrame();
    frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    // frame.setSize(500, 500);
    frame.getContentPane().setBackground(new Color(123, 50, 250));
    // frame.setLayout(null);
    frame.setVisible(true);
    frame.add(label);
    frame.pack(); // before using pack make sure to set all your components first.
  }
}
