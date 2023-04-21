import static org.junit.Assert.*;
import org.junit.*;
import java.util.ArrayList;
import java.util.List;

public class ListTests {
    @Test 
	public void testFilter() {
        
        StringChecker sc = new ListExamples();
        List<String> input1 = new ArrayList<>();
        input1.add("a");
        input1.add("a");
        input1.add("a");

        List<String> input2 = new ArrayList<>();
        input2.add("abcdef");
        input2.add("abc");
        input2.add("a");

        List<String> test2 = new ArrayList<>();
        test2.add("abcdef");

        List<String> input3 = new ArrayList<>();
        input3.add("abcdef");
        input3.add("abcdefg");
        input3.add("abcdefgh");

        List<String> test3 = new ArrayList<>();
        test3.add("abcdef");
        test3.add("abcdefg");
        test3.add("abcdefgh");
  
        assertEquals(new ArrayList<>(), ListExamples.filter(input1, sc));
        assertEquals(test2, ListExamples.filter(input2, sc));
        assertEquals(test3, ListExamples.filter(input3, sc));
	}

    @Test 
	public void testMerge() {
        List<String> input1 = new ArrayList<>();
        input1.add("a");
        input1.add("a");
        input1.add("a");

        List<String> input2 = new ArrayList<>();
        input2.add("abcdef");
        input2.add("abc");
        input2.add("a");
  
        assertEquals(new ArrayList<>(), ListExamples.merge(input1, input2));
	}
}
