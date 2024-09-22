package titles;

import assignment_one.ParticipateHours;

public abstract class Person implements ParticipateHours {
    //declaring variables as private for encapsulation purposes
    private String title;
    private String firstName;
    private String lastName;
    private String subject; // Not being used in the code and final output
    private int totalHours;
    //instantiating constructor for subclass
    public Person(String title, String firstName, String lastName, String subject) {
        this.title = title;
        this.firstName = firstName;
        this.lastName = lastName;
        this.subject = subject;
        this.totalHours = 0;

    }

    // adding necessary getters & setters for attributes that are needed by other classes
    public String getFirstName() {
        return firstName;
    }

    public String getLastName() {
        return lastName;
    }
    
    public int getTotalHours() {
        return totalHours;
    }


    // this method uses a tenary operator to satisfy profject requirement(if course
    // hours is more that 4 hours lab hours will be 2 hours otherwise lab hours will
    // be 1 hour)
    public static int getLabHours(int courseHours) {
        return courseHours > 4 ? 2 : 1;
    }
    //this method will be used to accumulate in the main class for the subclasses
    public void addCourseHours(int courseHours) {
        this.totalHours += getParticipatingHours(courseHours);
    }

    
    // overiding the interface method in Participating.java 
    @Override
    public int getParticipatingHours(int courseHours) {
        return courseHours;
    }

    public abstract String toString();

}