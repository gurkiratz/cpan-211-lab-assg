package titles;

public class Professor extends Person {

    public Professor(String firstName, String lastName, String subject, int courseHours) {
        super(firstName, lastName, subject);
        super.addTotalHours(courseHours);
    }

    // Override abstract method from superclass
    @Override
    public String getTitle() {
        return "Professor";
    }

    // Override implemented method from ParticipateHours->Person
    // Prof hours are just lecture hours based on courseHours - labHours being
    // covered by TA
    @Override
    public int getParticipatingHours(int courseHours) {
        int lectureHours = courseHours - getLabHours(courseHours);
        return lectureHours;
    }

}
