import java.util.HashMap;
import java.util.Map;

public class AppointmentService {

    // Map to store appointments using their IDs as keys
    private Map<String, Appointment> appointmentMap = new HashMap<>();

    // Add a new appointment to the map
    public void addAppointment(Appointment appointment) {
        // Check if an appointment with the same ID already exists
        if (appointmentMap.containsKey(appointment.getAppointmentId())) {
            throw new IllegalArgumentException("Appointment ID already exists.");
        }
        // Add the appointment to the map
        appointmentMap.put(appointment.getAppointmentId(), appointment);
    }

    // Delete an appointment by its ID
    public void deleteAppointment(String appointmentId) {
        // Check if the appointment ID exists in the map
        if (!appointmentMap.containsKey(appointmentId)) {
            throw new IllegalArgumentException("Appointment ID not found.");
        }
        // Remove the appointment from the map
        appointmentMap.remove(appointmentId);
    }

    // Retrieve an appointment by its ID
    public Appointment getAppointment(String appointmentId) {
        return appointmentMap.get(appointmentId);
    }
}
