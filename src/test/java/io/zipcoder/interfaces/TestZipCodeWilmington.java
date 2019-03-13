package io.zipcoder.interfaces;

import org.junit.Assert;
import org.junit.BeforeClass;
import org.junit.Test;

public class TestZipCodeWilmington {

    @Test
    public void hostLectureTest() {

        //Given
        Students studentList = Students.getInstance();
        Student kate = new Student((long) 1001);
        Student thao = new Student((long) 1002);
        studentList.add(kate);
        studentList.add(thao);
        Instructors instructorlist = Instructors.getInstance();
        Instructor kris = new Instructor(2001);
        instructorlist.add(kris);
        double numberOfHours = 2;
        double expectedStudentHours = 1;

        //When
        ZipCodeWilmington.hostLecture(kris, numberOfHours);

        double actualStudentHours = kate.getTotalStudyTime();

        //Then
        Assert.assertEquals(expectedStudentHours, actualStudentHours, .0001);
    }

    @Test
    public void hostLectureByIdTest() {

        //Given
        Students studentList = Students.getInstance();
        Student kate = new Student((long) 1001);
        Student thao = new Student((long) 1002);
        studentList.add(kate);
        studentList.add(thao);
        Instructors instructorlist = Instructors.getInstance();
        Instructor kris = new Instructor(2001);
        instructorlist.add(kris);
        double numberOfHours = 2;
        double expectedStudentHours = 1;

        //When
        ZipCodeWilmington.hostLectureById((long) 2001, numberOfHours);

        double actualStudentHours = kate.getTotalStudyTime();

        //Then
        Assert.assertEquals(expectedStudentHours, actualStudentHours, .0001);
    }


}
