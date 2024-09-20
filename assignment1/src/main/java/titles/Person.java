package titles;

import assignment_one.ParticipateHours;

public abstract class Person implements ParticipateHours {
    public String title;
    public String firstName;
    public String lastName;
    public String subject;
    public int courseHours;
    public int totalHours;

    protected Person(String title, String firstName, String lastName, String subject, int courseHours) {
        this.title = title;
        this.firstName = firstName;
        this.lastName = lastName;
        this.subject = subject;
        this.courseHours = courseHours;
    }

    public String toString() {
        return title + " - " + firstName + " " + lastName + " - Total hours -> "
                + getTotalHours();
    }

    public void setTotalHours(int courseHours) {
        System.out.println("Person setTotalHours");
    }

    public int getTotalHours() {
        return totalHours;
    }

    public static int getLabHours(int courseHours) {
        return courseHours > 4 ? 2 : 1;
    }

}