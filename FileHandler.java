import java.io.FileWriter;
import java.io.IOException;

public class FileHandler {

    public static void writeToFile(String filename, String content) throws IOException {
        try (FileWriter writer = new FileWriter(filename)) {
            writer.write(content);
        }
    }
}
