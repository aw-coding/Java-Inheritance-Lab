import org.junit.Before;
import org.junit.Test;
import techStaff.Developer;

import static org.junit.Assert.assertEquals;

public class DeveloperTest {

//    why this?
    Developer developer;

    @Before
    public void setup(){
        developer = new Developer("Bruce", 32000, "12345678J");
    }

    @Test
    public void hasName(){
        assertEquals("Bruce", developer.getName());
    }

    @Test
    public void hasSalary(){
        assertEquals(32000, developer.getSalary(), 0.1);
    }

    @Test
    public void hasNiNumber(){
        assertEquals("12345678J", developer.getNiNumber());
    }

    @Test
    public void canRaiseSalary(){
        developer.raiseSalary(1.5);
        assertEquals(48000, developer.getSalary(), 0.1);
    }


}