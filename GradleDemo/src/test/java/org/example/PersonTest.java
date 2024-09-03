package org.example;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertFalse;
import static org.junit.jupiter.api.Assertions.assertTrue;

public class PersonTest {

    @Test
    public void testIsEligibleForDrivingLicense(){
        Person eligiblePerson = new Person(19);
        assertTrue(eligiblePerson.isEligibleForDrivingLicense());
    }

    @Test
    public void testIsNotEligibleForDrivingLicense(){
        Person eligiblePerson = new Person(17);
        assertFalse(eligiblePerson.isEligibleForDrivingLicense());
    }
}
