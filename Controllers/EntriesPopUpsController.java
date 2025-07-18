package Controllers;

import Views.AccountPage;
import Views.AddEntryPopUps.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JFrame;

/**
 * This class controls the pop-up windows for adding new entries in the calendar.
 * 
 * It listens for the user's selection from the entries combo box (Event, Task, Meeting, Journal),
 * and opens the corresponding pop-up window.
 * 
 * It connects the AccountPage view with the entry creation process.
 */
public class EntriesPopUpsController {
    private AccountPage accountPage;

    /**
     * This constructor initializes the EntriesPopUpsController.
     * It links the AccountPage and listens for entry selection events.
     * 
     * @param accountPage the AccountPage view where the entries are selected
     */
    public EntriesPopUpsController(AccountPage accountPage) {
        this.accountPage = accountPage;
        this.accountPage.selectPopUps(new PopUpSelection());
    }

    /**
     * This inner class listens for the selection of entry types (Event, Task, Meeting, Journal).
     * 
     * When an entry type is selected, it opens the corresponding add-entry pop-up window.
     */
    class PopUpSelection implements ActionListener {
        String selectedEntry;

        /**
         * This method handles the user's entry type selection.
         * It opens the appropriate pop-up based on the selected entry.
         * 
         * @param e the event triggered when the user selects an entry type
         */
        public void actionPerformed(ActionEvent e) {
            String selectedEntry;
            try {
                selectedEntry = accountPage.getSelectedEntry();
                // Logic to handle the selected entry type
                JFrame popUp = null;
                switch (selectedEntry){
                    case "Task":
                        popUp = new AddTask();
                        break;
                    case "Event":
                        popUp = new AddEvent();
                        break;
                    case "Meeting":
                        popUp = new AddMeeting();
                        break;
                    case "Journal":
                        popUp = new AddJournal();
                        break;
                }

                if (popUp != null) {
                    popUp.setLocationRelativeTo(accountPage); //centers it to accountPage;
                }
            } catch (Exception ex) {
                System.out.println("Error in selecting entry type: ");
            }
        }
    }
    
}
