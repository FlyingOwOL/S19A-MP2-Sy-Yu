package Views.Add_Delete_Calendar_PopUps;   // We use this package to organize our code

import Utilities.FixedValues;
import Views.PopUpFormat;
import java.awt.Color;
import javax.swing.JButton;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JScrollPane;
import javax.swing.JTextArea;

/**
 * This class represents the pop-up window for viewing journal entries.
 * It displays the journal content in a scrollable text area that cannot be edited.
 * 
 * Components:
 * - Header with the title
 * - Content area showing the journal text
 * - Button to close the window
 */
public class ViewJournal extends PopUpFormat {
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

    public void addCloseButtonListener(ActionListener listener) {
        closeButton.addActionListener(listener);
}

}
