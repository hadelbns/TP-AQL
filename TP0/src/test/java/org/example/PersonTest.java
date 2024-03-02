package org.example;
import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.Test;
public class PersonTest {

    @Test
    public void testGetFullName() {
        // Création d'une instance de Person avec un prénom, un nom et un âge
        Person person = new Person("Benseid", "Hadil", 23);

        // Vérification du nom complet
        assertTrue(person.getFullName().equalsIgnoreCase("benseid hadil"));
        //assertEquals("Benseid Hadil", person.getFullName());
    }

    @Test
    // il faut que que deux methode psk ona deux classe d'equivalence
    public void testIsAdult() {
        // Création d'une instance de Person avec un prénom, un nom et un âge
        Person adult = new Person("nana", "belho", 22);
        Person minor = new Person("bekri", "ilhem", 23);

        // Vérification si la personne est majeure
        assertTrue(adult.isAdult());
        assertFalse(minor.isAdult());
    }
}
