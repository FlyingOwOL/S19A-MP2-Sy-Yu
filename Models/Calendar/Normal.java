package Models.Calendar;            // We use this package to organize our code

import Models.Account.AccountModel; // We use this to represent the owner of the calendar

/**
 * This class represents a normal calendar in the calendar system.
 * 
 * A normal calendar is publicly available and can be accessed by anyone.
 * It extends the CalendarParentModel class to inherit common calendar functionalities.
 * 
 */
public class Normal extends CalendarParentModel{
    private final boolean isPubliclyAvailable = true;   // Indicates that the normal calendar is publicly available

    /**
     * This constructor initializes a new Normal calendar with the specified name and owner.
     * It initializes the name and owner using the superclass constructor
     * 
     * @param name  the name of the normal calendar
     * @param owner the account that owns the normal calendar
     */
    public Normal(String name, AccountModel owner){
        super(name, owner);
    }

    // Getters

    /**
     * This getter gets the availability status of the normal calendar.
     * 
     * @return true if the normal calendar is publicly available
     */
    public boolean getAvailability() {
        return isPubliclyAvailable;
    }
}
