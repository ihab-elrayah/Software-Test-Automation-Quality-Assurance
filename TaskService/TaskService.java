import java.util.*;

/**
 * Represents a service to manage tasks.
 */
public class TaskService {

    // A map to store tasks with their Task ID as the key for quick retrieval.
    private Map<String, Task> taskMap = new HashMap<>();

    /**
     * Adds a new task to the service.
     *  IllegalArgumentException if a task with the same ID already exists.
     */
    public void addTask(Task task) {
        if (taskMap.containsKey(task.getTaskId())) {
            throw new IllegalArgumentException("Task ID already exists.");
        }
        taskMap.put(task.getTaskId(), task);
    }

    /**
     * Deletes a task from the service using its Task ID
     * IllegalArgumentException if the task ID is not found.
     */
    public void deleteTask(String taskId) {
        if (!taskMap.containsKey(taskId)) {
            throw new IllegalArgumentException("Task ID not found.");
        }
        taskMap.remove(taskId);
    }

    /*
     * Updates the name of a task using its Task ID.
     * newName the new name for the task.
     * IllegalArgumentException if the task ID is not found.
     */
    public void updateTaskName(String taskId, String newName) {
        if (!taskMap.containsKey(taskId)) {
            throw new IllegalArgumentException("Task ID not found.");
        }
        taskMap.get(taskId).setName(newName);
    }

    /*
     * Updates the description of a task using its Task ID.
     *taskId the ID of the task to be updated.
     * newDescription the new description for the task.
     * IllegalArgumentException if the task ID is not found.
     */
    public void updateTaskDescription(String taskId, String newDescription) {
        if (!taskMap.containsKey(taskId)) {
            throw new IllegalArgumentException("Task ID not found.");
        }
        taskMap.get(taskId).setDescription(newDescription);
    }

    /*
     * Retrieves a task from the service using its Task ID.
     $ taskId the ID of the task to be retrieved.
     * the task with the specified ID, or null if not
     */

     public Task getTask(String taskId) {
        return taskMap.get(taskId);
    }

    /*
     * Checks if the service contains a task with the given Task ID.
     true if a task with the given ID exists, false otherwise.
     */
    public boolean containsTask(String taskId) {
        return taskMap.containsKey(taskId);
    }

    /*
     * Retrieves all tasks currently in the service.
     * a collection of all tasks.
     */
    public Collection<Task> getAllTasks() {
        return taskMap.values();
    }
}