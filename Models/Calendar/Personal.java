package Models.Calendar;                // We use this package to organize our code

import Models.Account.AccountModel;     // We use this to represent the owner of the calendar

/**
 * This class represents a personal calendar in the calendar system.
 * 
 * A personal calendar is privately available and can only be accessed by the owner.
 * It extends the CalendarParentModel class to inherit common calendar functionalities.
 * 
 */
public class Personal extends CalendarParentModel{
    private final boolean isPubliclyAvailable = false;  // Indicates that the personal calendar is privately available

    /**
     * This constructor constructs a new Personal calendar with the specified name and owner.
     * It initializes the name and owner using the superclass constructor
     * 
     * @param name  the name of the personal calendar
     * @param owner the account that owns the personal calendar
     */ 
    public Personal(String name, AccountModel owner){
        super(name, owner);
    }

    // Getters

    /**
     * This getter gets the availability status of the personal calendar.
     * 
     * @return false since the personal calendar is privately available
     */
    public boolean getAvailability() {
        return isPubliclyAvailable;
    }
}
