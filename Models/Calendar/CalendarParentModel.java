package Models.Calendar;

import Models.Account.AccountModel;
import Models.Entry.EntryModel;

import java.util.ArrayList;

public class CalendarParentModel {
    private String name;
    private AccountModel owner;
    private ArrayList<EntryModel> entries;

    public CalendarParentModel(){

    }

    //getters
    public String getName() {
        return name;
    }
    public AccountModel getOwner() {
        return owner;
    }
    public ArrayList<EntryModel> getEntries() {
        return entries;
    }
}
