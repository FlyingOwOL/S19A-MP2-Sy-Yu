package Controllers.Listeners_Add_Delete_Calendar_PopUps;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import Views.Add_Delete_Calendar_PopUps.AddCalendarFrame;

public class AddCalendarListener implements ActionListener{
    AddCalendarFrame addCalendarFrame;

    public AddCalendarListener(AddCalendarFrame addCalendarFrame){
        this.addCalendarFrame = addCalendarFrame;
    }
    public void actionPerformed(ActionEvent e){
        String selectedType = null;
        if (e.getSource() == addCalendarFrame.getCreationType()){
            addCalendarFrame.createMode();
            if (e.getSource() ==  addCalendarFrame.getCalendarTypeBox()){ //changes if selected calendar is family
                selectedType = addCalendarFrame.getCalendarType();
            }

        } else if (e.getSource() == addCalendarFrame.getImportType()){
            addCalendarFrame.importMode();
            if (addCalendarFrame.getImportedCalendarBox().getSelectedItem().equals("Family")) {
                selectedType = "Family";
            } 
        } 



        if (selectedType.equals("Family")) { //constantly checks if type is family
            addCalendarFrame.familyCalendarMode();
        } else {
            addCalendarFrame.anyCalendarMode();
        }        
        if (e.getSource() == addCalendarFrame.getAddButton()){
            
        }
    }
}
