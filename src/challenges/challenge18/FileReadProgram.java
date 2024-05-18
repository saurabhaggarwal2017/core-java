package challenges.challenge18;

import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.Scanner;

public class FileReadProgram {
    public static void main(String[] args) {
        System.out.println("Enter you file name : ");
        Scanner scanner = new Scanner(System.in);
        String fileName = scanner.next();

        try (FileReader reader = new FileReader(fileName)) {
            int text = reader.read();
            while (text != -1) {
                System.out.print((char) text);
                text = reader.read();
            }

        } catch (FileNotFoundException exception) {
            System.out.println("your file not found!!");
        } catch (IOException exception) {
            System.out.printf("you got an exception %s.", exception.getMessage());
        }
    }
}
