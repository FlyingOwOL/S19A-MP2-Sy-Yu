package Models.Calendar;                // We use this package to organize our code

import Models.Account.AccountModel;     // We use this to represent the owner of the calendar

/**
 * This class represents a family calendar in the calendar system.
 * 
 * A family calendar is publicly available and can be accessed by anyone with the access code.
 * It extends the CalendarParentModel class to inherit common calendar functionalities.
 * 
 */
public class Family extends CalendarParentModel {
    private final boolean isPubliclyAvailable = true;   // Indicates that the family calendar is publicly available
    private String accessCode;                          // The access code for the family calendar

    /**
     * This constructor initializes a new Family calendar with the specified name, owner, and access code.
     * It initializes the name and owner using the superclass constructor
     * 
     * @param name        the name of the family calendar
     * @param owner       the account that owns the family calendar
     * @param accessCode  the access code for the family calendar
     */
    public Family(String name, AccountModel owner, String accessCode) {
        super(name, owner);
        this.accessCode = accessCode;
    }

    // Getters

    /**
     * This getter gets the availability status of the family calendar.
     * 
     * @return true if the family calendar is publicly available, false otherwise
     */
    public boolean getAvailability() {
        return isPubliclyAvailable;
    }

    /**
     * This getter gets the access code of the family calendar.
     * 
     * @return the access code of the family calendar
     */
    public String getCode() {
        return accessCode;
    }

    // Setters

    /**
     * This setter sets the access code of the family calendar.
     * 
     * @param newAccessCode the new access code for the family calendar
     */
    public void setCode(String newAccessCode){
        this.accessCode = newAccessCode;
    }
}
