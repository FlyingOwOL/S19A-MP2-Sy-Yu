package Models.Entry;


import java.time.LocalDate;
import java.time.LocalDateTime;

public class EventEntry extends EntryModel{
    private String venue;
    private String organizer;
    private LocalDate startDate;
    private LocalDate endDate;
    private LocalDateTime startDateTime;
    private LocalDateTime endDateTime;
    
    public EventEntry(String title, String venue, String owner){
        super(title);
        this.organizer = owner;
        this.startDate = LocalDate.now();
        this.endDate = LocalDate.now();
    }

    //getters
    public String getVenue() {
        return venue;
    }
    public String getOrganizer() {
        return organizer;
    }
    public LocalDate getStartDate() {
        return startDate;
    }
    public LocalDate getEndDate() {
        return endDate;
    }

    //setters
    public void setStartDate(String startDate) {
        this.startDate = LocalDate.parse(startDate);
        this.startDateTime = LocalDateTime.parse(startDate);
    }
    public void setEndDate(String endDate) {
        this.endDate = LocalDate.parse(endDate);
        this.endDateTime = LocalDateTime.parse(endDate);
    }

    /*
     * 
     */
    public boolean isValidStartDate(String startDate){
        boolean isValid = false;
        return isValid;
    }
    /*
     * 
     */
    public boolean isValidEndDate(String endDate){
        boolean isValid = false;
        return isValid;
    }
}
