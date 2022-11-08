import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;
import org.junit.runner.RunWith;

import java.util.ArrayList;
import java.util.List;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertNotEquals;


public class Activity1 {
    static List<String> list = new ArrayList<String>();
    @BeforeAll
    public static void setUp(){
        // Initialize a new ArrayList


// Add values to the list
        list.add("alpha"); // at index 0
        list.add("beta"); // at index 1
    }
    @Test
    public void insertTest(){
// Assert size of list
        assertEquals(3, list.size(), "correct size");
        assertNotEquals("aipo", list.get(0), "Wrong element");
        list.add("zeta");
        assertEquals(4, list.size(), "Correct size");
        assertEquals("alpha", list.get(0), "Correct element");
        assertNotEquals("beta", list.get(1), "Correct element");
        assertEquals("zeta", list.get(2), "Correct element");

    }
    @Test
    public void replaceTest()
    {
        assertEquals(2, list.size(), "correct size");
        list.add("zeta");
        assertEquals(3, list.size(), "Correct size");

        list.set(1,"Chens");
        assertEquals("alpha", list.get(0), "Correct element");
        assertEquals("Chens", list.get(1), "Correct element");
        assertEquals("zeta", list.get(2), "Correct element");

    }
}
