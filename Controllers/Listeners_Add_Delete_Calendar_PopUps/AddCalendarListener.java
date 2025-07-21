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
        if (e.getSource() == addCalendarFrame.getCreationType()){
            addCalendarFrame.getImportedCalendarBox().setVisible(false);
            addCalendarFrame.getCalendarPasswordField().setVisible(false);
            addCalendarFrame.updateGUI();
        } else if (e.getSource() == addCalendarFrame.getImportType()){
            addCalendarFrame.getImportedCalendarBox().setVisible(true);
            addCalendarFrame.getCalendarPasswordField().setVisible(true);
            addCalendarFrame.updateGUI();
        } 
        if (e.getSource() == addCalendarFrame.getAddButton()){
            
        }
    }
}
