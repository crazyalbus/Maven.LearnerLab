package io.zipcoder.interfaces;

public final class Students extends People<Student>{

    private static final Students INSTANCE = new Students();

    private Students() {
    }


    public static Students getInstance() {
        return INSTANCE;
    }

    public Student[] getArray() {

        return  super.personList.toArray(new Student[personList.size()]);
    }
}
