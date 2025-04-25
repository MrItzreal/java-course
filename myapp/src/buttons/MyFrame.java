import java.awt.Font;
import java.awt.Image;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.BorderFactory;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;

import java.awt.Color;

public class MyFrame extends JFrame implements ActionListener {
  JButton button;
  JLabel label;

  MyFrame() {
    // ImageIcon icon = new ImageIcon("point.png");
    label = new JLabel();
    label.setBounds(150, 250, 150, 150);
    label.setVisible(true);

    // Button
    button = new JButton();
    button.setBounds(100, 100, 250, 100);
    button.addActionListener(this);
    button.setText("I'm a button");
    button.setFocusable(false);
    // button.setIcon(icon);
    button.setHorizontalAlignment(JButton.CENTER);
    button.setVerticalAlignment(JButton.BOTTOM);
    button.setFont(new Font("Comic Sans", Font.BOLD, 25));
    button.setIconTextGap(-15);
    button.setForeground(Color.cyan);
    button.setBackground(Color.lightGray);
    button.setBorder(BorderFactory.createEtchedBorder());
    // button.setEnabled(false); This will enable a button.

    this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    this.setLayout(null);
    this.setSize(500, 500);
    this.setVisible(true);
    this.add(button);
    this.add(label);
  }

  @Override
  public void actionPerformed(ActionEvent e) {
    if (e.getSource() == button) {
      // System.out.println("Sound");
      // button.setEnabled(false); if you want to disable after 1 click
      label.setText("Yoooooooo!");
    }
  }
}
