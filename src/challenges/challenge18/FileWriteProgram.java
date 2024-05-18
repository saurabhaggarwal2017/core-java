package challenges.challenge18;

import java.io.FileNotFoundException;
import java.io.FileWriter;
import java.io.IOException;

public class FileWriteProgram {
    public static void main(String[] args) {
        String fileName = "src/challenges/challenge18/saurabh.txt";
        try(FileWriter writer = new FileWriter(fileName)){
            writer.write("Hello saurabh, i hope you doing well.");
            writer.flush();
            System.out.println("You write the content successfully.");
        }catch (FileNotFoundException exception){
            System.out.println("your file not found!!");
        }
        catch (IOException exception){
            System.out.printf("you got an exception %s.",exception.getMessage());
        }
    }
}
