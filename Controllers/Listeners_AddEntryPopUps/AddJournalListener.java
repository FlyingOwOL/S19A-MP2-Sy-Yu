package Controllers.Listeners_AddEntryPopUps;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import Models.Entry.Journal;
import Views.AccountPage;
import Views.AddEntryPopUps.AddJournal;

public class AddJournalListener implements ActionListener{
    
    private AddJournal addJournal;
    private AccountPage accountPage;

    public AddJournalListener (AddJournal addJournal, AccountPage accountPage){
        this.addJournal = addJournal;
        this.accountPage = accountPage;
    }

    public void actionPerformed(ActionEvent e) {
        if (e.getSource() == addJournal.getsubmitButton()){
            String month = addJournal.getMonthtField().getText();
            String title = "This " + month + " Journal";
            String details = addJournal.getDetailArea().getText();

            //TODO check if there is already a journal for that month if yes don't allow new journal

            Journal newJournal = new Journal(title, details, month); 

            accountPage.getCurrentCalendar().addEntry(newJournal);
        }
    }
}
