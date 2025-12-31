package _21Exeptions;

import java.io.FileNotFoundException;
import java.io.FileReader;

public class compileTimeChecked {
    public static void main(String[] args) throws FileNotFoundException {
        try{
            FileReader pointer = new FileReader("a.txt");
        } catch (FileNotFoundException e) {
            System.out.println("hello");
            throw new FileNotFoundException("ERROR FOUND");
        }
        finally {
            //this block can also contain try block or any logic.
            System.out.println("Bye...");
        }
    }
}
