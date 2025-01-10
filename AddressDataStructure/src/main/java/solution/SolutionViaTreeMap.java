package solution;

import java.util.*;

public class SolutionViaTreeMap {
    public static void main(String[] args) {
        // TreeMap to store country, state, and city hierarchy
        TreeMap<String, TreeMap<String, List<String>>> data = new TreeMap<>();

        // Adding data
        data.put("United States", new TreeMap<>());
        data.get("United States").put("California", Arrays.asList("Los Angeles", "San Francisco", "San Diego"));
        data.get("United States").put("Texas", Arrays.asList("Houston", "Dallas", "Austin"));

        data.put("India", new TreeMap<>());
        data.get("India").put("Maharashtra", Arrays.asList("Mumbai", "Pune", "Nagpur"));
        data.get("India").put("Karnataka", Arrays.asList("Bangalore", "Mysore", "Hubli"));

        // Traversing the TreeMap
        for (Map.Entry<String, TreeMap<String, List<String>>> countryEntry : data.entrySet()) {
            String country = countryEntry.getKey();
            TreeMap<String, List<String>> states = countryEntry.getValue();

            System.out.println("Country: " + country);
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
