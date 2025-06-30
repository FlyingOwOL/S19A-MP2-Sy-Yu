package Models.Calendar;

import Models.Account.AccountModel;
import Models.Entry.EntryModel;

import java.util.ArrayList;

public class CalendarParentModel {
    protected String name;
    protected AccountModel owner;
    protected ArrayList<EntryModel> entries; //inherited by children classes

    public CalendarParentModel(String name, AccountModel owner){
        this.entries = new ArrayList<EntryModel>();
        this.name = name;
        this.owner = owner;
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


    //methods for children classes only
    protected void addEntry(EntryModel entry) {
        entries.add(entry);
    }
    protected void editEntry(EntryModel newEntry, EntryModel oldEntry){
        int index = entries.indexOf(oldEntry);
        if (index != -1){
            entries.set(index, newEntry);
            System.out.println("Entry updated successfully.");
        } else {
            System.out.println("Entry not found.");
        }
    }
    protected void deleteEntry(EntryModel entry) {
        entries.remove(entry);
    }
}
