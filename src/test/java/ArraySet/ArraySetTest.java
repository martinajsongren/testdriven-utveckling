package ArraySet;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class ArraySetTest {

    private ArraySet arraySet;

    @BeforeEach
    void setup(){
        arraySet = new ArraySet();
    }

    @Test
    void add() {
        assertTrue(arraySet.add(5));
        assertFalse(arraySet.add(5));
    }

    @Test
    void remove() {
        arraySet.add(5);
        assertFalse(arraySet.remove(6));
        assertTrue(arraySet.remove(5));
    }

    @Test
    void contains() {
        arraySet.add("Gitta Committa");
        assertFalse(arraySet.contains("git commit"));
        assertTrue(arraySet.contains("Gitta Committa"));
    }

    @Test
    void get() {
    }

    @Test
    void isEmpty() {
    }

    @Test
    void size() {
    }
}