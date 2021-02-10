import org.junit.Before;
import org.junit.Test;
import techStaff.DatabaseAdmin;

import static org.junit.Assert.assertEquals;

public class DatabaseAdminTest {

    //    why this?
    DatabaseAdmin databaseAdmin;

    @Before
    public void setup(){
        databaseAdmin = new DatabaseAdmin("Bruce", 32000, "12345678J");
    }

    @Test
    public void hasName(){
        assertEquals("Bruce", databaseAdmin.getName());
    }

    @Test
    public void hasSalary(){
        assertEquals(32000, databaseAdmin.getSalary(), 0.1);
    }

    @Test
    public void hasNiNumber(){
        assertEquals("12345678J", databaseAdmin.getNiNumber());
    }

    @Test
    public void canRaiseSalary() {
        databaseAdmin.raiseSalary(1.5);
        assertEquals(48000, databaseAdmin.getSalary(), 0.1);
    }

    @Test
    public void canPayBonus(){
        databaseAdmin.payBonus();
        assertEquals(32320, databaseAdmin.getSalary(), 0.01);
    }

}