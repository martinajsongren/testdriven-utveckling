package AddressBook;

import ArraySet.ArraySet;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.mockito.Spy;
import org.mockito.junit.jupiter.MockitoExtension;

import java.util.Date;

import static org.junit.jupiter.api.Assertions.*;
import static org.mockito.Mockito.when;

@ExtendWith(MockitoExtension.class)
class PhoneBookTest {
    PhoneBook phoneBook;
    @Spy
    ArraySet<Person> arraySet;

    Person person;

    @BeforeEach
    void setupPhoneBook() {
        phoneBook = new PhoneBook(arraySet);
        person = new Person("Svampbob Fyrkant", "Snäckgatan 124","svampbob.fyrkant@krangliga-krabban.net", "0734445566", 25, new Date());
    }
    @Test
    void addContact() {
        when(arraySet.add(person)).thenReturn(true);
        assertTrue(phoneBook.addContact(person));

        when(arraySet.add(person)).thenReturn(false);
        assertFalse(phoneBook.addContact(person));
    }

    @Test
    void findPersonByName() {
        arraySet.add(person);
        assertEquals(phoneBook.findPersonByName(person.getName()).get(0), person);
    }

    @Test
    void getContact() {
    }

    @Test
    void findContacsOnSameAddress() {
    }
}