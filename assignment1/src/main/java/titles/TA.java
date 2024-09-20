package titles;

public class TA extends Person {
    int totalHours;

    public TA(String title, String firstName, String lastName, String subject, int courseHours) {
        super(title, firstName, lastName, subject, courseHours);
        this.totalHours = getParticipatingHours(courseHours);
    }

    public int getParticipatingHours() {
        return getLabHours(courseHours);
    }

    public int getParticipatingHours(int courseHours) {
        return getLabHours(courseHours);
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
