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
        arraySet.add("Gul");
        arraySet.add("Blå");
        arraySet.add("Lila");
        assertEquals(arraySet.get(2), "Lila");
        assertEquals(arraySet.get(0), "Gul");
    }

    @Test
    void isEmpty() {
        assertTrue(arraySet.isEmpty());
        arraySet.add("Terminator");
        assertFalse(arraySet.isEmpty());
        arraySet.remove("Terminator");
        assertTrue(arraySet.isEmpty());
    }

    @Test
    void size() {
    }
}