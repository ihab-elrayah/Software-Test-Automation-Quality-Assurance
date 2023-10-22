import org.junit.jupiter.api.Test;
import java.util.Date;
import static org.junit.jupiter.api.Assertions.*;

public class AppointmentTest {

    // Test to check if a valid appointment can be created
    @Test
    public void testValidAppointmentCreation() {
        Appointment appointment = new Appointment("ID123", new Date(System.currentTimeMillis() + 100000), "Test appointment");
        assertNotNull(appointment);
    }

    // Test to check if an exception is thrown for a null appointment ID
    @Test
    public void testInvalidAppointmentId() {
        assertThrows(IllegalArgumentException.class, () -> {
            new Appointment(null, new Date(), "Test appointment");
        });
    }

    // Test to check if an exception is thrown when the appointment date is in the past
    @Test
    public void testInvalidAppointmentDate() {
        assertThrows(IllegalArgumentException.class, () -> {
            new Appointment("ID123", new Date(System.currentTimeMillis() - 100000), "Test appointment");
        });
    }

    // Test to check if an exception is thrown for a null appointment description
    @Test
    public void testInvalidDescription() {
        assertThrows(IllegalArgumentException.class, () -> {
            new Appointment("ID123", new Date(), null);
        });
    }

    // Test to check if an appointment can be created with the current system time as the appointment date
    @Test
    public void testAppointmentWithCurrentTime() {
        // Using the current time for the appointment date
        Appointment appointment = new Appointment("ID124", new Date(), "Valid test appointment with current time");
        assertNotNull(appointment);
    }

    // Test to check if an exception is thrown when the description exceeds the maximum allowed length
    @Test
    public void testDescriptionExceedingMaxLength() {
        String longDescription = "This is a really long description that definitely exceeds fifty characters for sure.";
        assertThrows(IllegalArgumentException.class, () -> {
            new Appointment("ID125", new Date(System.currentTimeMillis() + 100000), longDescription);
        });
    }
}
