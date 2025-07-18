package Controllers;

import Views.AccountPage;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

/**
 * This class controls the calendar display mode.
 * 
 * It listens for changes in the calendar display combo box 
 * and updates the view between monthly and weekly displays.
 */
public class CalendarDisplayController {
    private AccountPage accountPage;

    /**
     * This constructor initializes the CalendarDisplayController.
     * 
     * It sets up a listener for changing the calendar display mode.
     * 
     * @param accountPage the calendar GUI to control
     */
    public CalendarDisplayController(AccountPage accountPage){
        this.accountPage = accountPage;

        this.accountPage.changeCalendarDisplay(new changeDisplay());
    }

    /**
     * This inner class listens for display mode changes (Month/Week).
     * It calls the appropriate method in AccountPage to update the calendar view.
     */
    class changeDisplay implements ActionListener{
        public void actionPerformed(ActionEvent e) {
            String selectedDisplay;
            try{
                selectedDisplay = accountPage.getSelectedCalendarDisplay();
                accountPage.changeCalendarDisplay(selectedDisplay);
            } catch (NumberFormatException ex){
                System.out.println("Error in changing calendar display: ");
            }
        }
    }
}
