package titles;

import assignment_one.ParticipateHours;

public abstract class Person implements ParticipateHours {
    protected String title;
    protected String firstName;
    protected String lastName;
    protected String subject;
    protected int courseHours;

    public Person(String title, String firstName, String lastName, String subject, int courseHours) {
        this.title = title;
        this.firstName = firstName;
        this.lastName = lastName;
        this.subject = subject;
        this.courseHours = courseHours;
    }

    public String toString() {
        return title + " " + firstName + " " + lastName + " " + subject + " " + getParticipatingHours(courseHours);
    }

    public static int getLabHours(int courseHours) {
        return courseHours > 4 ? 2 : 1;
    }
}