import Controllers.MainController;
import Models.Account.AccountModel;
import Models.Calendar.CalendarParentModel;
import Views.EntriesDisplayView;

public class Main {
    public static void main(String[] args){
        //new MainController();
        new EntriesDisplayView(new CalendarParentModel("New", new AccountModel("null", "null")));
    }    
}
