Appointment Management System

This repository contains the components of a simple in-memory appointment management system.

Appointment.java:
- Represents individual appointments with attributes like appointmentId, appointmentDate, and description.
- Contains validation to ensure the appointment ID is unique and within the length limit, the appointment date is not in the past, and the description adheres to the length constraint.


AppointmentService.java:
- Provides functionalities to add, delete, and retrieve appointments using a Map for constant-time lookups.
- Throws exceptions for scenarios like duplicate appointment IDs and trying to delete non-existent appointments.


AppointmentTest.java:
- Unit tests to validate the behavior of the Appointment class.
- Ensures that creating appointments with invalid attributes (like null ID, past date, or too long description) throws exceptions.


AppointmentServiceTest.java:
- Unit tests to validate the functionalities provided by the AppointmentService class.
- Tests scenarios such as adding valid appointments, handling duplicates, and deleting appointments.