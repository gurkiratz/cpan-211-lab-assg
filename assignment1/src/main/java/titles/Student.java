/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package titles;

/**
 *
 * @author Riley
 */
public class Student extends Person {

    public Student(String title, String firstName, String lastName, String subject, int courseHours) {
        super(title, firstName, lastName, subject, courseHours);
    }

    @Override
    public int getParticipatingHours(int courseHours) {
        return courseHours;
    }
}
