package titles;

public class Student extends Person {

    public Student(String title, String firstName, String lastName, String subject, int courseHours) {
        super(title, firstName, lastName, subject, courseHours);
    }

    @Override
    public int getParticipatingHours(int courseHours) {
        return courseHours;
    }
}
