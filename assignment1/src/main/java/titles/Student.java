package titles;

public class Student extends Person {

    public Student(String firstName, String lastName, String subject) {
        super(firstName, lastName, subject);
    }
    
    // Override abstract method from superclass
    @Override
    public String getTitle() {
        return "Student";
    }
}
