import java.util.Date;

public class Appointment {

    private final String appointmentId; 
    private Date appointmentDate;
    private String description;

    // Constructor to initialize an appointment with ID, date, and description
    public Appointment(String appointmentId, Date appointmentDate, String description) {
        // Check if the given appointment ID is valid
        if (appointmentId == null || appointmentId.length() > 10) {
            throw new IllegalArgumentException("Invalid appointment ID.");
        }
        
        // Ensure the appointment date is not null or in the past
        if (appointmentDate == null || appointmentDate.before(new Date())) {
            throw new IllegalArgumentException("Invalid appointment date.");
        }

        // Check if the given description is valid
        if (description == null || description.length() > 50) {
            throw new IllegalArgumentException("Invalid description.");
        }
        
        // Set the instance variables
        this.appointmentId = appointmentId;
        this.appointmentDate = appointmentDate;
        this.description = description;
    }

    // Getters for the appointment's properties
    public String getAppointmentId() {
        return appointmentId;
    }

    public Date getAppointmentDate() {
        return appointmentDate;
    }

    public String getDescription() {
        return description;
    }
}
