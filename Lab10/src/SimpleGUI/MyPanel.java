package SimpleGUI;

import java.awt.*;
import javax.swing.*;

class MyPanel extends JPanel {

    public static void main(String[] args) {
        JFrame frame = new JFrame("My Frame");
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setSize(600, 250);

        JPanel panel1 = new JPanel();
        panel1.setBorder(BorderFactory.createLineBorder(Color.green, 3));
        JPanel panel2 = new JPanel();
        panel2.setBorder(BorderFactory.createLineBorder(Color.blue, 3));

        JPanel mainPanel = new JPanel();

        JLabel l = new JLabel("Label1 ");
        JTextField tf = new JTextField("TextField1");
        panel1.add(l);
        panel1.add(tf);
        panel1.setLayout(new FlowLayout());

        JButton b1 = new JButton("Button 1");
        JButton b2 = new JButton("Button 2");
        JButton b3 = new JButton("Button 3");
        panel2.add(b1);
        panel2.add(b2);
        panel2.add(b3);

		JPanel panel3 = new JPanel();
		panel3.setBorder(BorderFactory.createLineBorder(Color.yellow,3));
		JLabel label3 = new JLabel("Please input age: ");
		JTextField textField3 = new JTextField("25");
		textField3.setColumns(10);
		textField3.setEditable(false);
		panel3.add(label3);
		panel3.add(textField3);
		panel3.setLayout(new FlowLayout());

        mainPanel.setBorder(BorderFactory.createLineBorder(Color.red, 3));
        mainPanel.add(panel1);
        mainPanel.add(panel2);
		mainPanel.add(panel3);
        mainPanel.setLayout(new BoxLayout(mainPanel, BoxLayout.Y_AXIS));
        frame.setContentPane(mainPanel);
        frame.setVisible(true);
    }
}
