package co.schrom.DemoWebApp;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class PersonTest {

    private Person person;

    @BeforeEach
    public void setUp() {
        person = new Person("Max", "Mustermann");
    }

    @Test
    public void testGetName() {
        assertEquals("Max Mustermann", person.getName());
    }

}
