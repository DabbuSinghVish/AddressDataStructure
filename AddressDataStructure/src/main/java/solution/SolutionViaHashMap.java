package solution;

import java.util.*;

public class SolutionViaHashMap {
    public static void main(String[] args) {
        // Create a HashMap to store the data
        Map<String, Map<String, List<String>>> countryStateCityMap = new HashMap<>();

        // Adding data to the HashMap

        // United States
        Map<String, List<String>> usStates = new HashMap<>();
        usStates.put("California", Arrays.asList("Los Angeles", "San Francisco", "San Diego"));
        usStates.put("Texas", Arrays.asList("Houston", "Dallas", "Austin"));
        countryStateCityMap.put("United States", usStates);

        // India
        Map<String, List<String>> indiaStates = new HashMap<>();
        indiaStates.put("Maharashtra", Arrays.asList("Mumbai", "Pune", "Nagpur"));
        indiaStates.put("Karnataka", Arrays.asList("Bangalore", "Mysore", "Hubli"));
        countryStateCityMap.put("India", indiaStates);

        // Canada
        Map<String, List<String>> canadaStates = new HashMap<>();
        canadaStates.put("Ontario", Arrays.asList("Toronto", "Ottawa", "Hamilton"));
        canadaStates.put("Quebec", Arrays.asList("Montreal", "Quebec City", "Gatineau"));
        countryStateCityMap.put("Canada", canadaStates);

        // Printing the data
        for (Map.Entry<String, Map<String, List<String>>> countryEntry : countryStateCityMap.entrySet()) {
            String country = countryEntry.getKey();
            System.out.println("Country: " + country);

            Map<String, List<String>> states = countryEntry.getValue();
            for (Map.Entry<String, List<String>> stateEntry : states.entrySet()) {
                String state = stateEntry.getKey();
                List<String> cities = stateEntry.getValue();

                System.out.println("  State: " + state);
                for (String city : cities) {
                    System.out.println("    City: " + city);
                }
            }
        }
    }
}


