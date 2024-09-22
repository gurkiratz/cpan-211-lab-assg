package assignment_one;

import csvparser.CsvParser;
import titles.*;

import java.nio.file.Path;
import java.nio.file.Paths;

public class Tester {

    public static void main(String[] args) {
        String currentDirectory = Paths.get("").toAbsolutePath().toString();
        String filename = "/src/main/java/assignment_one/titles.csv";
        Path filePath = Paths.get(currentDirectory, filename);
        String[][] parsedData = CsvParser.parseCsv(filePath.toString());

        Person[] people = new Person[parsedData.length];
        int count = 0; 

        for (String[] row : parsedData) {
            String title = row[0];
            String firstName = row[1];
            String lastName = row[2];
            String subject = row[3];
            int courseHours = Integer.parseInt(row[4]);

            boolean found = false;

            // Condition to check if the person already exist
            for (int j = 0; j < count; j++) {
                if (people[j].getFirstName().equals(firstName) && people[j].getLastName().equals(lastName)) {
                    people[j].addCourseHours(courseHours);
                    found = true;
                    break;
                }
            }

            // If the person does not exist, create a new person
            if (!found) {
                switch (title) {
                    case "Professor":
                        people[count] = new Professor(firstName, lastName, subject);
                        people[count].addCourseHours(courseHours); 
                        count++;
                        break;
                    case "TA":
                        people[count] = new TA(firstName, lastName, subject);
                        people[count].addCourseHours(courseHours); 
                        count++;
                        break;
                    case "Student":
                        people[count] = new Student(firstName, lastName, subject);
                        people[count].addCourseHours(courseHours); 
                        count++;
                        break;
                    default:
                        System.out.println("Invalid title");
                        break;
                }
            }
        }

        // Prints the final output
        for (int i = 0; i < count; i++) {
            System.out.println(people[i]);
        }
    }

}
