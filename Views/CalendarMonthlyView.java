package Views;              // We use this package to organize our code
    
import java.awt.Dimension;  // We use this to set the preferred size of the panel
import java.awt.GridLayout; // We use this to create a grid layout for the calendar view
import javax.swing.JButton; // We use this to create buttons for each day in the calendar
import javax.swing.JLabel;  // We use this to create labels for the day names
import javax.swing.JPanel;  // We use this to create the main panel for the monthly calendar view

/**
 * This class represents a monthly view of the calendar.
 * It displays the days of the week and allows users to interact with each day.
 * 
 * It extends JPanel to create a panel for the monthly calendar view.
 */
public class CalendarMonthlyView extends JPanel{

    // Initialize an array of day names for the header of the calendar
    private String[] dayNames = {"Sunday", "Monday", "Tuesday", "Wednesday", "Thursday", "Friday", "Saturday"};

    /**
     * This constructor initializes the CalendarMonthlyView.
     * It sets the preferred size, layout, and adds buttons for each day of the month.
     * 
     * It also adds labels for the day names at the top of the calendar.
     */
    public CalendarMonthlyView(){
        this.setPreferredSize(new Dimension(900, 400));
        this.setLayout(new GridLayout(6, 7));
        
        // Loop through the day names to create labels for each day
        for (String n : dayNames){
            this.add(new JLabel(n));
            
        }

        // Loop to create buttons for each day of the month. (7 x 5 = 35 buttons)
        for(int x = 0; x < 35; x++){
            this.add(new JButton());
        }
        this.setVisible(true);
    }
}
