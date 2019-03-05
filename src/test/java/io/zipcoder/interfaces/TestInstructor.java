package io.zipcoder.interfaces;

import org.junit.Assert;
import org.junit.Test;

public class TestInstructor {

    @Test
    public void testImplementation() {
        //When
        Instructor testInstructor = new Instructor(1002);

        //Then
        Assert.assertTrue(testInstructor instanceof Teacher);
    }

    @Test
    public void testInheritance() {
        //When
        Instructor testInstructor = new Instructor(1002);

        //Then
        Assert.assertTrue(testInstructor instanceof Person);
    }

    @Test
    public void testTeach() {
        //Given
        Student testStudent = new Student(1001);
        double numberOfHours = 1;

        //when
        Instructor testInstructor = new Instructor(2001);
        testInstructor.teach(testStudent, numberOfHours);

        //Then
        Assert.assertEquals(numberOfHours, testStudent.getTotalStudyTime(), .0001);
    }

    @Test
    public void testLecture() {
        //Given
        Student tS1 = new Student(1001);
        Student tS2 = new Student(1002);
        double numberOfHours = 2;
        Learner[] students = {tS1, tS2};

        //When
        Instructor testInstructor = new Instructor(2001);
        testInstructor.lecture(students, numberOfHours);

        //Then
        Assert.assertEquals(numberOfHours / students.length, tS1.getTotalStudyTime(), .001);
        Assert.assertEquals(numberOfHours / students.length, tS1.getTotalStudyTime(), .001);
    }
}
