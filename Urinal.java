import java.io.File;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.Scanner;

public class Urinal {


    public boolean isStringValid(String str) {
        if(str.contains("11")) {
            return false;
        }

        return true;
    }

    int freeUrinals( String input ){

        if (!isStringValid(input)) {
            return -1;
        }
        int len = input.length();
        int count = 0;

        if (len == 1) {
            if (input.charAt(0) == 1) {
                return count;
            }
            else
                return ++count;
        }

        else if (len == 2) {
            if (input.contains("1")){
                return count;
            }
            else
                return ++count;
        }

        else {
            for (int i = 1; i < len - 1; i++) {
                if (input.charAt(i - 1) == '0' && input.charAt(i) == '0' && input.charAt(i + 1) == '0') {
                    count++;
                    StringBuilder replacedInput = new StringBuilder(input);
                    replacedInput.setCharAt(i - 1, '1');
                    input = String.valueOf(replacedInput);

                }
            }
            return count;
        }
    }

    public ArrayList<String> readFile(String fileName) throws FileNotFoundException {
        File file = new File(fileName);
        ArrayList<String> fileContents = new ArrayList<String>();
        try {
            Scanner sc = new Scanner(file);
            while (sc.hasNextLine()) {
                fileContents.add(sc.nextLine());
            }
            return fileContents;
        } catch (FileNotFoundException ex) {
            throw ex;
        }

    }
}
