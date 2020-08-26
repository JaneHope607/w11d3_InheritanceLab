import Staff.Management.Director;
import Staff.Management.Manager;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class DirectorTest {
    Director director;

    @Before
    public void before() {
        director = new Director("Jane", "UL40Y83", 60800.10, "HR", 1000000.00);
    }

    @Test
    public void hasName() {
        assertEquals("Jane", director.getName());
    }

    @Test
    public void hasNI() {
        assertEquals("UL40Y83", director.getNI());
    }

    @Test
    public void hasSalary() {
        assertEquals(60800.10, director.getSalary(), 0.01);
    }

    @Test
    public void hasDeptName() {
        assertEquals("HR", director.getDeptName());
    }

    @Test
    public void canRaiseSalary() {
        director.raiseSalary(1000.00);
        assertEquals(61800.10, director.getSalary(), 0.01);
    }

    @Test
    public void canPayBonus() {
        assertEquals(1216.002, director.payBonus(), 0.01);
    }

    @Test
    public void hasBudget() {
        assertEquals(1000000.00, director.getBudget(), 0.01);
    }
}
