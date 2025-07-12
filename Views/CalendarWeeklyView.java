package Views;                      // We use this package to organize our code

import java.awt.BorderLayout;       // We use this to set the layout of the calendar
import java.awt.Color;              // We use this to set the background color of the rectangles
import java.awt.Dimension;          // We use this to set the preferred size of the rectangles
import java.awt.GridLayout;         // We use this to create a grid layout for the weekly view    
import javax.swing.BorderFactory;   // We use this to create borders for the rectangles
import javax.swing.JLabel;          // We use this to create labels for the day names and time slots
import javax.swing.JPanel;          // We use this to create the main panel for the weekly calendar view
import javax.swing.JScrollPane;     // We use this to create a scrollable view of the calendar    
import javax.swing.SwingConstants;  // We use this to set the alignment of text in labels

/**
 * This class represents a weekly view of the calendar.
 * It displays the days of the week and time slots, allowing users to interact with each time slot.
 * 
 * It extends JScrollPane to create a scrollable view for the weekly calendar.
 */
public class CalendarWeeklyView extends JScrollPane {
    // Initialize arrays for day names and time slots
    private String[] dayNames = {"Sunday", "Monday", "Tuesday", "Wednesday", "Thursday", "Friday", "Saturday"};
    private String[] timeSlots = {"1:00 AM", "2:00 AM", "3:00 AM", "4:00 AM", "5:00 AM", 
                                  "6:00 AM", "7:00 AM", "8:00 AM", "9:00 AM", "10:00 AM", 
                                  "11:00 AM", "12:00 PM", "1:00 PM", "2:00 PM", "3:00 PM", 
                                  "4:00 PM", "5:00 PM", "6:00 PM", "7:00 PM", "8:00 PM",
                                  "9:00 PM", "10:00 PM", "11:00 PM", "12:00 AM"};

    /**
     * This constructor initializes the CalendarWeeklyView.
     * It sets the layout, adds labels for the day names, and creates interactive rectangles for each time slot.
     * 
     * It also sets the preferred size for the scroll pane.
     */
    public CalendarWeeklyView() {
        // Create a panel to hold the calendar components
        JPanel calendarPanel = new JPanel();
        calendarPanel.setLayout(new GridLayout(timeSlots.length + 1, dayNames.length + 1)); // +1 for header row and time column

        // Add day names to the header row
        calendarPanel.add(new JLabel("Time", SwingConstants.CENTER)); // Top-left corner
        
        // Loop through the day names to create labels for each day
        for (String day : dayNames) {
            calendarPanel.add(new JLabel(day, SwingConstants.CENTER));
        }

        // Add time slots and interactive rectangles
        for (int i = 0; i < timeSlots.length; i++) {
            // Add time slot label
            calendarPanel.add(new JLabel(timeSlots[i], SwingConstants.CENTER));

            // Add interactive rectangles for each time slot and day
            for (int j = 0; j < dayNames.length; j++) {

                JPanel timeSlotPanel = new JPanel();
                timeSlotPanel.setBackground(Color.LIGHT_GRAY);
                timeSlotPanel.setBorder(BorderFactory.createLineBorder(Color.BLACK));
                timeSlotPanel.setPreferredSize(new Dimension(100, 50)); // Set preferred size for the rectangles


                timeSlotPanel.setLayout(new BorderLayout());
                timeSlotPanel.add(new JLabel("", SwingConstants.CENTER), BorderLayout.CENTER); // Placeholder for event text
                calendarPanel.add(timeSlotPanel);
            }
        }

        // Add the calendar panel to the scroll pane
        this.setViewportView(calendarPanel);
        this.setPreferredSize(new Dimension(900, 400)); // Set preferred size for the scroll pane
    }
}
