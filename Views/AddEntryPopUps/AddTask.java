package Views.AddEntryPopUps;   // We use this package to organize all pop-up windows for adding entries


import Utilities.FixedValues;
import Views.PopUpFormat;
import java.awt.Color;
import java.awt.FlowLayout;
import javax.swing.JButton;
import javax.swing.JComboBox;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JScrollPane;
import javax.swing.JTextArea;
import javax.swing.JTextField;

/**
 * This class creates the pop-up window for adding a Task entry.
 * 
 * It allows the user to set the task's priority, status, creator, finisher, and details.
 * 
 * It extends PopUpFormat to follow the standard pop-up window format.
 */
public class AddTask extends PopUpFormat{
    private JPanel headerPanel = new JPanel();  // Panel for the title
    private JPanel contentPanel = new JPanel(); // Panel for the input fields

    // Labels for task fields
    private JLabel titleLabel = new JLabel("Add Task");
    private JLabel priorityLabel = new JLabel("Priority:");
    private JLabel statusLabel = new JLabel("Status:");
    private JLabel createdByLabel = new JLabel("Created By:");
    private JLabel finishedByLabel = new JLabel("Finished By:");

    // Input fields
    private JTextField createdByField = new JTextField();
    private JTextField finishedByField = new JTextField();

    // Combo boxes for priority and status
    private String[] priorityTypes = {"High", "Medium", "Low"};
    private String[] statusTypes = {"Pending", "Done"};
    private JComboBox<String> priorityBox = new JComboBox<>(priorityTypes);
    private JComboBox<String> statusBox = new JComboBox<>(statusTypes);

    // Text area for additional task details
    private JTextArea detailArea = new JTextArea();
    private JScrollPane detailScrollPane = new JScrollPane(detailArea);

    // Submit button
    private JButton submitButton = new JButton("Submit");

    /**
     * This constructor initializes the AddTask pop-up.
     * 
     * It sets up the labels, fields, combo boxes, text area, and submit button.
     */
    public AddTask() {
        this.setTitle("Add Task");

        // Set up header panel
        headerPanel.setBounds(0, 0, 400, 50);
        headerPanel.setBackground(Color.CYAN);
        headerPanel.setLayout(new FlowLayout(FlowLayout.CENTER)); // Center the title label
        titleLabel.setFont(FixedValues.TITLE_FONT);
        headerPanel.add(titleLabel);
        this.add(headerPanel);

        // Set up content panel
        contentPanel.setBounds(0, 50, 400, 350);
        contentPanel.setLayout(null); // Use null layout for manual positioning
        this.add(contentPanel);

        // Position labels and fields with fixed coordinates
        priorityLabel.setBounds(20, 20, 100, 20);
        priorityBox.setBounds(120, 20, 250, 25);
        
        statusLabel.setBounds(20, 60, 100, 20);
        statusBox.setBounds(120, 60, 250, 25);
        
        createdByLabel.setBounds(20, 100, 100, 20);
        createdByField.setBounds(120, 100, 250, 25);
        
        finishedByLabel.setBounds(20, 140, 100, 20);
        finishedByField.setBounds(120, 140, 250, 25);
        
        // Configure detail area
        detailArea.setLineWrap(true);
        detailArea.setWrapStyleWord(true);
        detailArea.setEditable(true); // Allow editing
        detailScrollPane.setBounds(5, 175, 375, 100); // Set bounds for the scroll pane
        contentPanel.add(detailScrollPane); // Add scroll pane to content panel

        // Configure submit button
        submitButton.setFocusable(false);
        submitButton.setBounds(150, 280, 100, 30); // Set bounds for the button
        contentPanel.add(submitButton); // Add button to content panel

        // Add labels and fields to content panel
        contentPanel.add(priorityLabel);
        contentPanel.add(priorityBox);
        contentPanel.add(statusLabel);
        contentPanel.add(statusBox);
        contentPanel.add(createdByLabel);
        contentPanel.add(createdByField);
        contentPanel.add(finishedByLabel);
        contentPanel.add(finishedByField);

        this.setVisible(true);
    }

    /**
     * This getter gets the selected priority from the dropdown.
     * @return selected priority as String
     */
    public String getPriority() {
        return (String) priorityBox.getSelectedItem();
    }

    /**
     * This getter gets the selected status from the dropdown.
     * @return selected status as String
     */
    public String getStatus() {
        return (String) statusBox.getSelectedItem();
    }

    /**
     * This getter gets the text from the 'Created By' field.
     * @return creator name as String
     */
    public String getCreatedBy() {
        return createdByField.getText();
    }

    /**
     * This getter gets the text from the 'Finished By' field.
     * @return finisher name as String
     */
    public String getFinishedBy() {
        return finishedByField.getText();
    }

    /**
     * This getter gets the details entered for the task.
     * @return task details as String
     */
    public String getDetails() {
        return detailArea.getText();
    }

    /**
     * This method allows a controller to attach an ActionListener to the submit button.
     * @param listener ActionListener to handle submit action
     */
    public void addSubmitListener(ActionListener listener) {
        submitButton.addActionListener(listener);
    }

}
