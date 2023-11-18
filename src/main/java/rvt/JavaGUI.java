
import javax.swing.*;
import java.awt.event.*;

public class JavaGUI extends JFrame implements ActionListener {
    private JTextField textField;
    private JButton button;

   public static void main(String[] args) {
        new JavaGUI();
    }

    public JavaGUI() {
        // Set up the window
        setTitle("My first window");
        setSize(500, 500);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        // Create the text input
        textField = new JTextField();
        textField.setBounds(50, 50, 200, 30);
        add(textField);

        // Create the button
        button = new JButton("Submit");
        button.setBounds(100, 100, 100, 30);
        button.addActionListener(this);
        add(button);

        // Show the window
        setLayout(null);
        setVisible(true);
    }

    public void actionPerformed(ActionEvent e) {
        if (e.getSource() == button) {
            String text = this.textField.getText();
            JOptionPane.showMessageDialog(this, "You typed: " + text);
        }
    }
}
