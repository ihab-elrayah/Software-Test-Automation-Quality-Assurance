import org.junit.Test;
import static org.junit.Assert.*;

public class ContactTest {

    // Test to check if a contact is correctly created with valid inputs
    @Test
    public void testContactCreationValid() {
        // Create a contact with null ID (assuming that the system will assign "ID1234567")
        Contact contact = new Contact(null, "Ihab", "Elrayah", "0123456789", "123 snhu St");

        // Assert that the contact is not null and all fields are correctly set
        assertNotNull(contact);
        assertEquals("ID1234567", contact.getContactID());
        assertEquals("Ihab", contact.getFirstName());
        assertEquals("Elrayah", contact.getLastName());
        assertEquals("0123456789", contact.getPhone());
        assertEquals("123 snhu St", contact.getAddress());
    }

    // Test to check if passing a null contact ID throws an exception
    @Test(expected = IllegalArgumentException.class)
    public void testContactIDNull() {
        new Contact(null, "Ihab", "Elrayah", "0123456789", "123 snhu St");
    }

    // Test to check if passing a too long contact ID throws an exception
    @Test(expected = IllegalArgumentException.class)
    public void testContactIDTooLong() {
        new Contact("ID12345678", "Ihab", "Elrayah", "0123456789", "123 snhu St");
    }

    // Test to check if passing a null first name throws an exception
    @Test(expected = IllegalArgumentException.class)
    public void testFirstNameNull() {
        new Contact("ID1234567", null, "Elrayah", "0123456789", "123 snhu St");
    }

    // Test to check if passing a too long first name throws an exception
    @Test(expected = IllegalArgumentException.class)
    public void testFirstNameTooLong() {
        new Contact("ID1234567", "IhabElr", "Elrayah", "0123456789", "123 snhu St");
    }

    // Test to check if passing a null last name throws an exception
    @Test(expected = IllegalArgumentException.class)
    public void testLastNameNull() {
        new Contact("ID1234567", "Ihab", null, "0123456789", "123 snhu St");
    }

    // Test to check if passing a too long last name throws an exception
    @Test(expected = IllegalArgumentException.class)
    public void testLastNameTooLong() {
        new Contact("ID1234567", "Ihab", "IhabElrayah", "0123456789", "123 snhu St");
    }

    // Test to check if passing a null phone number throws an exception
    @Test(expected = IllegalArgumentException.class)
    public void testPhoneNull() {
        new Contact("ID1234567", "Ihab", "Elrayah", null, "123 snhu St");
    }

    // Test to check if passing a phone number that's not exactly 10 digits throws an exception
    @Test(expected = IllegalArgumentException.class)
    public void testPhoneNot10Digits() {
        new Contact("ID1234567", "Ihab", "Elrayah", "12345678910", "123 snhu St");
    }

    // Test to check if passing a phone number that contains non-digit characters throws an exception
    @Test(expected = IllegalArgumentException.class)
    public void testPhoneNotAllDigits() {
        new Contact("ID1234567", "Ihab", "Elrayah", "12345A6789", "123 snhu St");
    }

    // Test to check if passing a null address throws an exception
    @Test(expected = IllegalArgumentException.class)
    public void testAddressNull() {
        new Contact("ID1234567", "Ihab", "Elrayah", "0123456789", null);
    }

    // Test to check if passing a too long address throws an exception
    @Test(expected = IllegalArgumentException.class)
    public void testAddressTooLong() {
        new Contact("ID1234567", "Ihab", "Elrayah", "0123456789", "123 Southern New Hampshire Street");
    }

}
