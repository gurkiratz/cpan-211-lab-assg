package titles;

public class Professor extends Person {
    private int totalHours;

    public Professor(String title, String firstName, String lastName, String subject, int courseHours) {
        super(title, firstName, lastName, subject, courseHours);
        this.totalHours = getParticipatingHours(courseHours);
    }

    public int getParticipatingHours(int courseHours) {
        int lectureHours = courseHours - (courseHours > 4 ? 2 : 1);
        return lectureHours;
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
