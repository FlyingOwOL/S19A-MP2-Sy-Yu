package Controllers.Listeners_AddEntryPopUps;

import Views.AccountPage;
import Views.AddEntryPopUps.AddEvent;

import java.awt.event.ActionListener;
import Models.Entry.EventEntry;

import java.awt.event.ActionEvent;

public class AddEventListener implements ActionListener {
    
    private AddEvent addEvent;
    private AccountPage accountPage;


    public AddEventListener(AddEvent addEvent, AccountPage accountPage) {
        this.addEvent = addEvent;
        this.accountPage = accountPage;
    }

    public void actionPerformed(ActionEvent e) {
        if (e.getSource() == addEvent.getSubmitButton()){
            String title = addEvent.getTitleField().getText();
            String organizer = addEvent.getOrganizerField().getText();
            String venue = addEvent.getVenueField().getText();
            String startDateTime = addEvent.getStartDateField().getText();
            String endDateTime = addEvent.getEndDateField().getText();
            String details = addEvent.getDetailArea().getText();

            EventEntry newEvent = new EventEntry(title, venue, organizer);
            newEvent.setStartDate(startDateTime);
            newEvent.setEndDate(endDateTime);
            newEvent.setDetails(details);

            accountPage.getCurrentCalendar().addEntry(newEvent);  

            addEvent.dispose();
        }
    }
}
