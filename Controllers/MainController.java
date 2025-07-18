package Controllers;

// Models import
import Models.Account.AccountModel;
import Models.Calendar.*;
import Models.Entry.*;
import Views.AccountPage;

// Views import

// Other imports
import java.util.ArrayList;

public class MainController {
    private ArrayList<AccountModel> accounts;
    private ArrayList<CalendarParentModel> publicCalendars; // includes Normal and Family calendars only

    //controllers
    private EntriesPopUpsController entriesPopUpsController;
    private CalendarDisplayController calendarDisplayController;
    private AccountSelectionController accountSelectionController;
    private CalendarDateController calendarDateController;

    //yezzur
    private AccountPage accountPage;
    public MainController() {
        this.accounts = new ArrayList<>();
        this.publicCalendars = new ArrayList<>();

        //where da featuers are added 
        this.accountPage = new AccountPage();

        // add the bloody features mate
        this.entriesPopUpsController = new EntriesPopUpsController(accountPage);
        this.calendarDisplayController = new CalendarDisplayController(accountPage);
        this.accountSelectionController = new AccountSelectionController(accountPage);
        this.calendarDateController = new CalendarDateController(accountPage);
    }
}
