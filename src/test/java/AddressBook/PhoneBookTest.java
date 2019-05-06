package AddressBook;

import ArraySet.ArraySet;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.mockito.Spy;
import org.mockito.junit.jupiter.MockitoExtension;

import java.util.Date;

import static org.junit.jupiter.api.Assertions.*;

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
    }

    @Test
    void findPersonByName() {
    }

    @Test
    void getContact() {
    }

    @Test
    void findContacsOnSameAddress() {
    }
}