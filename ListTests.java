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

        List<String> input3 = new ArrayList<>();
        input3.add("abcd");
        input3.add("abcdefg");
        input3.add("abcdefgh");

        List<String> test3 = new ArrayList<>();
        test3.add("abcdefg");
        test3.add("abcdefgh");
  
        assertEquals(new ArrayList<>(), ListExamples.filter(input1, sc));
        assertEquals(test3, ListExamples.filter(input3, sc));
	}

    @Test 
	public void testMerge() {
        List<String> input1 = new ArrayList<>();
        input1.add("c");
        input1.add("d");
        input1.add("e");

        List<String> input2 = new ArrayList<>();
        input2.add("a");
        input2.add("b");
        input2.add("f");

        List<String> ex = new ArrayList<>();
        ex.add("a");
        ex.add("b");
        ex.add("c");
        ex.add("d");
        ex.add("e");
        ex.add("f");
  
        assertEquals(ex, ListExamples.merge(input1, input2));
        assertEquals(new ArrayList<>(), ListExamples.merge
            (new ArrayList<>(), new ArrayList<>()));
	}
}