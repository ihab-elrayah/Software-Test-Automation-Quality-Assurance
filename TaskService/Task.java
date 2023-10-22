/**
 * Represents a task with unique ID, name, and description.
 */
public class Task {

    private final String taskId; // Unique ID that cannot be updated.
    private String name;
    private String description;

    /*
     * Constructor to create a Task instance.
     *taskId the unique ID of the task, cannot be null or longer than 10 characters.
     *  name the name of the task, cannot be null or longer than 20 characters.
     * description the description of the task, cannot be null or longer than 50 characters.
     * illegalArgumentException if any of the inputs do not conform to the above constraints.
     */
    public Task(String taskId, String name, String description) {
        if (taskId == null || taskId.length() > 10 || name == null || name.length() > 20 || description == null || description.length() > 50) {
            throw new IllegalArgumentException("Invalid input for task creation.");
        }
        this.taskId = taskId;
        this.name = name;
        this.description = description;
    }

    /*
     * the unique ID of the task.
     */
    public String getTaskId() {
        return taskId;
    }

    /*
     *  the name of the task.
     */
    public String getName() {
        return name;
    }

    /**
     * 
     * the description of the task.
     */
    public String getDescription() {
        return description;
    }

    /*
     * Sets the name of the task.
     * name the new name of the task, cannot be null or longer than 20 characters.
     */
    public void setName(String name) {
        if (name == null || name.length() > 20) {
            throw new IllegalArgumentException("Invalid name.");
        }
        this.name = name;
    }

    /*
     * Sets the description of the task.
     *  description the new description of the task, cannot be null or longer than 50 characters.
     * IllegalArgumentException if the input does not conform to the above constraints.
     */
    public void setDescription(String description) {
        if (description == null || description.length() > 50) {
            throw new IllegalArgumentException("Invalid description.");
        }
        this.description = description;
    }
}
