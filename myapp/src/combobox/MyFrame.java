import java.awt.*;
import java.awt.event.*;
import javax.swing.*;

public class MyFrame extends JFrame implements ActionListener {
  JComboBox comboBox;

  MyFrame() {
    this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    this.setLayout(new FlowLayout());

    String[] animals = { "dog", "rabbit", "gorilla" };

    comboBox = new JComboBox(animals);
    comboBox.addActionListener(this);
    // comboBox.setEditable(true); //lets you search by typing.
    // System.out.println(comboBox.getItemCount()); // gets amount of items.
    // comboBox.addItem("horse"); //adds item
    // comboBox.insertItemAt("pig", 0); // adds item and position
    // comboBox.setSelectedIndex(0);
    // comboBox.removeItem("rabbit");
    // comboBox.removeItemAt(0); //removes certain item
    // comboBox.removeAllItems(); //removes all

    this.add(comboBox);
    this.pack(); // size of frame adjust to fit components.
    this.setVisible(true);
  }

  @Override
  public void actionPerformed(ActionEvent e) {
    if (e.getSource() == comboBox) {
      // System.out.println(comboBox.getSelectedItem());
      System.out.println(comboBox.getSelectedIndex());
    }
  }
}