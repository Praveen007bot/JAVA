import java.io.*;

public class FileIOTest {
    public static void main(String[] args) {
        String fileName = "test.txt";
        String textToWrite = "Computer Science and Engineering";

        // Write to file using FileWriter
        try (FileWriter writer = new FileWriter(fileName)) {
            writer.write(textToWrite);
            System.out.println("Text was written to file: " + fileName);
        } catch (IOException e) {
            System.out.println("An error occurred while writing to file: " + e.getMessage());
        }

        // Read from file using FileReader
        try (FileReader reader = new FileReader(fileName)) {
            int c;
            while ((c = reader.read()) != -1) {
                System.out.print((char) c);
            }
            System.out.println();
            System.out.println("Text was read from file: " + fileName);
        } catch (IOException e) {
            System.out.println("An error occurred while reading from file: " + e.getMessage());
        }
    }
}