package Views;                  // We use this package to organize our code

import Utilities.FixedValues;  
import javax.swing.JButton;
import javax.swing.JFrame;    
import javax.swing.JLabel;
import javax.swing.JPanel;     
import javax.swing.JTextField;  

/**
 * This class represents a login page for the calendar application.
 * It allows users to enter their username and password, and provides options to create an account or log in.
 * 
 * It extends JFrame to create a window for the login page.
 */
public class AccountLoginPage extends JFrame{
    // Panels for the header, buttons, and content sections
    private JPanel headerPanel = new JPanel();
    private JPanel buttonsPanel = new JPanel();
    private JPanel contentPanel = new JPanel();

    // Labels for the welcome title, username, and password fields
    private JLabel welcomeTitle = new JLabel("Welcome to the Calendar App");
    private JLabel usernameLabel = new JLabel("Username:");
    private JLabel passwordLabel = new JLabel("Password:");

    // Buttons for creating an account and logging in
    private JButton createAccountButton = new JButton("Create Account");
    private JButton loginButton = new JButton("Login");
    
    // Text fields for entering the username and password
    private JTextField usernameField = new JTextField();
    private JTextField passwordField = new JTextField();
    
    /**
     * This constructor initializes the AccountLoginPage frame.
     * It sets the title, size, layout, and adds components to the frame.
     * 
     * It also sets the background colors for the header, content, and buttons panels.
     */
    public AccountLoginPage(){
        this.setTitle("Login Page");
        this.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
        this.setSize(500, 400);
        this.setResizable(false);
        this.setLayout(null);

        // Set bounds for each panel in the frame
        headerPanel.setBounds(0, 0, 500, 100);
        contentPanel.setBounds(0, 100, 500, 100);
        buttonsPanel.setBounds(0, 200, 500, 200);

        // Components for headerPanel of Welcome title
        headerPanel.setLayout(null);        
        welcomeTitle.setFont(FixedValues.TITLE_FONT);
        welcomeTitle.setBounds(75, 20, 400, 50);

        headerPanel.add(welcomeTitle);

        // Components for contentPanel
        contentPanel.setLayout(null);        
        usernameLabel.setFont(FixedValues.LABEL_FONT);
        usernameLabel.setBounds(20, 0, 100, 50);
        passwordLabel.setFont(FixedValues.LABEL_FONT);
        passwordLabel.setBounds(20, 50, 100, 50);

        usernameField.setFont(FixedValues.LABEL_FONT);
        usernameField.setBounds(100, 12, 300, 30);
        passwordField.setFont(FixedValues.LABEL_FONT);
        passwordField.setBounds(100, 62, 300, 30);

        contentPanel.add(usernameLabel);
        contentPanel.add(usernameField);
        contentPanel.add(passwordLabel);
        contentPanel.add(passwordField);

        // Components for buttonsPanel
        buttonsPanel.setLayout(null);
        
        // Create Account button
        createAccountButton.setFont(FixedValues.TITLE_FONT);
        createAccountButton.setFocusable(false);
        createAccountButton.setBounds(125, 30, 250, 50);

        // Login button
        loginButton.setFont(FixedValues.TITLE_FONT);
        loginButton.setFocusable(false);
        loginButton.setBounds(150, 100, 200, 50);

        buttonsPanel.add(createAccountButton);
        buttonsPanel.add(loginButton);
   

        // Add panels to the frame
        this.add(headerPanel);
        this.add(contentPanel);
        this.add(buttonsPanel);
        this.setVisible(true);
    }

    /**
     * This getter gets the text entered in the username field.
     * 
     * @return the username as a String
     */
    public String getUsername() {
        return usernameField.getText();
    }

    /**
     * This getter gets the text entered in the password field.
     * 
     * @return the password as a String
     */
    public String getPassword() {
        return passwordField.getText();
    }

    /**
     * This getter returns the Create Account button.
     * 
     * @return the create account JButton
     */
    public JButton getCreateAccountButton() {
        return createAccountButton;
    }

    /**
     * This getter returns the Login button.
     * 
     * @return the login JButton
     */
    public JButton getLoginButton() {
        return loginButton;
    }

    /**
     * This method adds an ActionListener to the Login button.
     * 
     * This allows external controllers to handle login events when the button is clicked.
     * @param listener
     */
    public void addLoginListener(ActionListener listener) {
        loginButton.addActionListener(listener);
    }

    
    /**
     * This method adds an ActionListener to the Create Account button.
     * 
     * This allows external controllers to handle create account events when the button is clicked.
     *
     * @param listener the ActionListener to attach to the create account button
     */
    public void addCreateAccountListener(ActionListener listener) {
        createAccountButton.addActionListener(listener);
    }


}
