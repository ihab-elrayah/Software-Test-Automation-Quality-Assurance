Contact Management System

This repository contains a simple task of each component in the Contact Management System


Contact.java:
- Data Model: Represents an individual contact with attributes like ID, first name, last name, phone number, and address.
- Validation: Ensures that the provided data, like the contact ID and phone number, adheres to specified formats and constraints.
- Encapsulation: Provides getter and setter methods for each attribute, ensuring that external classes interact with Contact objects in a controlled manner.


ContactService.java:
- Storage: Maintains a collection of contacts using a map, where the contact ID acts as the key.
- CRUD Operations: Allows for the addition, retrieval, update, and deletion of contacts.
- Data Integrity: Throws exceptions in cases of data inconsistencies, like adding a contact with a duplicate ID or trying to modify a non-existent contact.


ContactTest.java:
- Unit Testing for Contact: Validates the correct functionality of the Contact class.
- Error Scenarios: Contains tests for potential error scenarios, such as invalid inputs and format violations.
- Data Verification: Ensures that contacts are created with the expected values and that errors are raised when necessary.

ContactServiceTest.java:
- Unit Testing for ContactService: Verifies the correct functionality of the ContactService class.
- CRUD Tests: Contains tests for each CRUD operation, checking both success scenarios and potential error conditions.
- Consistency Checks: Tests edge cases to ensure that the contact storage maintains data integrity at all times.