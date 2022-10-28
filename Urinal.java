import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Scanner;

public class Urinal {

    public static void main(String[] args) {
        Urinal urinal = new Urinal();
        try {
            ArrayList<String> free = new ArrayList<>();
            System.out.println("Reading contents from file");
            ArrayList<String> contents = urinal.readFile("urinal.dat");
            if (! contents.isEmpty()) {
                for (String content : contents) {
                    int res = urinal.freeUrinals(content);
                    free.add(String.valueOf(res));
                    System.out.println("\nInput: " + content);
                    System.out.println("Output: " + res);

                }
                System.out.println("Writing number of free urinals to the file");
                String fileName = urinal.writeFile(free);

                System.out.println("Contents successfully written to file: " + fileName);
            }
            else
            {
                System.out.println("File is empty");
            }
        } catch (FileNotFoundException e) {
            throw new RuntimeException(e);
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }

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

    public String writeFile(ArrayList<String> list) throws IOException {
        File f = null;
        if (new File("rule.txt").exists()) {
            boolean flag = true;

            int i = 1;
            while (flag) {
                f = new File("rule" + i + ".txt");
                if (f.exists()) {
                    i++;
                }
                // Print message if it exists
                else
                    flag = false;
            }
        }

        else
            f = new File("rule.txt");

        FileWriter writer = new FileWriter(f);
        for(String str: list) {
            writer.write(str + System.lineSeparator());
        }
        writer.close();
        return f.getName();
    }
}
