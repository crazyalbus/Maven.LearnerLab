package io.zipcoder.interfaces;

import org.junit.Assert;
import org.junit.Test;

public class TestEducator {

    @Test
    public void educatorConstructorTest() {

        //When
        Teacher test = Educator.FROILAN;
        Instructor froilan = Instructors.getInstance().findById(2003);
        String expectedName = "Froilan";
        String actualName = froilan.getName();
        long expectedID = 2003;
        long actualID = froilan.getId();

        //Then
        Assert.assertEquals(expectedID, actualID);
        Assert.assertEquals(expectedName, actualName);
    }

    @Test
    public void teachTest() {
        //Given
        Educator testKris = Educator.KRIS;
        Student kate = new Student(1001, "Kate");
        Students.getInstance().add(kate);

        //When
        testKris.teach(kate, 3);
        long expectedKrisHours = 3;
        double actualKrisHours = testKris.getTimeWorked();
        long expectedKateHours = 3;
        double actualKateHours = kate.getTotalStudyTime();

        //Then
        Assert.assertEquals(expectedKrisHours, actualKrisHours, .001);
        Assert.assertEquals(expectedKateHours, actualKateHours, .001);

    }
}
