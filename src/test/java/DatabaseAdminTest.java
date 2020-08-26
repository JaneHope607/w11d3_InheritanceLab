import Staff.techStaff.DatabaseAdmin;
import Staff.techStaff.Developer;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class DatabaseAdminTest {

    DatabaseAdmin databaseadmin;

    @Before
    public void before() {
        databaseadmin = new DatabaseAdmin("Jane", "UL40Y83", 60800.10);
    }

    @Test
    public void hasName() {
        assertEquals("Jane", databaseadmin.getName());
    }

    @Test
    public void hasNI() {
        assertEquals("UL40Y83", databaseadmin.getNI());
    }

    @Test
    public void hasSalary() {
        assertEquals(60800.10, databaseadmin.getSalary(), 0.01);
    }

    @Test
    public void canRaiseSalary() {
        databaseadmin.raiseSalary(1000.00);
        assertEquals(61800.10, databaseadmin.getSalary(), 0.01);
    }

    @Test
    public void canPayBonus() {
        assertEquals(608.001, databaseadmin.payBonus(), 0.01);
    }
}
