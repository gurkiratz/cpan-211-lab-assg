package titles;

public class TA extends Person {
    int totalHours;

    public TA(String title, String firstName, String lastName, String subject) {
        super(title, firstName, lastName, subject);
        
    }
    
    /*
     * we will be overiding the getParticipatingHours because its being implemented
     * by the subclass (Person) from the interface (ParticipateHours) and returing the lab hours for TA
     */
    
    @Override
    public int getParticipatingHours(int courseHours) {
        return getLabHours(courseHours);
    }

    // here we are Implementing the abstract `toString` method from the Person class
    // to print a customized msg for every subclass
    @Override
    public String toString() {
        return "TA - " + getFirstName() + " " + getLastName() + " - Total Hours: " + getTotalHours();
    }
}
