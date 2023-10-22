import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

/**
 * Test suite for the TaskService class.
 */
public class TaskServiceTest {

    private TaskService taskService;

    @BeforeEach
    public void setUp() {
        taskService = new TaskService();
    }

    /**
     * Tests adding and retrieving a task.
     */
    @Test
    public void testAddAndGetTask() {
        Task task = new Task("1", "Test Task", "This is a test task.");
        taskService.addTask(task);
        assertEquals(task, taskService.getTask("1"));
    }

    /**
     * Tests the addition of a duplicate task.
     */
    @Test
    public void testAddDuplicateTask() {
        Task task = new Task("1", "Test Task", "This is a test task.");
        taskService.addTask(task);
        assertThrows(IllegalArgumentException.class, () -> {
            taskService.addTask(task);
        });
    }

    /**
     * Tests task deletion functionality.
     */
    @Test
    public void testDeleteTask() {
        Task task = new Task("1", "Test Task", "This is a test task.");
        taskService.addTask(task);
        taskService.deleteTask("1");
        assertNull(taskService.getTask("1"));
    }

    /**
     * Tests task name update functionality.
     */
    @Test
    public void testUpdateTaskName() {
        Task task = new Task("1", "Test Task", "This is a test task.");
        taskService.addTask(task);
        taskService.updateTaskName("1", "Updated Task");
        assertEquals("Updated Task", taskService.getTask("1").getName());
    }

    /**
     * Tests task description update functionality.
     */
    @Test
    public void testUpdateTaskDescription() {
        Task task = new Task("1", "Test Task", "This is a test task.");
        taskService.addTask(task);
        taskService.updateTaskDescription("1", "Updated Description");
        assertEquals("Updated Description", taskService.getTask("1").getDescription());
    }

    /**
     * Tests the updating of non-existent tasks.
     */
    @Test
    public void testUpdateNonExistentTask() {
        assertThrows(IllegalArgumentException.class, () -> {
            taskService.updateTaskName("99", "Invalid");
        });
        assertThrows(IllegalArgumentException.class, () -> {
            taskService.updateTaskDescription("99", "Invalid");
        });
    }
}
