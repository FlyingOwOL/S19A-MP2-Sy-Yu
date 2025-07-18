package Views.Add_Delete_Calendar_PopUps;   // We use this package to organize our code

import Utilities.FixedValues;
import Views.PopUpFormat;
import java.awt.Color;
import javax.swing.JButton;
import javax.swing.JComboBox;
import javax.swing.JLabel;
import javax.swing.JPanel;

/**
 * This class creates the pop-up window for deleting calendars.
 * It allows the user to select a calendar from a dropdown list
 * and delete it by clicking the delete button.
 * 
 * It extends PopUpFormat to have the format of the pop-up windows.
 */
public class DeleteCalendarFrame extends PopUpFormat {
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

    public JButton getDeleteButton() {
        return deleteButton;
    }

    public String getSelectedCalendar() {
        return (String) calendarComboBox.getSelectedItem();
    } 
}
