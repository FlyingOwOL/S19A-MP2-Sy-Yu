package Views.Add_Delete_Calendar_PopUps;

import Utilities.FixedValues;
import Views.PopUpFormat;

import javax.swing.JPanel;
import javax.swing.JButton;
import javax.swing.JLabel;
import javax.swing.JComboBox;
import java.awt.Color;

public class DeleteCalendarFrame extends PopUpFormat {
    private JPanel headerPanel = new JPanel();
    private JPanel contentPanel = new JPanel();

    private JLabel titleLabel = new JLabel("Delete Calendar");

    private String[] calendars = {"Calendar 1", "Calendar 2", "Calendar 3"};
    private JComboBox<String> calendarComboBox = new JComboBox<>(calendars);

    private JButton deleteButton = new JButton("Delete");

    public DeleteCalendarFrame(){
        this.setTitle("Delete Calendar");

        // Set bounds for each panel in the frame
        headerPanel.setBounds(0, 0, 400, 100);
        headerPanel.setBackground(Color.CYAN);
        contentPanel.setBounds(0, 100, 400, 150);

        //header components
        headerPanel.setLayout(null);
        titleLabel.setFont(FixedValues.TITLE_FONT);
        titleLabel.setBounds(122, 20, 200, 50);
        headerPanel.add(titleLabel);


        //content components
        contentPanel.setLayout(null);
        calendarComboBox.setBounds(50, 20, 300, 30);
        deleteButton.setBounds(150, 70, 100, 30);
        deleteButton.setFocusable(false);
        contentPanel.add(calendarComboBox);
        contentPanel.add(deleteButton);

        //frame arrangement
        this.add(headerPanel);
        this.add(contentPanel);
        this.setVisible(true);
    }

    // Getter methods for the listener
    public JButton getDeleteButton() {
        return deleteButton;
    }

    public JComboBox<String> getCalendarComboBox() {
        return calendarComboBox;
    }
}