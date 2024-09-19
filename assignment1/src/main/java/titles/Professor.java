package titles;

public class Professor extends Person {

    public Professor(String title, String firstName, String lastName, String subject, int courseHours) {
        super(title, firstName, lastName, subject, courseHours);
    }

    @Override
    public int getParticipatingHours(int courseHours) {
        int lectureHours = courseHours - getLabHours(courseHours);
        return lectureHours;
    }
}
