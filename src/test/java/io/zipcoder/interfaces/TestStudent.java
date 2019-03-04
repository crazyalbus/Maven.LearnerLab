package io.zipcoder.interfaces;

import org.junit.Assert;
import org.junit.Test;

public class TestStudent {

    @Test
    public void testImplementation() {
        //When
        Student testStudent = new Student(1002);

        //Then
        Assert.assertTrue(testStudent instanceof Learner);
    }

    @Test
    public void testInheritance() {
        //When
        Student testStudent = new Student(1002);

        //Then
        Assert.assertTrue(testStudent instanceof Person);
    }

    @Test
    public void testLearn() {
        //Given
        double studyTime = 1;

        //When
        Student testStudent = new Student(1002);
        testStudent.learn(studyTime);

        //Then
        Assert.assertEquals(studyTime, testStudent.getTotalStudyTime(), .0001);
    }
}
