import Staff.Management.Manager;
import Staff.techStaff.Developer;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class DeveloperTest {
    Developer developer;

    @Before
    public void before() {
        developer = new Developer("Jane", "UL40Y83", 60800.10);
    }

    @Test
    public void hasName() {
        assertEquals("Jane", developer.getName());
    }

    @Test
    public void hasNI() {
        assertEquals("UL40Y83", developer.getNI());
    }

    @Test
    public void hasSalary() {
        assertEquals(60800.10, developer.getSalary(), 0.01);
    }

    @Test
    public void canRaiseSalary() {
        developer.raiseSalary(1000.00);
        assertEquals(61800.10, developer.getSalary(), 0.01);
    }

    @Test
    public void canPayBonus() {
        assertEquals(608.001, developer.payBonus(), 0.01);
    }

}
