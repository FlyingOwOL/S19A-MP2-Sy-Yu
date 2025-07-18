package Views.AddEntryPopUps;

import Utilities.FixedValues;
import Views.PopUpFormat;
import java.awt.Color;
import java.awt.Dimension;
import java.awt.FlowLayout;
import javax.swing.JButton;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JScrollPane;
import javax.swing.JTextArea;
import javax.swing.JTextField;

/**
 * This class creates the pop-up window for adding a Meeting entry.
 * 
 * It allows the user to input the meeting's modality, venue, link, start and end dates, and details.
 * 
 * It extends PopUpFormat to follow the standard pop-up window format.
 */
public class AddMeeting extends PopUpFormat {
    private JPanel headerPanel = new JPanel();  // Panel for the header
    private JPanel contentPanel = new JPanel(); // Panel for input fields
    
    // Text fields for meeting information
    private JTextField modalityField = new JTextField();
    private JTextField venueField = new JTextField();
    private JTextField linkField = new JTextField();
    private JTextField startDateField = new JTextField();
    private JTextField endDateField = new JTextField();

    // Labels for inputs
    private JLabel titleLabel = new JLabel("Add Meeting");
    private JLabel modalityLabel = new JLabel("Modality:");
    private JLabel venueLabel = new JLabel("Venue:");
    private JLabel linkLabel = new JLabel("Link:");
    private JLabel startLabel = new JLabel("Start Date:");
    private JLabel endDateLabel = new JLabel("End Date:");
    
    // Text area for additional meeting details
    private JTextArea detailArea = new JTextArea();
    private JScrollPane detailScrollPane = new JScrollPane(detailArea);

    // Submit button
    private JButton submitButton = new JButton("Submit");

    /**
     * This constructor initializes the AddMeeting pop-up.
     * 
     * It sets up the text fields, labels, text area, and submit button.
     */
    public AddMeeting() {
        this.setTitle("Add Meeting");

        // Set up header panel
        headerPanel.setBounds(0, 0, 400, 50);
        headerPanel.setBackground(Color.CYAN);
        this.add(headerPanel);


        // Components for header
        headerPanel.setLayout(new FlowLayout(FlowLayout.CENTER, 0, 10));
        headerPanel.setPreferredSize(new Dimension(400, 60));
        titleLabel.setFont(FixedValues.TITLE_FONT);
        headerPanel.add(titleLabel);

        // Set up content panel
        contentPanel.setBounds(0, 60, 400, 340);
        contentPanel.setLayout(null); // Use null layout for manual positioning
        this.add(contentPanel);

        // Position labels and fields with fixed coordinates
        modalityLabel.setBounds(20, 20, 100, 20);
        modalityField.setBounds(120, 20, 250, 25);
        
        venueLabel.setBounds(20, 50, 100, 20);
        venueField.setBounds(120, 50, 250, 25);
        
        linkLabel.setBounds(20, 80, 100, 20);
        linkField.setBounds(120, 80, 250, 25);
        
        startLabel.setBounds(20, 110, 100, 20);
        startDateField.setBounds(120, 110, 250, 25);
        
        endDateLabel.setBounds(20, 140, 100, 20);
        endDateField.setBounds(120, 140, 250, 25);
        
        // Configure detail area
        detailArea.setLineWrap(true);
        detailArea.setWrapStyleWord(true);
        detailArea.setEditable(true); // Allow editing
        detailScrollPane.setBounds(5, 170, 375, 100); // Set bounds for the scroll pane
        contentPanel.add(detailScrollPane); // Add scroll pane to content panel

        // Configure submit button
        submitButton.setFocusable(false);
        submitButton.setBounds(150, 275, 100, 30); // Set bounds for the button
        contentPanel.add(submitButton); // Add button to content panel

        // Add labels and fields to content panel
        contentPanel.add(modalityLabel);
        contentPanel.add(modalityField);
        contentPanel.add(venueLabel);
        contentPanel.add(venueField);
        contentPanel.add(linkLabel);
        contentPanel.add(linkField);
        contentPanel.add(startLabel);
        contentPanel.add(startDateField);
        contentPanel.add(endDateLabel);
        contentPanel.add(endDateField);

        this.setVisible(true);
    }

     /**
     * This getter gets the entered modality of the meeting.
     * @return modality as String
     */
    public String getModality() {
        return modalityField.getText();
    }

    /**
     * This getter gets the entered venue of the meeting.
     * @return venue as String
     */
    public String getVenue() {
        return venueField.getText();
    }

    /**
     * This getter gets the entered link of the meeting (for online modality).
     * @return link as String
     */
    public String getLink() {
        return linkField.getText();
    }

    /**
     * This getter gets the entered start date of the meeting.
     * @return start date as String
     */
    public String getStartDate() {
        return startDateField.getText();
    }

    /**
     * This getter gets the entered end date of the meeting.
     * @return end date as String
     */
    public String getEndDate() {
        return endDateField.getText();
    }

    /**
     * This getter gets the additional details entered in the detail area.
     * @return details as String
     */
    public String getDetails() {
        return detailArea.getText();
    }

    /**
     * This method adds an ActionListener to the Submit button.
     * This allows a controller to define what happens when Submit is clicked.
     * 
     * @param listener the ActionListener to attach
     */
    public void addSubmitListener(java.awt.event.ActionListener listener) {
        submitButton.addActionListener(listener);
    }
}
