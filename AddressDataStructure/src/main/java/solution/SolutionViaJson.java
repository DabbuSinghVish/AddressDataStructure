package solution;

import com.google.gson.JsonArray;
import com.google.gson.JsonElement;
import com.google.gson.JsonObject;
import com.google.gson.JsonParser;

import java.io.FileReader;

public class SolutionViaJson {
    public static void main(String[] args) {
        // Path to the JSON file
        String jsonFilePath = "src\\test\\resources\\CountryData.json"; // Replace with the correct path to your JSON file

        try {
            // Parse JSON file into a JsonObject
            JsonObject root = JsonParser.parseReader(new FileReader(jsonFilePath)).getAsJsonObject();

            // Access the "countries" array
            JsonArray countriesArray = root.getAsJsonArray("countries");

            // Iterate through the countries
            for (JsonElement countryElement : countriesArray) {
                JsonObject countryObject = countryElement.getAsJsonObject();
                String countryName = countryObject.get("name").getAsString();
                System.out.println("Country: " + countryName);

                // Access the "states" array
                JsonArray statesArray = countryObject.getAsJsonArray("states");

                for (JsonElement stateElement : statesArray) {
                    JsonObject stateObject = stateElement.getAsJsonObject();
                    String stateName = stateObject.get("name").getAsString();
                    System.out.println("  State: " + stateName);

                    // Access the "cities" array
                    JsonArray citiesArray = stateObject.getAsJsonArray("cities");

                    for (JsonElement cityElement : citiesArray) {
                        String cityName = cityElement.getAsString();
                        System.out.println("    City: " + cityName);
                    }
                }
            }

        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
