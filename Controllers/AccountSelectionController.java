package Controllers;

import Views.AccountLoginPage;
import Views.AccountPage;
import Views.Add_Delete_Calendar_PopUps.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JFrame;

/**
 * This class that listens to actions selected from the account-related dropdown in AccountPage.
 * 
 * Handles the following options:
 * - Add Calendar
 * - Delete Calendar
 * - View Journal
 * - Sign Out
 * 
 * Upon selection, it opens the appropriate pop-up window or navigates between views.
 */
public class AccountSelectionController {
    private AccountPage accountPage;
    
    /**
     * This constructor initializes the controller and attaches the listener
     * to handle actions from the account dropdown menu in the AccountPage view.
     *
     * @param accountPage the current AccountPage view
     */
    public AccountSelectionController(AccountPage accountPage) {
        this.accountPage = accountPage;
        this.accountPage.changeAccountSelection(new AccountSelectionListener());
    }

    /**
     * This inner class handles dropdown option selections for account-related operations.
     */
    class AccountSelectionListener implements ActionListener{
        public void actionPerformed(ActionEvent e){
            String optionSelected;
            try {
                optionSelected = accountPage.getSelectedAccount();
                JFrame popUp = null;
                switch (optionSelected) {
                    //"Add Calendar", "Delete Calendar", "View Journal","Sign out"
                    case "Add Calendar":
                        popUp = new AddCalendarFrame();
                        break;
                    case "Delete Calendar":
                        popUp = new DeleteCalendarFrame();
                        break;
                    case "View Journal":
                        popUp = new ViewJournal();
                        break;
                    case "Sign out":
                        accountPage.dispose();  // Close the account page
                        new AccountLoginPage(); // Open the login screen
                        break;
                }
                // If a popup was opened, center it on the screen
                if (popUp != null) {
                    popUp.setLocationRelativeTo(accountPage); 
                }
            } catch (Exception ex) {
                System.out.println("Error in account selection: " + ex.getMessage());
            }
        }

    }
}
