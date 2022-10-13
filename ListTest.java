import static org.junit.Assert.*;
import org.junit.*;
import java.util.*;

public class ListTest {
    
    @Test
    public void testFilter(){
        List<String> str_input = Arrays.asList("One", "Two", "Three", "Four", "Five");
        StringChecker checker = new ListExamples();
        List<String> output = Arrays.asList("One", "Two", "Four", "Five");
        assertEquals(output, ListExamples.filter(str_input, checker));
    }
}
