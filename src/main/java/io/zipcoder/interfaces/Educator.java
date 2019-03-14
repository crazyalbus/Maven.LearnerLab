package io.zipcoder.interfaces;

public enum Educator implements Teacher {

    /*-----------notes from Leon's lecture-----------
    FROILAN(2003L, "Froilan"),
    KRIS((long) 2001, "Kris"),
    LEON((long) 2002, "Leon"),
    NHU((long) 2004, "Nhu");

    Educator() {
    this.instructor = new Instructor((long)ordinal(), name()) {
        @Override
        public void teach(Learner learner, double numberOfhours) {
            learner.learn(numberOfHours);
            numberOfHoursTaught += numberOfHours;
        }
    };

    }

    this.numberOfHoursTaught += numberOfHours;
    this.instructor.teach(learner, numberOfHours);


     */


    FROILAN((long)2003, "Froilan"),
    KRIS((long) 2001, "Kris"),
    LEON((long) 2002, "Leon"),
    NHU((long) 2004, "Nhu");


    private final Instructor instructor;
    double timeWorked;

    Educator(Long id,String name) {
        this.instructor = new Instructor(id);
        instructor.setName(name);
        Instructors.getInstance().add(instructor);
        this.timeWorked = 0;
    }
    @Override
    public void teach(Learner learner, double numberOfHours) {
        instructor.teach(learner, numberOfHours);
        this.timeWorked += numberOfHours;
    }
    @Override
    public void lecture(Learner[] learners, double numberOfHours) {
        instructor.lecture(learners, numberOfHours);
        this.timeWorked += numberOfHours;
    }

    public double getTimeWorked() {
        return this.timeWorked;
    }
}
