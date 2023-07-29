import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

class CreateLoginForm extends JFrame implements ActionListener {
    public JTextField textField1, textField2;
    public CreateLoginForm() {
        JPanel newPanel;
        JLabel userLabel, passLabel;

            //create label for username

            userLabel = new JLabel();
            userLabel.setText("Username"); //set label value for text-field 1
            //create text-field to get username from the user

            textField1 = new JTextField(16);

            passLabel = new JLabel();
            passLabel.setText("Password");

            textField2 = new JPasswordField(16);

            JButton b1 = new JButton("Submit");

            newPanel = new JPanel(new GridLayout(3,1));
            newPanel.add(userLabel);
            newPanel.add(textField1);
            newPanel.add(passLabel);
            newPanel.add(textField2);
            newPanel.add(b1);

            add(newPanel, BorderLayout.CENTER);

            b1.addActionListener(this);
            setTitle("Login Form");
        }

    public void actionPerformed(ActionEvent e) {
        String userValue = textField1.getText();
        String passValue = textField2.getText();

        NewPage page = null;
        if (userValue.equals("test1@gmail.com") && passValue.equals("test")) {
            page = new NewPage();
            page.setVisible(true);
            JLabel wel_label = new JLabel("Welcome: " + userValue);
            page.getContentPane().add(wel_label);
        } else {
            page = new NewPage();
            page.setVisible(true);
            JLabel err_label = new JLabel("User Information is incorrect. Please try again");
            page.getContentPane().add(err_label);
        }
    }
    static class LoginFormDemo{
        public static void main(String[] args) {
            try {
                CreateLoginForm form = new CreateLoginForm();
                form.setSize(300, 100);
                form.setVisible(true);
            }
            catch (Exception e)
            {
                JOptionPane.showMessageDialog(null, e.getMessage());
            }
        }
    }

}

