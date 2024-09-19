/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package titles;

/**
 *
 * @author Riley
 */
public class Professor extends Person {

    public Professor(String title, String firstName, String lastName, String subject, int courseHours) {
        super(title, firstName, lastName, subject, courseHours);
    }

    @Override
    public int getParticipatingHours(int courseHours) {
        int lectureHours = courseHours - getLabHours(courseHours);
        return lectureHours;
    }
}
