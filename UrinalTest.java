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
    public void inValidStringInputs_1011() {
        System.out.println("============ Sanika Yatin Gandhe =========== Test ONE executed");
        String input = "1011";
        boolean actual = false;
        boolean expected = uri.isStringValid(input);
        assertEquals(actual,expected);
    }

    @Test
    public void validStringInputs_101() {
        System.out.println("============ Sanika Yatin Gandhe =========== Test TWO executed");
        String input = "101";
        boolean expected = uri.isStringValid(input);
        assertTrue(expected);
    }

    @Test
    public void validStringInputs_001() {
        System.out.println("============ Sanika Yatin Gandhe =========== Test Three executed");
        String input = "001";
        boolean expected = uri.isStringValid(input);
        assertTrue(expected);
    }
}