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
    public void MarkdownParseTest1() throws IOException {
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

        assertEquals(MarkdownParse.getLinks(content), List.of("spotify.com"));
    }

    @Test
    public void MarkdownParseTest4() throws IOException {
        Path fileName = Path.of("test3.md");
        String content = Files.readString(fileName);
        ArrayList<String> empty = new ArrayList<>();


        assertEquals(MarkdownParse.getLinks(content), empty);
    }


    @Test
    public void MarkdownParseTest5() throws IOException {
        Path fileName = Path.of("test4.md");
        String content = Files.readString(fileName);
        ArrayList<String> empty = new ArrayList<>();
        assertEquals(MarkdownParse.getLinks(content), empty);
    }

    @Test
    public void Lab7Snip1() throws IOException {
        Path fileName = Path.of("test_lab_7_snip_1.md");
        String content = Files.readString(fileName);
        assertEquals(List.of("`google.com","google.com","ucsd.edu"), MarkdownParse.getLinks(content));
    }

    @Test
    public void Lab7Snip2() throws IOException {
        Path fileName = Path.of("test_lab_7_snip_2.md");
        String content = Files.readString(fileName);
        assertEquals(List.of("a.com","a.com(())","example.com"),MarkdownParse.getLinks(content));
    }

    @Test
    public void Lab7Snip3() throws IOException {
        Path fileName = Path.of("test-lab7-snip-3.md");
        String content = Files.readString(fileName);
        assertEquals(List.of("https://sites.google.com/eng.ucsd.edu/cse-15l-spring-2022/schedule"),MarkdownParse.getLinks(content));
    }




}
