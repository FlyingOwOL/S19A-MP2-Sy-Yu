package Controllers;


import Models.Account.AccountModel;
import Models.Calendar.*;
import Views.AccountPage;
import java.util.ArrayList;

public class MainController {
    private ArrayList<AccountModel> accounts;
    private ArrayList<CalendarParentModel> publicCalendars; // includes Normal and Family calendars only

    // Controllers
    private EntriesPopUpsController entriesPopUpsController;
    private CalendarDisplayController calendarDisplayController;
    private AccountSelectionController accountSelectionController;
    private CalendarDateController calendarDateController;
    private AccountPage accountPage;

    /**
     * This constructor initializes the MainController.
     * 
     * It sets up the main calendar page and connects all features and controllers.
     */
    public MainController() {
        this.accounts = new ArrayList<>();
        this.publicCalendars = new ArrayList<>();

        this.accountPage = new AccountPage();

        this.entriesPopUpsController = new EntriesPopUpsController(accountPage);
        this.calendarDisplayController = new CalendarDisplayController(accountPage);
        this.accountSelectionController = new AccountSelectionController(accountPage);
        this.calendarDateController = new CalendarDateController(accountPage);
    }

    
}
