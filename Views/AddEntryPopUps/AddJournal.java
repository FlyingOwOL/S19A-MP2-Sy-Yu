package Views.AddEntryPopUps; // We use this package to organize all pop-up windows for adding entries

import Utilities.FixedValues;
import Views.PopUpFormat;
import java.awt.Color;
import java.awt.FlowLayout;
import javax.swing.JButton;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JScrollPane;
import javax.swing.JTextArea;


/**
 * This class creates the pop-up window for adding a Journal entry.
 * 
 * It allows the user to write a journal entry using a text area.
 * 
 * It extends PopUpFormat to follow the standard pop-up window format.
 */
public class AddJournal extends PopUpFormat {
    private JPanel headerPanel = new JPanel();  // Panel for the title
    private JPanel contentPanel = new JPanel(); // Panel for the text area and button

    private JLabel headerLabel = new JLabel("Add Journal Entry"); // Title label
    
    private JTextArea detailArea = new JTextArea(); // Text area for journal content
    private JScrollPane detailScrollPane = new JScrollPane(detailArea); // Scroll pane for the text area

    private JButton closeButton = new JButton("Close"); // Button to close the pop-up

    /**
     * This constructor initializes the AddJournal pop-up.
     * 
     * It sets up the header, text area, scroll pane, and close button.
     */
    public AddJournal() {
        this.setTitle("Add Journal");

        // Set up header panel
        headerPanel.setBounds(0, 0, 400, 50);
        headerPanel.setBackground(Color.CYAN);
        headerPanel.setLayout(new FlowLayout(FlowLayout.CENTER)); // Center the header label
        headerPanel.add(headerLabel);
        this.add(headerPanel);

        // Set up content panel
        contentPanel.setBounds(0, 50, 400, 350);
        contentPanel.setLayout(null); // Use null layout for manual positioning
        this.add(contentPanel);

        // Configure header label
        headerLabel.setFont(FixedValues.TITLE_FONT); // Set font from FixedValues
        headerLabel.setHorizontalAlignment(JLabel.CENTER); // Center the text horizontally

        // Configure detail area
        detailArea.setLineWrap(true);
        detailArea.setWrapStyleWord(true);
        detailArea.setEditable(true); // Allow editing
        detailScrollPane.setBounds(5, 20, 375, 250); // Set bounds for the scroll pane
        contentPanel.add(detailScrollPane); // Add scroll pane to content panel

        // Configure close button
        closeButton.setFocusable(false);
        closeButton.setBounds(150, 280, 100, 30); // Set bounds for the button
        contentPanel.add(closeButton); // Add button to content panel

        this.setVisible(true);
    }

    /**
     * This getter gets the journal text written in the text area.
     * 
     * @return journal content as a String
     */
    public String getJournalText() {
        return detailArea.getText();
    }

    /**
     * This setter sets the text in the journal detail area.
     * 
     * @param text the content to display in the journal field
     */
    public void setJournalText(String text) {
        detailArea.setText(text);
    }

    /**
     * This method adds an ActionListener to the Close button.
     * 
     * This allows a controller to define what happens when the Close button is clicked.
     * 
     * @param listener the ActionListener to attach
     */
    public void addCloseListener(java.awt.event.ActionListener listener) {
        closeButton.addActionListener(listener);
    }
}
