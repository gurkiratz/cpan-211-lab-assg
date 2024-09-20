package titles;

public class Professor extends Person {
    public int totalHours;

    public Professor(String title, String firstName, String lastName, String subject, int courseHours) {
        super(title, firstName, lastName, subject, courseHours);
        this.totalHours = getParticipatingHours(courseHours);
    }

    public int getParticipatingHours() {
        int lectureHours = this.courseHours - getLabHours(this.courseHours);
        return lectureHours;
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
