import org.junit.Before;
import org.junit.Test;
import management.Director;

import static org.junit.Assert.assertEquals;

public class DirectorTest {

//        why this?
    Director director;

    @Before
    public void setup(){
        director = new Director("Fiona", 100000, "22245678J", "Board", 1000000);
    }

    @Test
    public void hasName(){
        assertEquals("Fiona", director.getName());
    }

    @Test
    public void hasSalary(){
        assertEquals(100000, director.getSalary(), 0.1);
    }

    @Test
    public void hasNiNumber(){
        assertEquals("22245678J", director.getNiNumber());
    }

    @Test
    public void canRaiseSalary() {
        director.raiseSalary(1.5);
        assertEquals(150000, director.getSalary(), 0.1);
    }

//    @Test
//    public void canPayBonus(){
//        director.payBonus();
//        assertEquals(102000, director.getSalary(), 0.01);
//    }

    @Test
    public void hasDepartmentName(){
        assertEquals("Board", director.getDepartmentName());
    }

    @Test
    public void hasBudget(){
        assertEquals(1000000, director.getBudget(), .001);
    }

    @Test
    public void cannotDecreaseSalary(){
        director.raiseSalary(0.5);
        assertEquals(100000, director.getSalary(), .001);
    }

}