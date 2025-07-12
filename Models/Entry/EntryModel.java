package Models.Entry;               // We use this package to organize our code 

import java.time.LocalDate;         // We use this to get the current date

/**
 * This class represents a general calendar entry with a title, optional details, and a date.
 * 
 * This is the base class for other specific types of entries like Tasks, Events, Meetings, and Journals.
 * Each entry must have a title and date, while details are optional.
 * 
 */
public class EntryModel {
    private String title;           // The title of the entry
    private String details;         // Optional details about the entry
    private LocalDate date;         // The date of the entry

    /**
     * This constructor constructs a new EntryModel with the specified title.
     * It initializes details as an empty string and the date as the current date.
     *
     * @param title the title of the entry
     */
    public EntryModel(String title){
        this.title = title;
        this.details = "";
        this.date = LocalDate.now();
    }

    // Getters

    /**
     *  This getter gets the title of the entry.
     * 
     * @return the title of the entry
     * 
     */
    public String getTitle() {
        return title;
    }

    /**
     * This getter gets the details of the entry.
     * 
     * @return the details of the entry
     */
    public String getDetails() {
        return details;
    }

    /**
     * This getter gets the date of the entry.
     * 
     * @return the date of the entry
     */
    public LocalDate getDate() {
        return date;
    }

    // Setters

    /**
     * This setter sets the title of the entry.
     * 
     * @param title the new title of the entry
     */
    public void setTitle(String title) {
        this.title = title;
    }

    /**
     * This setter sets the details of the entry.
     * 
     * @param details the new details of the entry
     */
    public void setDetails(String details) {
        this.details = details;
    }

    /**
     * This setter sets the date of the entry.
     * 
     * @param date the new date of the entry
     */
    public void setDate(LocalDate date) {
        this.date = date;
    }


    //@Override
    // This method returns a string representation of the entry.
    public String toString() {
        return "Title: " + title + "\nDetails: " + details + "\nDate: " + date;
    }
}
