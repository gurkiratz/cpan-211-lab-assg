package csvparser;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

public class CsvParser {
  public static String[][] parseCsv(String filePath) {
    List<String[]> data = new ArrayList<>();

    try (BufferedReader br = new BufferedReader(new FileReader(filePath))) {
      // Skip the header line
      br.readLine();

      String line;
      while ((line = br.readLine()) != null) {
        String[] values = line.split("\t");
        for (int i = 0; i < values.length; i++) {
          values[i] = values[i].trim().replaceAll("^\"|\"$", "");
        }
        data.add(values);
      }
    } catch (IOException e) {
      e.printStackTrace();
    }

    return data.toArray(new String[0][]);
  }
}