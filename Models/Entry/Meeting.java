package Models.Entry;

import java.time.LocalDate;
import java.time.LocalDateTime;

public class Meeting extends EntryModel{
    private String modality;
    private String venue;
    private String link;
    private LocalDate startDate;
    private LocalDate endDate;
    private LocalDateTime startDateTime;
    private LocalDateTime endDateTime;

    public Meeting(String title, String modality){
        super(title);
        this.modality = modality;
        this.venue = "";
        this.link = "";
        this.startDate = LocalDate.of(2000, 1, 1); // Default date
        this.endDate = LocalDate.of(2000, 1, 1); // Default date
    }

    //getters
    public String getModality() {
        return modality;
    }
    public String getVenue() {
        return venue;
    }
    public String getLink() {
        return link;
    }
    public LocalDate getStartDate() {
        return startDate;
    }
    public LocalDate getEndDate() {
        return endDate;
    }
    
    // Setters
    public void setModality(String modality) {
        if (isValidModality(modality)) {
            this.modality = modality;
        } 
    }
    public void setVenue(String venue) {
        this.venue = venue;
    }
    public void setLink(String link) {
        this.link = link;
    }
    public void setStartDate (String startDate){
        this.startDate = LocalDate.parse(startDate);
        this.startDateTime = LocalDateTime.parse(startDate);
    }
    public void setEndDate (String endDate){
        this.endDate = LocalDate.parse(endDate);
        this.endDateTime = LocalDateTime.parse(endDate);
    }

    /*
     * Method to validate the modality of the meeting.
     * @param modality The modality to validate.
     * @return true if the modality is valid, false otherwise.
     */
    public boolean isValidModality(String modality){
        boolean isValid = false;
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
