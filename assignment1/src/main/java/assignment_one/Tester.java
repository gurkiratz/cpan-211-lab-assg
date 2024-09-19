/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package assignment_one;

import csvparser.CsvParser;
import titles.*;

import java.nio.file.Path;
import java.nio.file.Paths;

/**
 *
 * @author Riley
 */
public class Tester {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        String currentDirectory = Paths.get("").toAbsolutePath().toString();
        String filename = "/src/main/java/assignment_one/titles.csv";
        Path filePath = Paths.get(currentDirectory, filename);
        // String[][] parsedData = CsvParser.parseCsv(filePath.toString());

        String[][] parsedData = {
                { "Professor", "Isaac", "Newton", "Physics", "6" },
                { "TA", "Marie", "Curie", "Physics", "6" },
                { "Professor", "Isaac", "Newton", "Calculus", "4" },
                { "Student", "Amy", "Adams", "Calculus", "4" },
                { "Student", "Will", "Smith", "Calculus", "4" },
                { "Student", "Brad", "Pitt", "Physics", "6" }
        };

        System.out.println(parsedData.length);

        Person[] people = new Person[parsedData.length];
        for (int i = 0; i < parsedData.length; i++) {
            String[] row = parsedData[i];
            String title = row[0];
            String firstName = row[1];
            String lastName = row[2];
            String subject = row[3];
            int courseHours = Integer.parseInt(row[4]);

            switch (title) {
                case "Professor":
                    people[i] = new Professor(title, firstName, lastName, subject, courseHours);
                    break;
                case "TA":
                    people[i] = new TA(title, firstName, lastName, subject, courseHours);
                    break;
                case "Student":
                    people[i] = new Student(title, firstName, lastName, subject, courseHours);
                    break;
                default:
                    System.out.println("Invalid title");
                    break;
            }
        }

        for (Person person : people) {
            System.out.println(person.toString());
        }
    }

}
