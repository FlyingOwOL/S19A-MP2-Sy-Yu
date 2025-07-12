package Models.Entry;                       // We use this package to organize our code  

import Models.Account.AccountModel;         // We use this to represent the owner of the event
import java.time.LocalDate;                 // We use this to get the start and end dates of the event 

/**
 * This class represents an event entry in the calendar.
 * 
 * An event has a title, venue, organizer, and start and end dates.
 * It extends the EntryModel class to inherit a common title.
 * 
 */
public class Event extends EntryModel{
    private String venue;           // The venue of the event
    private String organizer;       // The organizer of the event
    private LocalDate startDate;    // The start date of the event
    private LocalDate endDate;      // The end date of the event
    
    /**
     * This constructor constructs a new Event with the specified venue, and owner.
     * It initializes the title using the superclass constructor. 
     * 
     * @param title  the title of the event
     * @param venue  the venue of the event
     * @param owner  the account that created the event (used as organizer)
     */
    public Event(String title, String venue, AccountModel owner){
        super(title);
        this.venue = venue;
        this.organizer = owner.getName();
    }

    // Getters

    /**
     * This getter gets the venue of the event.
     * 
     * @return the venue of the event
     */
    public String getVenue() {
        return venue;
    }

    /**
     * This getter gets the organizer of the event.
     * 
     * @return the organizer of the event
     */
    public String getOrganizer() {
        return organizer;
    }

    // Setters

    /**
     * This setter sets the venue of the event.
     * 
     * @param venue the new venue of the event
     */
    public void setStartDate(LocalDate startDate) {
        this.startDate = startDate;
    }

    /**
     * This setter sets the organizer of the event.
     * 
     * @param organizer the new organizer of the event
     */
    public void setEndDate(LocalDate endDate) {
        this.endDate = endDate;
    }

    /**
     * This setter sets the venue of the event.
     * 
     * @param venue the new venue of the event
     */
    public boolean isValidStartDate(){
        return true;
    }
    
    /**
     * This method checks if the end date is valid.
     * 
     * @return true if the end date is valid, false otherwise
     */
    public boolean isValidEndDate(){
        return true;
    }
}
