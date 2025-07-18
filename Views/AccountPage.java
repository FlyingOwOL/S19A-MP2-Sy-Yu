package Views;                  // We use this package to organize our code

import Utilities.FixedValues;
import java.awt.Color;
import java.awt.FlowLayout;
import java.awt.event.ActionListener;
import javax.swing.JButton;
import javax.swing.JComboBox;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;

/**
 * This class represents the main account page of the calendar application.
 * 
 * It displays the monthly or weekly calendar view, allows navigation between dates,
 * and provides options to add entries, change calendar display modes, 
 * manage calendars, and sign out.
 */
public class AccountPage extends JFrame {
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
        dateLabel.setBounds(350, 25, 300, 50);
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
        calendarPanel.add(monthlyCalendarView);

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

    /**
     * This getter gets the selected calendar display mode from the combo box.
     * 
     * @return "Month" or "Week" as a String
     */
    public String getSelectedCalendarDisplay(){
        return (String) calendarDisplayBox.getSelectedItem();
    }

    /**
     * This getter gets the selected entry type from the entries combo box.
     * 
     * @return the selected entry type as a String
     */
    public String getSelectedEntry(){
        return (String) entriesBox.getSelectedItem();
    }

    /**
     * This getter gets the selected account option from the accounts combo box.
     * 
     * @return the selected account option as a String
     */
    public String getSelectedAccount(){
        return (String) accountsBox.getSelectedItem();
    }

    /**
     * This method changes the calendar display between monthly and weekly view.
     * 
     * @param displayMode "Month" or "Week"
     */
    public void changeCalendarDisplay(String displayMode) {
        if (displayMode.equals("Month")) {
            calendarPanel.remove(weeklyCalendarView);
            calendarPanel.add(monthlyCalendarView);
        } else {
            calendarPanel.remove(monthlyCalendarView);
            calendarPanel.add(weeklyCalendarView);
        }
        calendarPanel.revalidate();
        calendarPanel.repaint();
    }

    /**
     * This method updates the date label in the header to show the current range of dates.
     * 
     * @param dateText the new date text to display
     */
    public void updateDateLabel(String dateText) {
        dateLabel.setText(dateText);
    }

    /**
     * This method adds an ActionListener to the calendar display combo box.
     * 
     * @param e the ActionListener to handle selection events
     */
    public void changeCalendarDisplay(ActionListener e){
        calendarDisplayBox.addActionListener(e);
    }

    /**
     * This method adds an ActionListener to the entries combo box for pop-up selections.
     * 
     * @param e the ActionListener to handle selection events
     */
    public void selectPopUps(ActionListener e){
        entriesBox.addActionListener(e);
    }

    /**
     * This method adds an ActionListener to the accounts combo box.
     * 
     * @param e the ActionListener to handle selection events
     */
    public void changeAccountSelection(ActionListener e) {
        accountsBox.addActionListener(e);
    }

    /**
     * This method adds an ActionListener to the previous button 
     * for navigating to the previous date range.
     * 
     * @param listener the ActionListener to handle button clicks
     */
    public void setPreviousButtonListener(ActionListener listener) {
        previousButton.addActionListener(listener);
    }

    /**
     * This method adds an ActionListener to the next button
     * for navigating to the next date range.
     * 
     * @param listener the ActionListener to handle button clicks
     */    
    public void setNextButtonListener(ActionListener listener) {
        nextButton.addActionListener(listener);
    }

    /**
     * This method adds an ActionListener to the jump date button for jumping to a specific date.
     * 
     * @param listener the ActionListener to handle button clicks
     */
    public void setJumpDateButtonListener(ActionListener listener) {
        jumpDateButton.addActionListener(listener);
    }
}
