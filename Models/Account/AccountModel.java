package Models.Account;

import Models.Calendar.*;

import java.util.ArrayList;

public class AccountModel {
    private String name;
    private String password;
    private ArrayList<CalendarParentModel> calendars;
    private boolean activeStatus;

    public AccountModel(String name, String password){
        this.name = name;
        this.password = password;
        this.calendars = new ArrayList<CalendarParentModel>();
        this.activeStatus = true;

        this.calendars.add(new Personal(this.name, this)); //personal calendar with same name and owner
    }

    //getters
    public String getName() {
        return name;
    }
    public boolean getActiveStatus() {
        return activeStatus;
    }
    public ArrayList<CalendarParentModel> getCalendars() {
        return calendars;
    }


    /*
     * Deactivates the account
     */
    public void deactivateAccount() {
        this.activeStatus = false;
    }
}
