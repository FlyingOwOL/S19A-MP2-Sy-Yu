package Views.Add_Delete_Calendar_PopUps;   // We use this package to organize our code

import Utilities.FixedValues;   // We use this to access fixed values like fonts and colors
import java.awt.Color;          // We use this to set the background color of panels
import javax.swing.JButton;     // We use this to create buttons
import javax.swing.JComboBox;   // We use this to create dropdown lists
import javax.swing.JFrame;      // We use this to create the main frame of the pop-up
import javax.swing.JLabel;      // We use this to create labels
import javax.swing.JPanel;      // We use this to create panels for organizing components

/**
 * This class represents a pop-up frame for deleting a calendar.
 * It allows the user to select a calendar from a dropdown list and delete it.
 * 
 * It extends JFrame to create a window for the pop-up.
 */
public class DeleteCalendarFrame extends JFrame {
    // Panel for the header section and content section
    private JPanel headerPanel = new JPanel(); 
    private JPanel contentPanel = new JPanel();

    // Title label for the pop-up
    private JLabel titleLabel = new JLabel("Delete Calendar");

    // Dropdown list for selecting a calendar to delete
    private String[] calendars = {"Calendar 1", "Calendar 2", "Calendar 3"};

    // Combo box for selecting a calendar to delete
    private JComboBox<String> calendarComboBox = new JComboBox<>(calendars);

    // Button to delete the selected calendar
    private JButton deleteButton = new JButton("Delete");

    /**
     * This constructor initializes the DeleteCalendarFrame.
     * It sets the title, size, layout, and adds components to the frame.
     * 
     * It also sets the background colors for the header and content panels.
     */
    public DeleteCalendarFrame(){
        this.setTitle("Delete Calendar");
        this.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
        this.setSize(400, 300);
        this.setResizable(false);
        this.setLayout(null);

        // Set bounds for each panel in the frame
        headerPanel.setBounds(0, 0, 400, 100);
        headerPanel.setBackground(Color.CYAN);
        contentPanel.setBounds(0, 100, 400, 150);

        // Header components
        headerPanel.setLayout(null);
        titleLabel.setFont(FixedValues.TITLE_FONT);
        titleLabel.setBounds(122, 20, 200, 50);
        headerPanel.add(titleLabel);
        
        
        // Content components
        contentPanel.setLayout(null);
        calendarComboBox.setBounds(50, 20, 300, 30);
        deleteButton.setBounds(150, 70, 100, 30);
        deleteButton.setFocusable(false);
        contentPanel.add(calendarComboBox);
        contentPanel.add(deleteButton);
        
        // Frame arrangement
        this.add(headerPanel);
        this.add(contentPanel);
        this.setVisible(true);
    }
}
