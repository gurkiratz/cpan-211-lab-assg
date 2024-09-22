package titles;

public class Student extends Person {

    public Student(String title, String firstName, String lastName, String subject) {
        //calling super class constructor (Person)
        super(title, firstName, lastName, subject);
        
    }
    
    
    /*we will be overiding the getParticipatingHours because its being implemented
     by the subclass Person from the interface ParticipateHours and returnung the whole course hours for students
     */
    //because the students participates in all the course hours we retuen the full hours for students
    @Override
    public int getParticipatingHours(int courseHours) {
        return courseHours; 
    }


    // here we are Implementing the abstract `toString` method from the Person class
    // to print a customized msg for every subclass
    @Override
    public String toString() {
        return "Student - " + getFirstName() + " " + getLastName() + " - Total Hours: " + getTotalHours();
    }
}
