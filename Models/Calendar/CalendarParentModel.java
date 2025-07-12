package Models.Calendar;    // We use this package to organize our code

import Models.Account.AccountModel;     // We use this to represent the owner of the calendar
import Models.Entry.EntryModel;         // Base class for all calendar entries

import java.util.ArrayList;

/**
 * This class represents a parent model for calendars.
 * It contains a name, an owner, and a list of entries.
 * It serves as a base class for specific types of calendars like Normal, Personal, and Family. 
 */
public class CalendarParentModel {
    private String name;                     // The name of the calendar 
    private AccountModel owner;              // The owner of the calendar
    private ArrayList<EntryModel> entries;   // This includes all calendar entries such as events, tasks, etc.

    /**
     * This constructor initializes a new CalendarParentModel with the specified name and owner.
     * It initializes the entries list as an empty ArrayList.
     * 
     * @param name  the name of the calendar
     * @param owner the account that owns the respective calendar
     */
    public CalendarParentModel(String name, AccountModel owner){
        this.entries = new ArrayList<EntryModel>();
        this.name = name;
        this.owner = owner;
    }

    // Getters

    /**
     * This getter gets the name of the calendar.
     * 
     * @return the name of the calendar
     */
    public String getName() {
        return name;
    }

    /**
     * This getter gets the owner of the calendar.
     * 
     * @return the account that owns the calendar
     */
    public AccountModel getOwner() {
        return owner;
    }

    /**
     * This getter gets the entries in the calendar.
     * 
     * @return the list of entries in the calendar
     */
    public ArrayList<EntryModel> getEntries() {
        return entries;
    }

    /**
     * This getter gets the calendar itself.
     * 
     * @return the calendar parent model
     */
    public CalendarParentModel getCalendar() {
        return this;
    }

    // Setters
    
    /**
     * This setter sets the name of the calendar.
     * 
     * @param name the new name of the calendar
     */
    public void setName(String name) {
        this.name = name;
    }


    // Methods for children classes only
    
    /**
     * This method adds an entry to the calendar.
     * 
     * @param entry the entry to be added to the calendar
     */
    public void addEntry(EntryModel entry) {
        entries.add(entry);
    }

    /**
     * This method edits an entry in the calendar.
     * It finds the entry in the list and replaces it with the new entry.
     * If the entry is not found, it prints an error message.
     * 
     * @param newEntry the new entry to replace the old entry
     * @param oldEntry the old entry to be replaced
     */
    public void editEntry(EntryModel newEntry, EntryModel oldEntry){
        int index = entries.indexOf(oldEntry);
        if (index != -1){
            entries.set(index, newEntry);
            System.out.println("Entry updated successfully.");
        } else {
            System.out.println("Entry not found.");
        }
    }

    /**
     * This method deletes an entry from the calendar.
     * 
     * @param entry the entry to be deleted from the calendar
     */
    public void deleteEntry(EntryModel entry) {
        entries.remove(entry);
    }
}
