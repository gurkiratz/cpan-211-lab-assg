package titles;

public class Professor extends Person {
    private int totalHours;

    public Professor(String title, String firstName, String lastName, String subject, int courseHours) {
        super(title, firstName, lastName, subject, courseHours);
        super.setTotalHours(courseHours);
    }

    public int getParticipatingHours(int courseHours) {
        int lectureHours = courseHours - getLabHours(courseHours);
        return lectureHours;
    }

}
