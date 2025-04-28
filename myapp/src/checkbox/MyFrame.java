import java.awt.FlowLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.Font;

import javax.swing.JButton;
import javax.swing.JCheckBox;
import javax.swing.JFrame;

public class MyFrame extends JFrame implements ActionListener {
  JButton button;
  JCheckBox checkBox;

  MyFrame() {
    this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    this.setLayout(new FlowLayout());

    button = new JButton();
    button.setText("Submit");
    button.addActionListener(this);

    checkBox = new JCheckBox();
    checkBox.setText("I'm not a robot!");
    checkBox.setFocusable(false);
    checkBox.setFont(new Font("Consolas", Font.PLAIN, 35));

    this.add(checkBox);
    this.add(button);
    this.pack(); // size of frame adjust to fit components.
    this.setVisible(true);
  }

  @Override
  public void actionPerformed(ActionEvent e) {
    if (e.getSource() == button) {
      System.out.println(checkBox.isSelected());
    }
  }
}