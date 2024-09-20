package titles;

public class Student extends Person {
    int totalHours;

    public Student(String title, String firstName, String lastName, String subject, int courseHours) {
        super(title, firstName, lastName, subject, courseHours);
        this.totalHours = getParticipatingHours(courseHours);
    }

    public int getParticipatingHours(int courseHours) {
        return courseHours;
    }

    @Override
    public void setTotalHours(int courseHours) {
        this.totalHours += getParticipatingHours(courseHours);
    }

    @Override
    public int getTotalHours() {
        return totalHours;
    }

}
