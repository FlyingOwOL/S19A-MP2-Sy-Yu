package Controllers;

// Models import
import Models.Account.AccountModel;
import Models.Calendar.*;
import Models.Entry.*;

// Views import

// Other imports
import java.util.ArrayList;

public class MainController {
    public static ArrayList<AccountModel> accounts = new ArrayList<>();
    public static ArrayList<CalendarParentModel> publicCalendars = new ArrayList<>(); // includes Normal and Family calendars only
    
    private LoginController loginController;

    public MainController() {
        //where da featuers are added 
        MainController.accounts.add(new AccountModel("jason", "1234"));
        this.loginController = new LoginController();
    }
    
    public void addAccount(AccountModel account) {
        accounts.add(account);
    }

    public static boolean accountExists(String name) {
        boolean isTaken = false;
        for (AccountModel account : accounts) {
            if (account.getName().equals(name)) {
                isTaken = true;
            }
        }
        return isTaken;
    }
}
