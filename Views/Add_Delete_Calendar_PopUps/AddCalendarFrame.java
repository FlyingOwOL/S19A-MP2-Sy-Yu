package Views.Add_Delete_Calendar_PopUps;   // We use this package to organize our code

import Utilities.FixedValues;               // We use this to access fixed values like fonts and colors
import java.awt.Color;                      // We use this to set the background color of panels
import javax.swing.ButtonGroup;             // We use this to group radio buttons together
import javax.swing.JButton;                 // We use this to create buttons
import javax.swing.JComboBox;               // We use this to create dropdown lists
import javax.swing.JFrame;                  // We use this to create the main frame of the pop-up
import javax.swing.JLabel;                  // We use this to create labels 
import javax.swing.JPanel;                  // We use this to create panels for organizing components
import javax.swing.JRadioButton;            // We use this to create radio buttons for selection
import javax.swing.JTextField;              // We use this to create text fields for user input

/**
 * This class represents a pop-up frame for adding a calendar.
 * It allows the user to create a new calendar or import an existing one.
 * The user can choose the type of calendar and enter its name.
 * 
 * It extends JFrame to create a window for the pop-up.
 */
public class AddCalendarFrame extends JFrame {
    private JPanel headerPanel = new JPanel();  //  Panel for the header section
    private JPanel contentPanel = new JPanel(); // Panel for the content section where user inputs are placed

    // Title label for the pop-up
    private JLabel titleLabel = new JLabel("Add Calendar"); 
        
    // Text field for entering the name of the calendar
    private JTextField calendarNameField = new JTextField();     

    // Button to add the calendar
    private JButton addButton = new JButton("Add"); 

    // Radio buttons for selecting the type of calendar to create or import
    private JRadioButton creationType = new JRadioButton("Create New Calendar"); 

    // Radio button for importing an existing calendar
    private JRadioButton importType = new JRadioButton("Import Calendar");

    // Combo boxes for selecting the type of calendar and the imported calendar
    private String[] calendarTypes = new String[]{"Normal", "Personal", "Family"};

    // Example list of imported calendars (this would typically be populated dynamically)
    private String[] importedCalendars = new String[]{"Suck", "My", "Calendar", "off", "Bro"};

    // Combo boxes for selecting the type of calendar and the imported calendar
    private JComboBox<String> calendarTypeBox = new JComboBox<>(calendarTypes);

    // Combo box for selecting an imported calendar
    private JComboBox<String> importedCalendarBox = new JComboBox<>(importedCalendars);

    /**
     * This constructor initializes the AddCalendarFrame.
     * It sets the title, size, layout, and adds components to the frame.
     * 
     * It also sets the background colors for the header and content panels.
     */
    public AddCalendarFrame() {
        this.setTitle("Add Calendar");
        this.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
        this.setSize(400, 430);
        this.setResizable(false);
        this.setLayout(null);

        // Panels
        headerPanel.setBounds(0, 0, 400, 100);
        headerPanel.setBackground(Color.CYAN);
        contentPanel.setBounds(0, 100, 400, 300);
        contentPanel.setBackground(Color.LIGHT_GRAY);

        // Components for headerPanel
        headerPanel.setLayout(null);
        titleLabel.setFont(FixedValues.TITLE_FONT);
        titleLabel.setBounds(122, 20, 200, 50);
        headerPanel.add(titleLabel);

        // Components for contentPanel
        contentPanel.setLayout(null);
        calendarNameField.setBounds(50, 20, 300, 30);
        contentPanel.add(calendarNameField);        
        addButton.setBounds(150, 70, 100, 30);
        addButton.setFocusable(false);
        contentPanel.add(addButton);

        // Add radio buttons
        creationType.setBounds(50, 110, 200, 30);
        importType.setBounds(50, 140, 200, 30);
        
        // Group the radio buttons
        ButtonGroup group = new ButtonGroup();
        group.add(creationType);
        group.add(importType);
        
        // Add radio buttons to contentPanel
        contentPanel.add(creationType);
        contentPanel.add(importType);

        // Add JComboBox
        calendarTypeBox.setBounds(47, 180, 300, 30);
        contentPanel.add(calendarTypeBox);
        importedCalendarBox.setBounds(47, 220, 300, 30);
        contentPanel.add(importedCalendarBox);

        // Add panels to Frame
        this.add(headerPanel);
        this.add(contentPanel);
        this.setVisible(true);
    }
}
