Task Management System

This repository contains a simple task management system implemented in Java. 


Task.java:
- Represents the main data structure for tasks in the system.
- Enforces constraints on the task's ID, name, and description, ensuring that they are non-null and within specified character limits.
- Provides methods to get and set task details while maintaining the constraints.


TaskService.java:
- Offers core functionalities to manage tasks such as adding, deleting, updating, and retrieving tasks.
- Uses an in-memory HashMap for storing tasks, providing constant-time lookups by task ID.
- Ensures that task IDs remain unique and prevents modifications on non-existing tasks.


TaskTest.java:
- JUnit test class for Task.java.
- Validates the proper instantiation of the Task object.
- Checks for exceptionss when creating tasks with invalid data.


TaskServiceTest.java:
- JUnit test class for TaskService.java.
- Verifies that the task service can correctly add, delete, update, and retrieve tasks.
- Tests for expected exceptions in scenarios like adding duplicate task IDs and updating non-existing tasks.
