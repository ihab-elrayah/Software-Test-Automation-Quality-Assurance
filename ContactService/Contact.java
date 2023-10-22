public class Contact {
    // Instance variables representing attributes of a Contact
    private final String contactID; // Unique ID for each contact
    private String firstName;
    private String lastName;
    private String phone;
    private String address;

    /*
     * Constructor for the Contact class.
     *contaactID The unique identifier for the contact.
     * firstName The first name of the contact.
     * lastName The last name of the contact.
     * phone The phone number of the contact.
     * address The address of the contact.
     */
    public Contact(String contactID, String firstName, String lastName, String phone, String address) {
        // Validating the contactID length and null
        if(contactID == null || contactID.length() > 10) {
            throw new IllegalArgumentException("Invalid contact ID");
        }

        // Validating the firstName for length and null
        if(firstName == null || firstName.length() > 10) {
            throw new IllegalArgumentException("Invalid first name");
        }

        // Validating the lastName for length and null
        if(lastName == null || lastName.length() > 10) {
            throw new IllegalArgumentException("Invalid last name");
        }

        // Validating the phone number for length, null and format
        if(phone == null || phone.length() != 10) {
            throw new IllegalArgumentException("Invalid phone number");
        }
        if(!phone.matches("\\d{10}")) {
            throw new IllegalArgumentException("Phone number must contain only digits");
        }    

        // Validating the address for length and null
        if(address == null || address.length() > 30) {
            throw new IllegalArgumentException("Invalid address");
        }

        // Initializing the attributes
        this.contactID = contactID;
        this.firstName = firstName;
        this.lastName = lastName;
        this.phone = phone;
        this.address = address;
    }

    // Getter for contactID
    public String getContactID() {
        return contactID;
    }

    // Getter for firstName
    public String getFirstName() {
        return firstName;
    }

    /*
     * Setter for firstName.
     * firstName The new first name to be set.
     */
    public void setFirstName(String firstName) {
        // Validating the firstName before setting
        if(firstName == null || firstName.length() > 10) {
            throw new IllegalArgumentException("Invalid first name");
        }
        this.firstName = firstName;
    }

    // Getter for lastName
    public String getLastName() {
        return lastName;
    }

    /*
     * Setter for lastName.
     * lastName The new last name to be set.
     */
    public void setLastName(String lastName) {
        // Validating the lastName before setting
        if(lastName == null || lastName.length() > 10) {
            throw new IllegalArgumentException("Invalid last name");
        }
        this.lastName = lastName;
    }

    // Getter for phone
    public String getPhone() {
        return phone;
    }

    /*
     * Setter for phone.
     *phone The new phone number to be set.
     */
    public void setPhone(String phone) {
        // Validating the phone number before setting
        if(phone == null || phone.length() != 10) {
            throw new IllegalArgumentException("Invalid phone number");
        }
        this.phone = phone;
    }

    // Getter for address
    public String getAddress() {
        return address;
    }

    /*
     * Setter for address.
     * address The new address to be set.
     */
    public void setAddress(String address) {
        // Validating the address before setting
        if(address == null || address.length() > 30) {
            throw new IllegalArgumentException("Invalid address");
        }
        this.address = address;
    }
}
