package titles;

public class Student extends Person {

    public Student(String firstName, String lastName, String subject, int courseHours) {
        super(firstName, lastName, subject);
        super.addTotalHours(courseHours);
    }

    // Override abstract method from superclass
    @Override
    public String getTitle() {
        return "Student";
    }
}
