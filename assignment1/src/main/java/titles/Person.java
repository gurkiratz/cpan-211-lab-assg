package titles;

import assignment_one.ParticipateHours;

public abstract class Person implements ParticipateHours {
    
    // Declaring variables as private for encapsulation purposes
    private String title;
    private String firstName;
    private String lastName;
    private String subject; // Not being used in the code and final output
    private int totalHours;

    // Instantiating constructor for subclass
    public Person(String title, String firstName, String lastName, String subject) {
        this.title = title;
        this.firstName = firstName;
        this.lastName = lastName;
        this.subject = subject;
        this.totalHours = 0;
    }

    // Adding necessary getters for attributes that are needed by other classes
    // Set up an abstract method since each Person will have a different title
    public abstract String getTitle();

    public String getFirstName() {
        return firstName;
    }

    public String getLastName() {
        return lastName;
    }
    
    public int getTotalHours() {
        return totalHours;
    }

    // Uses a ternary operator to satisfy project requirement;
    // courseHours is more that 4 hours, the lab hours will be 2; otherwise it will be 1
    public static int getLabHours(int courseHours) {
        return courseHours > 4 ? 2 : 1;
    }
    // this method will be used to accumulate in the main class for the subclasses
    public void addCourseHours(int courseHours) {
        this.totalHours += getParticipatingHours(courseHours);
    }

    @Override
    public int getParticipatingHours(int courseHours) {
        return courseHours;
    }

    public String toString() {
        return getTitle() + " - " + firstName + " " + lastName + " - Total hours -> "
                + getTotalHours();
    }

}