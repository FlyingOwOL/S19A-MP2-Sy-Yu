package Controllers;        // We use this package to organize our code

// Models import for Account and Calendar
import Models.Account.AccountModel;
import Models.Calendar.*;
import java.util.ArrayList;

/**
 * This class serves as the main controller for the calendar system.
 * It manages accounts and public calendars, including Normal and Family calendars.
 * 
 * It provides methods to add accounts and retrieve public calendars.
 * 
 * This class maintains two main lists:
 * - Registered accounts (private per user)
 * - Public calendars (Normal and Family types)
 */
public class MainController {
    // Initialize lists to hold accounts and public calendars
    private ArrayList<AccountModel> accounts;
    private ArrayList<CalendarParentModel> publicCalendars; // includes Normal and Family calendars only
    
    /**
     * This constructor initializes the MainController with
     * empty lists for accounts and public calendars.
     * 
     */
    public MainController() {
        this.accounts = new ArrayList<>();
        this.publicCalendars = new ArrayList<>();
    }
}
