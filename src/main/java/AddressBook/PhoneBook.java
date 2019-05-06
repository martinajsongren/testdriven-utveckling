package AddressBook;

import ArraySet.ArraySet;

import java.util.UUID;

public class PhoneBook {
    ArraySet<Person> addressBook;

    public PhoneBook(ArraySet<Person> addressBook) {
        super();
        this.addressBook = addressBook;
    }
    /**
     * Add a person as a contact in the phone book;
     * @param contact The person object to be added.
     * @return True if person was added false otherwise.
     */
    public boolean addContact(Person contact) {
        return addressBook.add(contact);
    }
    /**
     * Search the phone book and return an array with persons matching the name.
     * @param name The name that is searched for
     * @return Person[] an array with matching persons
     */
    public Person[] findPersonByName() {
        return null;
    }
    /**
     * Returns the specific contact from the phone book.
     * @param id
     * @return
     */
    public Person getContact(UUID id) {
        return null;
    }
    /**
     *
     * @param Contact : The contact with address
     * @return Person array with all persons living on the address.
     */
    public Person[] findContacsOnSameAddress (Person Contact) {
        return null;
    }


}
