package Controllers.Listeners_AddEntryPopUps;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import Models.Entry.Meeting;
import Views.AccountPage;
import Views.AddEntryPopUps.AddMeeting;

public class AddMeetingListener implements ActionListener{
    
    private AddMeeting addMeeting;
    private AccountPage accountPage;

    public AddMeetingListener(AddMeeting addMeeting, AccountPage accountPage){
        this.addMeeting = addMeeting;
        this.accountPage = accountPage;
    }

    public void actionPerformed(ActionEvent e) {
        if (e.getSource() == addMeeting.getSubmitButton()){
            // For JTextField components
            String title = addMeeting.getTitleField().getText();
            String modality = addMeeting.getModalityField().getText();
            String venue = addMeeting.getVenueField().getText();
            String link = addMeeting.getLinkField().getText();
            String startDate = addMeeting.getStartDateField().getText();
            String endDate = addMeeting.getEndDateField().getText();

            // For JTextArea component
            String details = addMeeting.getDetailArea().getText();

            Meeting newMeeting = new Meeting(title, modality);
            newMeeting.setLink(link);
            newMeeting.setVenue(venue);
            newMeeting.setStartDate(startDate);
            newMeeting.setEndDate(endDate);
            newMeeting.setDetails(details);

            accountPage.getCurrentCalendar().addEntry(newMeeting);
        }
    }
    
}
