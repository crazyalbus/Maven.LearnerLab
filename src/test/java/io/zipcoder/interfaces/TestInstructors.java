package io.zipcoder.interfaces;

import org.junit.Assert;
import org.junit.Test;

public class TestInstructors {

    @Test
    public void instanceTest() {

        //Given
        Instructor kris = new Instructor(2001);
        Instructor leon = new Instructor(2002);
        Instructor froilan = new Instructor(2003);
        Instructor nhu = new Instructor(2004);
        Instructors list = Instructors.getInstance();
        list.add(kris);
        list.add(leon);
        list.add(froilan);
        list.add(nhu);
        Integer expected = 4;

        //When
        Integer actual = list.getCount();
        Person[] instructors = list.getArray();

        //Then
        Assert.assertEquals(expected, actual);
    }

}
