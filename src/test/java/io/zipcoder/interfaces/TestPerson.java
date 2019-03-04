package io.zipcoder.interfaces;

import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

public class TestPerson {

    @Test
    public void testConstructor() {
        //Given
        long testId = 1002;

        //When
        Person testPerson = new Person(testId);

        //Then
        Assert.assertEquals(testId, testPerson.getId());
    }

    @Test
    public void testSetName() {
        //Given
        long testId = 1002;
        String testName = "Kate";

        //When
        Person testPerson = new Person(testId);
        testPerson.setName(testName);

        //Then
        Assert.assertEquals(testName, testPerson.getName());
    }
}
