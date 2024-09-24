package lab3;

import java.io.File;
import java.io.PrintWriter;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class VaccineFileHandler {
  public static void main(String[] args) {
    VaccineFileHandler handler = new VaccineFileHandler();
    // Read and display the existing records from vaccine_records.txt
    System.out.println("\nReading records from vaccine_records.txt:");
    handler.readFromFile("src/main/java/lab3/vaccine_records.txt");

    // Write new vaccine records to updated_vaccine_records.txt
    System.out.println("\nWrite new vaccine records to updated_vaccine_records.txt:");
    handler.writeToFile();

    // Read and display the existing records from vaccine_records.txt
    System.out.println("\nReading updated records from updated_vaccine_records.txt:");
    handler.readFromFile("src/main/java/lab3/updated_vaccine_records.txt");

  }

  // Method to read records from vaccine_records.txt
  public void readFromFile(String fileName) {
    File file = new File(fileName);

    try {
      Scanner sc = new Scanner(file);

      while (sc.hasNextLine()) {
        String record = sc.nextLine();
        System.out.println(record);
      }

      sc.close(); // Close the Scanner after use

    } catch (FileNotFoundException e) {
      System.out.println("Error: The file 'vaccine_records.txt' was not found.");
    }
  }



  // Method to add new vaccine records to updated_vaccine_records.txt

  public void writeToFile() {

    Scanner sc = new Scanner(System.in);
    File file = new File("src/main/java/lab3/updated_vaccine_records.txt");
    try {

      PrintWriter output = new PrintWriter(file);

      // Get user input for new vaccine records
      System.out.println("Enter the name: ");
      String name = sc.nextLine();

      System.out.println("Enter the vaccine type: ");
      String vaccineType = sc.nextLine();

      System.out.println("Enter the number of doses: ");
      int doses = sc.nextInt();

      sc.close();

      // Write the user input to the file
      output.println("Name: " + name);
      output.println("Vaccine Type: " + vaccineType);
      output.println("Number of Doses: " + doses);
      output.println(); // Add a new line after each record
      output.close(); // Close PrintWriter after writing
      System.out.println("Record written to updated_vaccine_records.txt successfully.");

    } catch (FileNotFoundException e) {
      System.out
          .println("Error: Unable to create or write to the file 'updated_vaccine_records.txt'.");
    }
  }

}
