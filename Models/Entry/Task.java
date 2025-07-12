package Models.Entry;       // We use this package to organize our code

/**
 * This class represents a task entry in the calendar.
 * A task has a title, priority, status, and the account that created it.
 * It extends the EntryModel class to inherit a common entry.
 * 
 */
public class Task extends EntryModel{
    private String priority;                // The priority of the task (high, medium, low)
    private String status;                  // The status of the task (done or pending)
    private String createdBy;               // The account that created the task
    private String finishedBy;              // The account that finished the task (if applicable)

    /**
     * This constructor constructs a new Task with the specified title, priority, status, and creator.
     * It initializes the title using the superclass constructor
     * 
     * @param title      the title of the task
     * @param priority   the priority of the task (high, medium, low)
     * @param status     the status of the task (done or pending)
     * @param createdBy  the account that created the task
     */
    public Task(String title, String priority, String status,String createdBy){
        super(title);
        this.priority = priority;
        this.status = status;
        this.createdBy = createdBy;
        this.finishedBy = "";
    }

    // Getters

    /**
     * This getter gets the priority of the task.
     * 
     * @return the priority of the task
     */
    public String getPriority() {
        return this.priority;
    }

    /**
     * This getter gets the status of the task.
     * 
     * @return the status of the task
     */
    public String getStatus() {
        return this.status;
    }

    /**
     * This getter gets the account that created the task.
     * 
     * @return the account that created the task
     */
    public String getFinishedBy(){
        return this.finishedBy;
    }

    // Setters

    /**
     * This setter sets the priority of the task.
     * 
     * @param priority the new priority of the task
     */
    public void setPriority(String priority) {
        this.priority = priority;
    }

    /**
     * This setter sets the status of the task.
     * 
     * @param status the new status of the task
     */
    public void setStatus(String status) {
        this.status = status;
    }

    /** 
     * This method marks the task as done and sets the account that finished it.
     * 
     * @param finishedBy the account that finished the task
     */
    public void finishTask (String finishedBy){
        this.status = "done";
        this.finishedBy = finishedBy;
    }

    /** 
     * This method checks if the status is valid.
     * 
     * @param status the status to check
     * 
     * @return true if the status is valid, false otherwise
     */
    public boolean isValidStatus(String status) {
        boolean isValid = false;
        switch (status) {
            case "done":
            case "pending":
                isValid = true;
                break;
        }
        return isValid;
}
}
