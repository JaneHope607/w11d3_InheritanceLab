import Staff.Management.Manager;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class ManagerTest {
    Manager manager;

    @Before
    public void before() {
        manager = new Manager("Jane", "UL40Y83", 60800.10, "HR");
    }

    @Test
    public void hasName() {
        assertEquals("Jane", manager.getName());
    }

    @Test
    public void hasNI() {
        assertEquals("UL40Y83", manager.getNI());
    }

    @Test
    public void hasSalary() {
        assertEquals(60800.10, manager.getSalary(), 0.01);
    }

    @Test
    public void hasDeptName() {
        assertEquals("HR", manager.getDeptName());
    }

    @Test
    public void canRaiseSalary() {
        manager.raiseSalary(1000.00);
        assertEquals(61800.10, manager.getSalary(), 0.01);
    }

    @Test
    public void canPayBonus() {
        assertEquals(608.001, manager.payBonus(), 0.01);
    }
}
