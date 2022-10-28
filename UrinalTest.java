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

    @Test
    public void inValidStringInputs_1111() {
        System.out.println("============ Sanika Yatin Gandhe =========== Test Four executed");
        String input = "1111";
        boolean expected = uri.isStringValid(input);
        assertFalse(expected);
    }

    @Test
    public void freeUrinals_case10001() {
        System.out.println("============ Sanika Yatin Gandhe =========== Test Five executed");
        String input = "10001";
        int count  = uri.freeUrinals(input);

        int expected = 1;
        assertEquals(expected,count);
    }
}