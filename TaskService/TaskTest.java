
import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

/**
 * Test suite for the Task class.
 */
public class TaskTest {

    /**
     * Tests valid task creation.
     */
    @Test
    public void testValidTaskCreation() {
        Task task = new Task("1", "Test Task", "This is a test task.");
        assertEquals("1", task.getTaskId());
        assertEquals("Test Task", task.getName());
        assertEquals("This is a test task.", task.getDescription());
    }

    /**
     * Tests invalid task ID creation.
     */
    @Test
    public void testInvalidTaskIdCreation() {
        assertThrows(IllegalArgumentException.class, () -> {
            new Task(null, "Valid Name", "Valid Description");
        });
    }

    /**
     * Tests invalid task name creation.
     */
    @Test
    public void testInvalidTaskNameCreation() {
        assertThrows(IllegalArgumentException.class, () -> {
            new Task("1", null, "Valid Description");
        });
        assertThrows(IllegalArgumentException.class, () -> {
            new Task("1", "This name is definitely way too long to be valid.", "Valid Description");
        });
    }

    /**
     * Tests invalid task description creation.
     */
    @Test
    public void testInvalidTaskDescriptionCreation() {
        assertThrows(IllegalArgumentException.class, () -> {
            new Task("1", "Valid Name", null);
        });
        assertThrows(IllegalArgumentException.class, () -> {
            new Task("1", "Valid Name", "This description is certainly way too long to be considered valid because it exceeds the maximum allowed length.");
        });
    }

    /**
     * Tests boundary conditions for task ID creation.
     */
    @Test
    public void testBoundaryTaskIdCreation() {
        Task task = new Task("1234567890", "Valid Name", "Valid Description"); // 10 characters for taskId
        assertEquals("1234567890", task.getTaskId());
    }

    /**
     * Tests boundary conditions for task name creation.
     */
    @Test
    public void testBoundaryTaskNameCreation() {
        String name = "12345678901234567890"; // 20 characters
        Task task = new Task("1", name, "Valid Description");
        assertEquals(name, task.getName());
    }

    /**
     * Tests boundary conditions for task description creation.
     */
    @Test
    public void testBoundaryTaskDescriptionCreation() {
        String description = "12345678901234567890123456789012345678901234567890"; // 50 characters
        Task task = new Task("1", "Valid Name", description);
        assertEquals(description, task.getDescription());
    }
}
