import java.io.FileWriter;
import java.io.IOException;

public class FileHandler {

    public static void writeToFile(String filename, String content) throws IOException {
        try (FileWriter writer = new FileWriter(filename)) {
            writer.write(content);
        }
    }
    public static String readFromFile(String filename) throws IOException {
    return Files.readString(Path.of(filename));
}
    public static void appendToFile(String filename, String content) throws IOException {
    try (FileWriter writer = new FileWriter(filename, true)) {
        writer.write(content);
    }
}
    /**
 * Writes content to a file.
 * @param filename the name of the file to write to
 * @param content the content to write to the file
 * @throws IOException if an I/O error occurs
 */
public static void writeToFile(String filename, String content) throws IOException {
    // Implementation
}

/**
 * Reads content from a file.
 * @param filename the name of the file to read from
 * @return the content of the file as a string
 * @throws IOException if an I/O error occurs
 */
public static String readFromFile(String filename) throws IOException {
    // Implementation
}

/**
 * Appends content to a file.
 * @param filename the name of the file to append to
 * @param content the content to append to the file
 * @throws IOException if an I/O error occurs
 */
public static void appendToFile(String filename, String content) throws IOException {
    // Implementation
}
}
