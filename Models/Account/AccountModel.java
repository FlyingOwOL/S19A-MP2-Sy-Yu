package Models.Account;         // We use this package to organize our code

import Models.Calendar.*;       // We use this to represent the calendars owned by the account

import java.util.ArrayList; 

/**
 * This class represents an account in the calendar system.
 * 
 * An account has a name, password, a list of calendars, and an active status.
 * It allows for creating a personal calendar with the same name and owner.
 * 
 */
public class AccountModel {
    private String name;                                // The name of the account  
    private String password;                            // The password of the account  
    private ArrayList<CalendarParentModel> calendars;   // The list of calendars owned by the account
    private boolean activeStatus;                       // The active status of the account (true if active, false if deactivated)

    /**
     * This constructor constructs a new AccountModel with the specified name and password.
     * It initializes the calendars list and sets the active status to true.
     * 
     * It also creates a personal calendar with the same name and owner.
     * 
     * @param name     the name of the account
     * @param password the password of the account
     */
    public AccountModel(String name, String password){
        this.name = name;
        this.password = password;
        this.calendars = new ArrayList<CalendarParentModel>();
        this.activeStatus = true;

        this.calendars.add(new Personal(this.name, this)); //personal calendar with same name and owner
    }

    // Getters
    
    /**
     * This getter gets the name of the account.
     * 
     * @return the name of the account
     */
    public String getName() {
        return name;
    }

    /**
     * This getter gets the status of the account.
     * 
     * @return the active status of the account (true if active, false if deactivated) 
     */
    public boolean getActiveStatus() {
        return activeStatus;
    }

    /**
     * This getter gets the calendars owned by the account.
     * 
     * @return the list of calendars owned by the account
     */
    public ArrayList<CalendarParentModel> getCalendars() {
        return calendars;
    }



    /**
     * This method checks if the given password matches the account's password.
     * 
     * @param password the password to check
     * 
     * @return true if the password matches, false otherwise
     */
    public boolean checkAuthority(String password){
        return this.password.equals(password);
    }

    /**
     * This method deactivates the account.
     * 
     * It sets the active status to false, indicating that the account is no longer active.
     */
    public void deactivateAccount() {
        this.activeStatus = false;
    }
}
