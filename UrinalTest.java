import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class UrinalTest {
    Urinal uri = new Urinal();
    @org.junit.jupiter.api.BeforeEach
    void setUp() {

    }

    @org.junit.jupiter.api.AfterEach
    void tearDown() {
    }



    @Test
    public void inValidStringInputs() {
        System.out.println("====================== Sanika Yatin Gandhe === Test ONE executed===============================");
         boolean actual = false;
        boolean expected = uri.isStringValid();
        assertEquals(actual,expected);

    }
}