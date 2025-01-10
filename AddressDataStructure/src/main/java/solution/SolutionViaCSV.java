package solution;

import com.opencsv.CSVReader;
import com.opencsv.exceptions.CsvException;

import java.io.FileReader;
import java.io.IOException;
import java.util.List;

public class SolutionViaCSV {
    public static void main(String[] args) throws IOException, CsvException {
        // File path of the CSV file
        String csvFilePath = "src/test/resources/countries_states_cities.csv";
        
        // Create CSVReader to read the file
        CSVReader reader = new CSVReader(new FileReader(csvFilePath));
        
        // Reading all rows at once
        List<String[]> rows = reader.readAll();
        
        // Iterate through rows and print data
        for (String[] row : rows) {
            String country = row[0];
            String state = row[1];
            String city = row[2];
            System.out.println("Country: " + country + ", State: " + state + ", City: " + city);
        }

        // Close the reader
        reader.close();
    }
}

