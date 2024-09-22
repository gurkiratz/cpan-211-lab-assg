package titles;

public class Professor extends Person {

    public Professor(String title, String firstName, String lastName, String subject) {
        super(title, firstName, lastName, subject);
        
    }

    /*
     * we must overide the getParticipatingHours because its being implemented
     * by the subclass (Person) from the interface ParticipateHours
     */
    /*
     * as per requirement prof hours are just the lecture hours which is course
     * hours minus the lab hours which will be covered bt a TA
     */
    @Override
    public int getParticipatingHours(int courseHours) {
        int lectureHours = courseHours - getLabHours(courseHours);
        return lectureHours;
    }



    // here we are Implementing the abstract `toString` method from the Person class
    // to print a customized msg for every subclass
    @Override
    public String toString() {
        return "Professor - " + getFirstName() + " " + getLastName() + " - Total Hours: " + getTotalHours();
    }

}
