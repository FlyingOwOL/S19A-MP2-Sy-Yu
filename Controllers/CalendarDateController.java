package Controllers;

import Views.AccountPage;
import Controllers.Listeners_Controllers.PreviousDateListener;
import Controllers.Listeners_Controllers.NextDateListener;
import Controllers.Listeners_Controllers.JumpDateListener;

import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.time.format.TextStyle;
import java.util.Locale;

public class CalendarDateController {
    private AccountPage accountPage;
    private LocalDateTime currentDate;
    private DateTimeFormatter displayFormatter;

    public CalendarDateController(AccountPage accountPage) {
        this.accountPage = accountPage;
        this.currentDate = LocalDateTime.now();
        this.displayFormatter = DateTimeFormatter.ofPattern("MMM - yyyy");

        // Connect the navigation listeners
        setupNavigationListeners();

        // Initial display
        updateDateDisplay();
    }

    private void setupNavigationListeners() {
        // Connect Previous button
        accountPage.setPreviousButtonListener(new PreviousDateListener(accountPage, this));

        // Connect Next button
        accountPage.setNextButtonListener(new NextDateListener(accountPage, this));

        // Connect Jump Date button
        accountPage.setJumpDateButtonListener(new JumpDateListener(accountPage, this));
    }

    public void updateDateDisplay() {
        String displayText;
        boolean isWeekView = "Week".equals(accountPage.getSelectedCalendarDisplay());

        if (isWeekView) {
            LocalDateTime startOfWeek = currentDate.with(java.time.DayOfWeek.MONDAY);
            LocalDateTime endOfWeek = currentDate.with(java.time.DayOfWeek.SUNDAY);

            if (startOfWeek.getMonth() == endOfWeek.getMonth()) {
                displayText = String.format("%s %d",
                        startOfWeek.getMonth().getDisplayName(TextStyle.FULL, Locale.ENGLISH),
                        endOfWeek.getYear());
            } else {
                displayText = String.format("%s - %s %d",
                        startOfWeek.getMonth().getDisplayName(TextStyle.FULL, Locale.ENGLISH),
                        endOfWeek.getMonth().getDisplayName(TextStyle.FULL, Locale.ENGLISH),
                        endOfWeek.getYear());
            }
        } else {
            displayText = currentDate.format(displayFormatter);
        }

        accountPage.updateDateLabel(displayText);

        // Update the calendar view to reflect the new date
        updateCalendarView();
    }

    private void updateCalendarView() {
        // Force the calendar view to refresh with the new date
        accountPage.updateCalendarViewsWithDate(currentDate.toLocalDate());
    }

    public void navigateToPreviousMonth() {
        currentDate = currentDate.minusMonths(1);
        updateDateDisplay();
    }

    public void navigateToNextMonth() {
        currentDate = currentDate.plusMonths(1);
        updateDateDisplay();
    }

    public void navigateToPreviousWeek() {
        currentDate = currentDate.minusWeeks(1);
        updateDateDisplay();
    }

    public void navigateToNextWeek() {
        currentDate = currentDate.plusWeeks(1);
        updateDateDisplay();
    }

    public void jumpToDate(int month, int year) {
        LocalDateTime newDate = LocalDateTime.of(year, month, 1,
                currentDate.getHour(), currentDate.getMinute(), currentDate.getSecond());
        newDate = newDate.withDayOfMonth(Math.min(currentDate.getDayOfMonth(), newDate.toLocalDate().lengthOfMonth()));
        currentDate = newDate;
        updateDateDisplay();
    }

    public LocalDateTime getCurrentDate() {
        return currentDate;
    }

    public int getCurrentYear() {
        return currentDate.getYear();
    }

    public int getCurrentMonth() {
        return currentDate.getMonthValue();
    }

    public int getCurrentDay() {
        return currentDate.getDayOfMonth();
    }

    public String getCurrentMonthName() {
        return currentDate.getMonth().getDisplayName(TextStyle.FULL, Locale.ENGLISH);
    }

    public String getFormattedCurrentDate() {
        return currentDate.format(displayFormatter);
    }
}