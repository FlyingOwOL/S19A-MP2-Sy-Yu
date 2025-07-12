package Views.Add_Delete_Calendar_PopUps;   // We use this package to organize our code

import Utilities.FixedValues;   // We use this to access fixed values like fonts and colors
import java.awt.Color;          // We use this to set the background color of panels
import javax.swing.JButton;     // We use this to create buttons
import javax.swing.JFrame;      // We use this to create the main frame of the pop-up
import javax.swing.JLabel;      // We use this to create labels
import javax.swing.JPanel;      // We use this to create panels for organizing components
import javax.swing.JScrollPane; // We use this to create scrollable areas
import javax.swing.JTextArea;   // We use this to create text areas for multi-line text input

/**
 * This class represents a pop-up frame for viewing the journal of the current month.
 * It displays the journal content and allows the user to close the pop-up.
 * 
 * It extends JFrame to create a window for the pop-up.
 */
public class ViewJournal extends JFrame {
    // Label for the journal title
    private JLabel journalLabel = new JLabel("This is the Month's Journal");
    
    // Use JTextArea instead of JLabel for journal content
    private JTextArea journalContent = new JTextArea("Lahat ng pagmamahal\n" + 
                "At oras na aking binigay\n" + 
                "Parang 'di mo pansin\n" + 
                "Ang sama ko sa 'yong paningin\n" + 
                "Hmm, hmm");
    
    // Panels for the header and content sections
    private JPanel headerPanel = new JPanel();
    private JPanel contentPanel = new JPanel();
    
    // Button to close the pop-up
    private JButton closeButton = new JButton("Submit");

    // Scroll pane to make the journal content scrollable
    private JScrollPane scrollPane = new JScrollPane(journalContent);

    /**
     * This constructor initializes the ViewJournal frame.
     * It sets the title, size, layout, and adds components to the frame.
     * 
     * It also sets the background colors for the header and content panels.
     */
    public ViewJournal() {
        this.setTitle("This Month's Journal");
        this.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
        this.setSize(400, 300);
        this.setLayout(null);

        // Panel set bounds
        headerPanel.setBounds(0, 0, 400, 100);
        headerPanel.setBackground(Color.CYAN);
        contentPanel.setBounds(0, 100, 400, 200);
        contentPanel.setBackground(Color.LIGHT_GRAY);

        // Components for header
        headerPanel.setLayout(null);
        journalLabel.setFont(FixedValues.TITLE_FONT);
        journalLabel.setHorizontalTextPosition(JLabel.CENTER);
        journalLabel.setBounds(0, 20, 400, 50);
        headerPanel.add(journalLabel);

        // Components for content
        contentPanel.setLayout(null);
        journalContent.setFont(FixedValues.JOURNAL_FONT);
        journalContent.setLineWrap(true); 
        journalContent.setWrapStyleWord(true); 
        journalContent.setEditable(false); 

        // Scroll pane for journal content
        scrollPane.setBounds(0, 0, 400, 110); 
        contentPanel.add(scrollPane);

        // Close button
        closeButton.setFont(FixedValues.BUTTON_FONT);
        closeButton.setFocusable(false);
        closeButton.setBounds(140, 120, 100, 30);
        contentPanel.add(closeButton);

        // Add to frame
        this.add(headerPanel);
        this.add(contentPanel);
        this.setVisible(true);
    }
}
