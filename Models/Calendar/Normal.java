package Models.Calendar;

import Models.Calendar.CalendarParentModel;
import Models.Entry.EntryModel;
import Models.Account.AccountModel;

import java.util.ArrayList;

public class Normal extends CalendarParentModel{
    private boolean isPubliclyAvailable = true;

    public Normal(String name, AccountModel owner){
        super(name, owner);
    }
}
