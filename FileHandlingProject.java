package practicePRojectPhase;
import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

public class FileHandlingProject {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
        String fileName = "example.txt";

        // Writing to a file
        writeToFile(fileName, "Hello, this is a sample text.");

        // Reading from a file
        String content = readFromFile(fileName);
        System.out.println("Content read from the file: " + content);

        // Appending to a file
        appendToFile(fileName, "\nAppending additional text.");

        // Reading again to see the changes
        content = readFromFile(fileName);
        System.out.println("Content after appending: " + content);
    }
    // Method to write content to a file
    private static void writeToFile(String fileName, String content) {
        try (BufferedWriter writer = new BufferedWriter(new FileWriter(fileName))) {
            writer.write(content);
            System.out.println("Content written to the file successfully.");
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
 // Method to read content from a file
    private static String readFromFile(String fileName) {
        StringBuilder content = new StringBuilder();
        try (BufferedReader reader = new BufferedReader(new FileReader(fileName))) {
            String line;
            while ((line = reader.readLine()) != null) {
                content.append(line).append("\n");
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
        return content.toString();
    }
    // Method to append content to a file
    private static void appendToFile(String fileName, String content) {
        try (BufferedWriter writer = new BufferedWriter(new FileWriter(fileName, true))) {
            writer.write(content);
            System.out.println("Content appended to the file successfully.");
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

	}


