import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import java.util.Date;
import static org.junit.jupiter.api.Assertions.*;

public class AppointmentServiceTest {

    // Service instance to be used in tests
    private AppointmentService service;

    // A sample valid appointment to use in tests
    private Appointment validAppointment;

    // Set up initial data before each test
    @BeforeEach
    public void setUp() {
        service = new AppointmentService();
        validAppointment = new Appointment("ID123", new Date(System.currentTimeMillis() + 100000), "Test appointment");
    }

    // Test adding a valid appointment to the service
    @Test
    public void testAddValidAppointment() {
        service.addAppointment(validAppointment);
        assertNotNull(service.getAppointment("ID123"));
    }

    // Test adding a duplicate appointment (same ID)
    @Test
    public void testAddDuplicateAppointment() {
        service.addAppointment(validAppointment);
        assertThrows(IllegalArgumentException.class, () -> {
            service.addAppointment(validAppointment);
        });
    }

    // Test deleting a previously added appointment
    @Test
    public void testDeleteValidAppointment() {
        service.addAppointment(validAppointment);
        service.deleteAppointment("ID123");
        assertNull(service.getAppointment("ID123"));
    }

    // Test trying to delete an appointment that doesn't exist
    @Test
    public void testDeleteNonExistentAppointment() {
        assertThrows(IllegalArgumentException.class, () -> {
            service.deleteAppointment("IDXYZ");
        });
    }
}
