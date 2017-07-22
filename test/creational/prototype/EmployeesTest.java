package creational.prototype;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.JUnit4;

import java.util.List;

import static org.junit.Assert.*;

/**
 * @author Renat Kaitmazov
 */

@RunWith(JUnit4.class)
public final class EmployeesTest {


    @Test
    public final void cloneTest() throws Exception {
        final Employees original = new Employees();
        original.loadData();
        final List<String> originalList = original.getEmployees();

        final Employees copy = (Employees) original.clone();
        final List<String> copyList = copy.getEmployees();

        copyList.remove("Renat");
        copyList.remove("Dzhiger");

        assertTrue(originalList.contains("Dzhiger"));
        assertTrue(originalList.contains("Renat"));
        assertFalse(copyList.contains("Dzhiger"));
        assertFalse(copyList.contains("Renat"));

        copyList.add("John");

        assertFalse(originalList.contains("John"));
        assertTrue(copyList.contains("John"));
    }
}