import org.junit.Before;
import org.junit.Test;
import management.Manager;

import static org.junit.Assert.assertEquals;

public class ManagerTest {

    //    why this?
    Manager manager;

    @Before
    public void setup(){
        manager = new Manager("Shirley", 50000, "22345678J", "Finance");
    }

    @Test
    public void hasName(){
        assertEquals("Shirley", manager.getName());
    }

    @Test
    public void hasSalary(){
        assertEquals(50000, manager.getSalary(), 0.1);
    }

    @Test
    public void hasNiNumber(){
        assertEquals("22345678J", manager.getNiNumber());
    }

    @Test
    public void canRaiseSalary() {
        manager.raiseSalary(1.5);
        assertEquals(75000, manager.getSalary(), 0.1);
    }

    @Test
    public void canPayBonus(){
        manager.payBonus();
        assertEquals(50500, manager.getSalary(), 0.01);
    }

    @Test
    public void hasDepartmentName(){
        assertEquals("Finance", manager.getDepartmentName());
    }

}