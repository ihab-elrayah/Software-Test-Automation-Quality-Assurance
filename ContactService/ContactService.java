import java.util.HashMap;
import java.util.Map;

public class ContactService {
    // A map to hold contacts, the key is the contact ID and the value is the Contact object
    private final Map<String, Contact> contacts = new HashMap<>();

    /*
     * Adds a new contact to the contacts map.
     * Throws an exception if the contact with the same ID already exists.
     */
    public void addContact(Contact contact) {
        if(contacts.containsKey(contact.getContactID())) {
            throw new IllegalArgumentException("Contact ID already exists");
        }
        contacts.put(contact.getContactID(), contact);
    }

    /*
     * Deletes a contact from the contacts map using its ID.
     * Throws an exception if the contact with the given ID doesn't exist.
     *contactID The ID of the contact to be deleted
     */
    public void deleteContact(String contactID) {
        if(!contacts.containsKey(contactID)) {
            throw new IllegalArgumentException("Contact not found");
        }
        contacts.remove(contactID);
    }

    /*
     * Retrieves a contact from the contacts map using its ID.
     * ccontactID The ID of the contact to be retrieved
     * The contact object, or null if not found
     */
    public Contact getContact(String contactID) {
        return contacts.get(contactID);
    }

    /*
     * Updates the first name of an existing contact.
     * Throws an exception if the contact with the given ID doesn't exist.
     * contactID The ID of the contact to be updated
     * newFirstName The new first name
     */
    public void updateFirstName(String contactID, String newFirstName) {
        Contact contact = getContact(contactID);
        if(contact == null) {
            throw new IllegalArgumentException("Contact not found");
        }
        contact.setFirstName(newFirstName);
    }

    /*
     * Updates the last name of an existing contact.
     * Throws an exception if the contact with the given ID doesn't exist.
     * contactID The ID of the contact to be updated
     * New newLastName The new last name
     */
    public void updateLastName(String contactID, String newLastName) {
        Contact contact = getContact(contactID);
        if(contact == null) {
            throw new IllegalArgumentException("Contact not found");
        }
        contact.setLastName(newLastName);
    }

    /*
     * Updates the phone number of an existing contact.
     * Throws an exception if the contact with the given ID doesn't exist.
     * contactID The ID of the contact to be updated
     * newPhone The new phone number
     */
    public void updatePhone(String contactID, String newPhone) {
        Contact contact = getContact(contactID);
        if(contact == null) {
            throw new IllegalArgumentException("Contact not found");
        }
        contact.setPhone(newPhone);
    }

    /*
     * Updates the address of an existing contact.
     * Throws an exception if the contact with the given ID doesn't exist.
     * contactID The ID of the contact to be updated
     * newAddress The new address
     */
    public void updateAddress(String contactID, String newAddress) {
        Contact contact = getContact(contactID);
        if(contact == null) {
            throw new IllegalArgumentException("Contact not found");
        }
        contact.setAddress(newAddress);
    }
}
