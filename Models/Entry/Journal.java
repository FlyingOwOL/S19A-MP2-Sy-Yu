package Models.Entry;   // We use this package to organize our code 

/**
 * This class represents a journal entry in the calendar.
 * A journal entry has a title and optional details.
 * It can only be created within a Personal Calendar.
 * Only one journal entry is allowed per date.
 * 
 * It extends the EntryModel class to inherit a common entry.
 * 
 */
public class Journal extends EntryModel{

    /**
     * This constructor initializes a new Journal with the specified title and details.
     * It initializes the title using the superclass constructor.
     * 
     * @param title
     * @param details
     */
    public Journal(String title, String details){
        super(title);
        setDetails(details);
    }
}
