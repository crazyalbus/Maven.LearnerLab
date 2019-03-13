package io.zipcoder.interfaces;

import org.junit.Assert;
import org.junit.Test;

import java.util.Map;

public class TestStudents {

    @Test
    public void instanceTest() {

        //Given
        Student kate = new Student(1001);
        Student thao = new Student(1002);
        Student mark = new Student(1003);
        Student brian = new Student(1004);
        Students list = Students.getInstance();
        list.add(kate);
        list.add(thao);
        list.add(mark);
        list.add(brian);
        Integer expected = 4;

        //When
        Integer actual = list.getCount();
        Person[] students = list.getArray();

        //Then
        Assert.assertEquals(expected, actual);
    }
}
