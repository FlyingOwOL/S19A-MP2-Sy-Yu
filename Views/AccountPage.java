package Views;                  // We use this package to organize our code

import Utilities.FixedValues;   // We use this to access fixed values like fonts and colors
import java.awt.Color;          // We use this to set the background color of panels
import java.awt.FlowLayout;     // We use this to arrange components in a flow layout
import javax.swing.JButton;     // We use this to create buttons    
import javax.swing.JComboBox;   // We use this to create dropdown lists
import javax.swing.JFrame;      // We use this to create the main frame of the pop-up
import javax.swing.JLabel;      // We use this to create labels for text display
import javax.swing.JPanel;      // We use this to create panels for organizing components

/**
 * This class represents the main account page for the calendar application.
 * It displays the calendar view and allows users to navigate through dates, 
 * select entries, and manage their accounts.
 * 
 * It extends JFrame to create a window for the account page.
 */
public class AccountPage extends JFrame{
    // Panels for the header, calendar, footer, and side sections
    private JPanel headerPanel = new JPanel();
    private JPanel calendarPanel = new JPanel();
    private JPanel footerPanel = new JPanel();
    private JPanel leftSidePanel = new JPanel();
    private JPanel rightSidePanel = new JPanel();

    // Labels for the date and footer information
    private JLabel dateLabel = new JLabel("Jun - Jul 2025");
    private JLabel footerLabel = new JLabel("Footer Information");

    // Buttons for navigating through dates and jumping to a specific date
    private JButton previousButton = new JButton ("<-");
    private JButton nextButton = new JButton ("->");
    private JButton jumpDateButton = new JButton("Jump to Date");

    // Combo boxes for selecting entries, accounts, and calendar display modes
    private String[] entrySelection = {"Event", "Task", "Meeting", "Journal"};
    private String[] accountSelection = {"Account 1", "Add Calendar", "Delete Calendar", "View Journal","Sign out"};
    private String[] calendarDisplayModes = {"Month", "Week"};
    private JComboBox<String> entriesBox = new JComboBox<>(entrySelection);
    private JComboBox<String> accountsBox = new JComboBox<>(accountSelection);
    private JComboBox<String> calendarDisplayBox = new JComboBox<>(calendarDisplayModes);

    // Instantiate the calendar views for monthly and weekly displays
    private CalendarMonthlyView monthlyCalendarView = new CalendarMonthlyView();
    private CalendarWeeklyView weeklyCalendarView = new CalendarWeeklyView();
    
    /**
     * This constructor initializes the AccountPage frame.
     * It sets the title, size, layout, and adds components to the frame.
     * 
     * It also sets the background colors for the header, calendar, footer, and side panels.
     */
    public AccountPage(){
        this.setTitle("Calendar Page");
        this.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
        this.setSize(1010, 637);
        this.setResizable(false);
        this.setLayout(null);               

        // Set bounds for each panel in the frame
        headerPanel.setBounds(50, 0, 900, 100);
        headerPanel.setBackground(Color.BLUE);
        calendarPanel.setBounds(50, 100, 900, 400);
        calendarPanel.setBackground(Color.LIGHT_GRAY);
        footerPanel.setBounds(50, 500, 900, 637);
        footerPanel.setBackground(Color.GREEN);
        leftSidePanel.setBounds(0, 0, 50, 637);
        leftSidePanel.setBackground(Color.magenta); 
        rightSidePanel.setBounds(950, 0, 50, 637);
        rightSidePanel.setBackground(Color.magenta);       

        // Components for headerPanel
        headerPanel.setLayout(null);
        dateLabel.setFont(FixedValues.TITLE_FONT);
        dateLabel.setHorizontalTextPosition(JLabel.CENTER);
        dateLabel.setBounds(350, 25, 200, 50);
        headerPanel.add(dateLabel);

        // Navigation buttons
        previousButton.setBounds(20, 35, 50, 30);
        previousButton.setFont(FixedValues.BUTTON_FONT);
        previousButton.setFocusable(false);
        headerPanel.add(previousButton);
        nextButton.setBounds(830, 35, 50, 30); 
        nextButton.setFont(FixedValues.BUTTON_FONT);
        nextButton.setFocusable(false);
        headerPanel.add(nextButton);

        // Combo boxes for entries, accounts, and calendar display modes
        accountsBox.setBounds(810, 70, 80, 20);
        headerPanel.add(accountsBox);
        calendarDisplayBox.setBounds(720, 70, 80, 20);
        headerPanel.add(calendarDisplayBox);

        // Components for calendarPanel
        calendarPanel.setLayout(new FlowLayout(FlowLayout.CENTER, 0, 0));
        calendarPanel.add(weeklyCalendarView);

        // Components for footerPanel
        footerPanel.setLayout(null);
        footerLabel.setFont(FixedValues.TITLE_FONT);
        footerLabel.setBounds(20, 25, 200, 50);
        footerPanel.add(footerLabel);

        // Entries combo box
        entriesBox.setBounds(600, 25, 290, 50);
        footerPanel.add(entriesBox);

        // Jump date button
        jumpDateButton.setBounds(360, 25, 150, 50);
        jumpDateButton.setFont(FixedValues.BUTTON_FONT);
        jumpDateButton.setFocusable(false);
        footerPanel.add(jumpDateButton);

        // Add panels to the frame
        this.add(leftSidePanel);
        this.add(rightSidePanel);
        this.add(headerPanel);
        this.add(calendarPanel);
        this.add(footerPanel);
        this.setVisible(true);
    }
}
