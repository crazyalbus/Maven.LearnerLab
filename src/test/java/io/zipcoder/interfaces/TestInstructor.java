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
        Student testStudent = new Student(1001, "Kate");
        double preStudyTime = testStudent.getTotalStudyTime(); //added per leon's lecture
        double numberOfHours = 1;
        double postStudyTime = preStudyTime + numberOfHours; //added per leon's lecture

        //when
        Instructor testInstructor = new Instructor(2001);
        testInstructor.teach(testStudent, numberOfHours);

        //Then
        Assert.assertEquals(postStudyTime, testStudent.getTotalStudyTime(), .0001);
    }

    @Test
    public void testLecture() { //updated per leon's lecture
        //Given
        Instructor testInstructor = new Instructor(2001);
        Student tS1 = new Student(1001, "Kate");
        Student tS2 = new Student(1002, "Neela");
        Learner[] students = {tS1, tS2};

        double numberOfHours = 2;
        double numberOfHoursPerStudent = numberOfHours / students.length;

        double preStudyTime1 = tS1.getTotalStudyTime(); //added per leon's lecture
        double preStudyTime2 = tS2.getTotalStudyTime(); //added per leon's lecture

        double postStudyTime1 = preStudyTime1 + (numberOfHoursPerStudent);//added per leon's lecture
        double postStudyTime2 = preStudyTime1 + (numberOfHoursPerStudent);//added per leon's lecture

        //When
        testInstructor.lecture(students, numberOfHours);

        //Then
        Assert.assertEquals(postStudyTime1, tS1.getTotalStudyTime(), .001);
        Assert.assertEquals(postStudyTime2, tS2.getTotalStudyTime(), .001);
    }
}
