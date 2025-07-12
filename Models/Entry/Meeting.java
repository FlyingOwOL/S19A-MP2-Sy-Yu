package Models.Entry;   // We use this package to organize our code

import java.time.LocalDate;     // We use this to get the start and end times of the meeting 

/**
 * This class represents a meeting entry in the calendar.
 * A meeting has a title, modality, venue, link, and start and end times.
 * It extends the EntryModel class to inherit a common entry.
 * 
 */
public class Meeting extends EntryModel{
    private String modality;            // The modality of the meeting (online, onsite, hybrid)
    private String venue;               // The venue of the meeting
    private String link;                // The link for the meeting (if online)
    private LocalDate startTime;        // The start time of the meeting
    private LocalDate endTime;          // The end time of the meeting

    /**
     * This constructor initializes a new Meeting with the specified title and modality.
     * It initializes the title using the superclass constructor.
     * 
     * @param title    the title of the meeting
     * @param modality the modality of the meeting (online, onsite, hybrid)
     */
    public Meeting(String title, String modality){
        super(title);
        this.modality = modality;
        this.venue = "";
        this.link = "";
        this.startTime = LocalDate.of(2000, 1, 1); // Default date
        this.endTime = LocalDate.of(2000, 1, 1); // Default date
    }

    // Getters

    /**
     * This getter gets the modality of the meeting.
     * 
     * @return the modality of the meeting
     */
    public String getModality() {
        return modality;
    }

    /**
     * This getter gets the venue of the meeting.
     * 
     * @return the venue of the meeting
     */
    public String getVenue() {
        return venue;
    }

    /**
     * This getter gets the link for the meeting.
     * 
     * @return the link for the meeting
     */
    public String getLink() {
        return link;
    }
    
    // Setters
    
    /**
     * This setter sets the modality of the meeting.
     * 
     * @param modality the new modality of the meeting
     */
    public void setModality(String modality) {
        // Check if the modality is valid before setting it
        if (isValidModality(modality)) {
            this.modality = modality;
        } 
    }

    /**
     * This setter sets the venue of the meeting.
     * 
     * @param venue the new venue of the meeting
     */
    public void setVenue(String venue) {
        this.venue = venue;
    }

    /**
     * This setter sets the link for the meeting.
     * 
     * @param link the new link for the meeting
     */
    public void setLink(String link) {
        this.link = link;
    }

    /**
     * This is a method to validate the modality of the meeting.
     * 
     * @param modality The modality to validate.
     * 
     * @return true if the modality is valid, false otherwise.
     */
    public boolean isValidModality(String modality){
        boolean isValid = false; // Assume the modality is not valid by default
        switch (modality){
            case "online":
                isValid = true;
                break;
            case "onsite":
                isValid = true;
                break;
            case "hybrid":
                isValid = true;
                break;
        }
        return isValid;
    }
}
