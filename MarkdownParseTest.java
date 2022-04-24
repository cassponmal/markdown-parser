//imports junit Assert methods
import static org.junit.Assert.*;
import org.junit.*;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.util.ArrayList;
import java.util.List;

public class MarkdownParseTest  {
    
    @Test
    public void addition() {
        assertEquals(2, 1 + 1);
    }

    @Test
    public void MarkdownParseTest() throws IOException {
        Path fileName = Path.of("test-file.md");
        String content = Files.readString(fileName);  

        assertEquals(MarkdownParse.getLinks(content), List.of("https://something.com", "some-thing.html"));
    }

    @Test
    public void MarkdownParseTest2() throws IOException {
        Path fileName = Path.of("test.md");
        String content = Files.readString(fileName);  

        assertEquals(MarkdownParse.getLinks(content), List.of("https://hello.com"));
    }

    @Test
    public void MarkdownParseTest3() throws IOException {
        Path fileName = Path.of("test2.md");
        String content = Files.readString(fileName);  

        assertEquals(MarkdownParse.getLinks(content), List.of("youtube.com", "spotify.com"));
    }

    @Test
    public void MarkdownParseTest4() throws IOException {
        Path fileName = Path.of("test3.md");
        String content = Files.readString(fileName);  

        assertEquals(MarkdownParse.getLinks(content), List.of("google.com", "apple.com"));
    }

}
