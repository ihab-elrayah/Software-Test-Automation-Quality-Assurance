import org.junit.Before;
import org.junit.Test;
import static org.junit.Assert.*;

public class ContactServiceTest {

    // The service instance that will be tested
    private ContactService contactService;

    // Initialization before each test method
    @Before
    public void setUp() {
        // Create a new instance for every test to avoid interference between tests
        contactService = new ContactService();
    }

    // Test to check if a contact can be added correctly
    @Test
    public void testAddContact() {
        // Create a new contact
        Contact contact1 = new Contact("ID1234567", "Ihab", "Elrayah", "0123456789", "123 snhu St");
        // Add the contact to the service
        contactService.addContact(contact1);
        // Assert that the added contact can be retrieved
        assertEquals(contact1, contactService.getContact("ID1234567"));
    }

    // Test to check if adding a duplicate contact throws an exception
    @Test(expected = IllegalArgumentException.class)
    public void testAddDuplicateContact() {
        // Create two contacts with the same ID
        Contact contact1 = new Contact("ID1234567", "Ihab", "Elrayah", "0123456789", "123 snhu St");
        Contact contact2 = new Contact("ID1234567", "James", "Harden", "0987654321", "321 unh St");
        // Add the first contact
        contactService.addContact(contact1);
        // Adding the second should throw an exception because of the duplicate ID
        contactService.addContact(contact2);  
    }

    // Test to check if a contact can be deleted correctly
    @Test
    public void testDeleteContact() {
        // Create and add a contact
        Contact contact1 = new Contact("ID1234567", "Ihab", "Elrayah", "0123456789", "123 snhu St");
        contactService.addContact(contact1);
        // Delete the added contact
        contactService.deleteContact("ID1234567");
        // Assert that the contact is no longer available
        assertNull(contactService.getContact("ID1234567"));
    }

    // Test to check if deleting a non-existent contact throws an exception
    @Test(expected = IllegalArgumentException.class)
    public void testDeleteNonexistentContact() {
        contactService.deleteContact("ID1234567");
    }

    // Test to check if the first name of a contact can be updated correctly
    @Test
    public void testUpdateFirstName() {
        // Create, add and then update a contact's first name
        Contact contact1 = new Contact("ID1234567", "Ihab", "Elrayah", "0123456789", "123 snhu St");
        contactService.addContact(contact1);
        contactService.updateFirstName("ID1234567", "James");
        // Assert that the first name was updated
        assertEquals("James", contactService.getContact("ID1234567").getFirstName());
    }

    // Test to check if the last name of a contact can be updated correctly
    @Test
    public void testUpdateLastName() {
        // Create, add and then update a contact's last name
        Contact contact1 = new Contact("ID1234567", "Ihab", "Elrayah", "0123456789", "123 snhu St");
        contactService.addContact(contact1);
        contactService.updateLastName("ID1234567", "Harden");
        // Assert that the last name was updated
        assertEquals("Harden", contactService.getContact("ID1234567").getLastName());
    }

    // Test to check if the phone of a contact can be updated correctly
    @Test
    public void testUpdatePhone() {
        // Create, add and then update a contact's phone
        Contact contact1 = new Contact("ID1234567", "Ihab", "Elrayah", "0123456789", "123 snhu St");
        contactService.addContact(contact1);
        contactService.updatePhone("ID1234567", "0987654321");
        // Assert that the phone was updated
        assertEquals("0987654321", contactService.getContact("ID1234567").getPhone());
    }

    // Test to check if the address of a contact can be updated correctly
    @Test
    public void testUpdateAddress() {
        // Create, add and then update a contact's address
        Contact contact1 = new Contact("ID1234567", "Ihab", "Elrayah", "0123456789", "123 snhu St");
        contactService.addContact(contact1);
        contactService.updateAddress("ID1234567", "321 unh St");
        // Assert that the address was updated
        assertEquals("321 unh St", contactService.getContact("ID1234567").getAddress());
    }

    // Test
