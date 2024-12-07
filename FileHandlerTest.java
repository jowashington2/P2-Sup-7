import org.junit.jupiter.api.Test;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import static org.junit.jupiter.api.Assertions.*;

public class FileHandlerTest {

    @Test
    public void testWriteToFile() throws IOException {
        String filename = "testFile.txt";
        String content = "This is a test.";

        FileHandler.writeToFile(filename, content);

        String result = Files.readString(Path.of(filename));
        assertEquals(content, result);

        // Clean up test file
        Files.delete(Path.of(filename));
    }
}
