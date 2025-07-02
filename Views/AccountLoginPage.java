package Views;

import Utilities.FixedValues;

import javax.swing.JFrame;
import javax.swing.JButton;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextField;
import java.awt.GridLayout;

public class AccountLoginPage extends JFrame{
    private JPanel headerPanel = new JPanel();
    private JPanel buttonsPanel = new JPanel();
    private JPanel contentPanel = new JPanel();

    private JLabel welcomeTitle = new JLabel("Welcome to the Calendar App");
    private JLabel usernameLabel = new JLabel("Username:");
    private JLabel passwordLabel = new JLabel("Password:");

    private JButton createAccountButton = new JButton("Create Account");
    private JButton loginButton = new JButton("Login");
    
    private JTextField usernameField = new JTextField();
    private JTextField passwordField = new JTextField();
    public AccountLoginPage(){
        this.setTitle("Login Page");
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        this.setSize(500, 400);
        this.setResizable(false);

        // Set bounds for each panel in the frame
        headerPanel.setBounds(0, 0, 500, 100);
        contentPanel.setBounds(0, 100, 500, 100);
        buttonsPanel.setBounds(0, 200, 500, 200);

        //components for headerPanel
        welcomeTitle.setFont(FixedValues.TITLE_FONT);
        welcomeTitle.setBounds(75, 20, 400, 50);

        headerPanel.add(welcomeTitle);
        headerPanel.setLayout(null);

        //components for contentPanel
        usernameLabel.setFont(FixedValues.LABEL_FONT);
        usernameLabel.setBounds(20, 0, 100, 50);
        passwordLabel.setFont(FixedValues.LABEL_FONT);
        passwordLabel.setBounds(20, 50, 100, 50);

        usernameField.setBounds(100, 12, 300, 30);
        passwordField.setBounds(100, 62, 300, 30);

        contentPanel.add(usernameLabel);
        contentPanel.add(usernameField);
        contentPanel.add(passwordLabel);
        contentPanel.add(passwordField);
        contentPanel.setLayout(null);

        //components for buttonsPanel
        createAccountButton.setFont(FixedValues.TITLE_FONT);
        createAccountButton.setFocusable(false);
        createAccountButton.setBounds(125, 30, 250, 50);

        loginButton.setFont(FixedValues.TITLE_FONT);
        loginButton.setFocusable(false);
        loginButton.setBounds(150, 100, 200, 50);

        buttonsPanel.add(createAccountButton);
        buttonsPanel.add(loginButton);
        buttonsPanel.setLayout(null);    

        // Add panels to the frame
        this.add(headerPanel);
        this.add(contentPanel);
        this.add(buttonsPanel);
        this.setLayout(null);
        this.setVisible(true);
    }
}
