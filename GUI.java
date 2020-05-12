import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;


public class GUI implements ActionListener {

    private static JLabel userLabel;
    private static JTextField userText;
    private static JLabel passLabel;
    private static JPasswordField passwordField;
    private static JButton button;
    private static JPanel panel;
    private static JLabel success;
    private static JFrame frame;

    public static void main(String[] args){
        panel = new JPanel();
        frame = new JFrame();
        frame.setSize(300, 300);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        frame.add(panel); //adds the panel to the frame

        panel.setLayout(null);

        userLabel = new JLabel("Username: ");
        userLabel.setBounds(10, 20, 80, 25);
        panel.add(userLabel);

        userText = new JTextField();
        userText.setBounds(100, 20, 165, 25);
        panel.add(userText);

        passLabel = new JLabel("Password: ");
        passLabel.setBounds(10, 50, 80, 25);
        panel.add(passLabel);

        passwordField = new JPasswordField();
        passwordField.setBounds(100, 50, 165, 25);
        panel.add(passwordField);

        button = new JButton("Login");
        button.setBounds(100, 80, 80, 25);
        button.addActionListener(new GUI());
        panel.add(button);

        success = new JLabel("");
        success.setBounds(10, 110, 300, 25);
        panel.add(success);

        frame.setVisible(true);
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        String user = userText.getText();
        String password = passwordField.getText();


        if(user.equals("Michael") && password.equals("fart")){
            success.setText("Login Successful!");
        } else {
            success.setText("Login Unsuccessful");
        }
    }
}
