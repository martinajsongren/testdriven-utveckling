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
    }

    @Test
    void contains() {
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