import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.IOException;
import java.net.URI;
import java.net.URISyntaxException;

public class LoginWindow extends JFrame {
    private JButton okbutton;
    private JButton resetbutton;
    private JTextField logintextfield;
    private JPasswordField passwordField;
    private JButton funnybutton;
    public LoginWindow(){
        setTitle("Login");
        setSize(400,300);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setLocationRelativeTo(null);
        JLabel loginlable=new JLabel("Login:");
        JLabel passwordlabel =new JLabel("Password:");
        logintextfield=new JTextField(20);
        passwordField=new JPasswordField(20);
        okbutton=new JButton("Ok");
        resetbutton=new JButton("Reset");
        funnybutton=new JButton("Funny");
        resetbutton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
              logintextfield.setText("");
              passwordField.setText("");
              JOptionPane.showMessageDialog(null,"Zresetowano");
            }
        });
        okbutton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                String login=logintextfield.getText();
                String password=passwordField.getText();
                if(login.equals("Jan")&&password.equals("1234")) {
                    JOptionPane.showMessageDialog(null, "Zalogowano");
                }
                else {
                    JOptionPane.showMessageDialog(null,"Niepoprawny login");
                }
            }
        });
        funnybutton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                while (true){
                    if (Desktop.isDesktopSupported() && Desktop.getDesktop().isSupported(Desktop.Action.BROWSE)) {
                        try {
                            Desktop.getDesktop().browse(new URI("https://th.bing.com/th/id/OIP.kNpVPu8ePaJBhopoN-2TFwHaFj?w=287&h=215&c=7&r=0&o=5&pid=1.7"));
                        } catch (IOException | URISyntaxException ex) {
                            throw new RuntimeException(ex);
                        }

                    }
            }
            }
        });

        setLayout(new GridBagLayout());
        GridBagConstraints constraints=new GridBagConstraints();
        constraints.insets=new Insets(10,10,10,10);
        constraints.gridx=0;
        constraints.gridy=0;
        add(loginlable,constraints);
        constraints.gridx=1;
        add(logintextfield,constraints);
        constraints.gridx=0;
        constraints.gridy=1;
        add(passwordlabel,constraints);
        constraints.gridx=1;
        add(passwordField,constraints);
        constraints.gridx=0;
        constraints.gridy=2;
        add(okbutton,constraints);
        constraints.gridx=1;
        add(resetbutton,constraints);
        constraints.gridy=3;
        constraints.gridx=0;
        add(funnybutton,constraints);
        setVisible(true);
    }
}
