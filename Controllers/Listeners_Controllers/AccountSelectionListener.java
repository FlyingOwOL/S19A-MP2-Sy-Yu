package Controllers.Listeners_Controllers;

import Views.AccountPage;
import Views.EntriesDisplayView;
import Views.Add_Delete_Calendar_PopUps.*;

import Controllers.LoginController;

import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class AccountSelectionListener implements ActionListener {
    private AccountPage accountPage;

    public AccountSelectionListener(AccountPage accountPage) {
        this.accountPage = accountPage;
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        String optionSelected;
        try {
            optionSelected = accountPage.getSelectedAccount();
            JFrame popUp = null;
            switch (optionSelected) {
                case "View Entries":
                    popUp = new EntriesDisplayView(this.accountPage.getCurrentCalendar());
                    break;
                case "Switch":
                    popUp = new SwitchCalendarFrame(); //TODO add switch calendar
                    //switchCalendar((SwitchCalendarFrame)popUp, accountPage);
                    break;
                case "Add Calendar":
                    popUp = new AddCalendarFrame();
                    addNewCalendar((AddCalendarFrame)popUp, accountPage);
                    break;
                case "Delete Calendar": 
                    popUp = new DeleteCalendarFrame(); //TODO add delete calendar
                    break;
                case "View Journal":
                    popUp = new ViewJournal();  //TODO add View Journal
                    break;
                case "Sign out":
                    accountPage.dispose();
                    new LoginController();
                    break;
            }
            if (popUp != null) {
                popUp.setLocationRelativeTo(accountPage);
            }
        } catch (Exception ex) {
            System.out.println("Error in account selection: " + ex.getMessage());
        }
    }

    private void addNewCalendar(AddCalendarFrame popUp, AccountPage accountPage) {
        accountPage.setAddCalendarFrame(popUp);
    }
    
}
