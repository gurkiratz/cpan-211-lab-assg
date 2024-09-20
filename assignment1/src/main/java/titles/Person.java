package titles;

import assignment_one.ParticipateHours;

public abstract class Person implements ParticipateHours {
    private String title;
    private String firstName;
    private String lastName;
    private String subject; // Not being used in the code and final output
    private int courseHours; // Not being used in abstract class. TODO: Move to just be in subclasses?
    private int totalHours;

    public Person(String title, String firstName, String lastName, String subject, int courseHours) {
        this.title = title;
        this.firstName = firstName;
        this.lastName = lastName;
        this.subject = subject;
        this.courseHours = courseHours;
    }
    
    // Include enough getters for attributes that are needed by other classes
    public String getFirstName() {
        return firstName;
    }
    
    public String getLastName() {
        return lastName;
    }

    public int getTotalHours() {
        return totalHours;
    }

    public abstract void setTotalHours(int courseHours);

    public String toString() {
        return title + " - " + firstName + " " + lastName + " - Total hours -> "
                + getTotalHours();
    }

}