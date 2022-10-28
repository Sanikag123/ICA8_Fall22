import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.ArrayList;

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

    @Test
    public void freeUrinals_case1001() {
        System.out.println("============ Sanika Yatin Gandhe =========== Test Six executed");
        String input = "1001";
        int count  = uri.freeUrinals(input);

        int expected = 0;
        assertEquals(expected,count);
    }

    @Test
    public void freeUrinals_case00000() {
        System.out.println("============ Sanika Yatin Gandhe =========== Test Seven executed");
        String input = "00000";
        int count  = uri.freeUrinals(input);

        int expected = 3;
        assertEquals(expected,count);
    }

    @Test
    public void freeUrinals_case0000() {
        System.out.println("============ Sanika Yatin Gandhe =========== Test Eight executed");
        String input = "0000";
        int count  = uri.freeUrinals(input);

        int expected = 2;
        assertEquals(expected,count);
    }

    @Test
    public void freeUrinals_case01000() {
        System.out.println("============ Sanika Yatin Gandhe =========== Test Nine executed");
        String input = "01000";
        int count  = uri.freeUrinals(input);

        int expected = 1;
        assertEquals(expected,count);
    }

    @Test
    public void freeUrinals_case011() {
        System.out.println("============ Sanika Yatin Gandhe =========== Test Ten executed");
        String input = "011";
        int count  = uri.freeUrinals(input);

        int expected = -1;
        assertEquals(expected,count);
    }

    @Test
    public void fileNotFoundException()  {
        System.out.println("============ Sanika Yatin Gandhe =========== Test Eleven executed");
        String file = "noUrinal.dat";
        assertThrows(FileNotFoundException.class, () -> uri.readFile(file));
    }

    @Test
    public void fileRead() throws FileNotFoundException {
        System.out.println("============ Sanika Yatin Gandhe =========== Test Twelve executed");
        String file = "urinal.dat";
        ArrayList<String> contents = uri.readFile(file);
        assertNotNull(contents);
    }

    @Test
    public void fileWrite() throws IOException {
        System.out.println("============ Sanika Yatin Gandhe =========== Test Thirteen executed");
        ArrayList arr = new ArrayList();
        arr.add("1");
        arr.add("2");
        arr.add("3");
        String name = uri.writeFile(arr);
        ArrayList<String> contents = uri.readFile(name);
        assertEquals(contents,arr);

    }




}