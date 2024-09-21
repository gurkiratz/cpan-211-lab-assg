package titles;

public class Student extends Person {
    private int totalHours;

    public Student(String title, String firstName, String lastName, String subject, int courseHours) {
        super(title, firstName, lastName, subject, courseHours);
        super.setTotalHours(courseHours);
    }

    public int getParticipatingHours(int courseHours) {
        return courseHours;
    }

}
