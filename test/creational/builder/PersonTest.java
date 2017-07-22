package creational.builder;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.JUnit4;

import static org.junit.Assert.*;

/**
 * @author Renat Kaitmazov
 */

@RunWith(JUnit4.class)
public final class PersonTest {

    @Test
    public final void buildTest() throws Exception {
        final Person person = new Person.PersonBuilder()
                .setFirstName("Renat")
                .setPhoneNumber("+7 (999) 111-22-33")
                .build();

        assertNotNull(person);
        assertNull(person.getCompany());
        assertNull(person.getCountry());
        assertNull(person.getEmail());
        assertNull(person.getLastName());
        assertEquals("Renat", person.getFirstName());
        assertEquals("+7 (999) 111-22-33", person.getPhoneNumber());
    }
}