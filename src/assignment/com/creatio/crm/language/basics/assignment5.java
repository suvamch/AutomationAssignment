package assignment.com.creatio.crm.language.basics;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.List;
import java.util.Map;
import java.util.Random;
import java.util.Set;

public class assignment5 {
    public static void main(String[] args) {
        // Task 1: List of the top 5 most populated countries in the world
        List<String> topCountries = new ArrayList<>();
        topCountries.add("China");
        topCountries.add("India");
        topCountries.add("United States");
        topCountries.add("Indonesia");
        topCountries.add("Pakistan");

        // Print the 2nd country
        System.out.println("2nd Country: " + topCountries.get(1));

        // Task 2: Set of the top 10 most visited tourist attractions in the world
        Set<String> touristAttractions = new HashSet<>();
        touristAttractions.add("Eiffel Tower");
        touristAttractions.add("Great Wall of China");
        touristAttractions.add("Pyramids of Giza");
        touristAttractions.add("Statue of Liberty");
        touristAttractions.add("Taj Mahal");
        touristAttractions.add("Colosseum");
        touristAttractions.add("Machu Picchu");
        touristAttractions.add("Christ the Redeemer");
        touristAttractions.add("Sydney Opera House");
        touristAttractions.add("Big Ben");

        // Print the size of the set
        System.out.println("Size of Tourist Attractions Set: " + touristAttractions.size());

        // Task 3: Map of the 5 largest cities in the United States and their populations
        Map<String, Integer> largestCities = new HashMap<>();
        largestCities.put("New York", 8419600);
        largestCities.put("Los Angeles", 3980400);
        largestCities.put("Chicago", 2716000);
        largestCities.put("Houston", 2328000);
        largestCities.put("Phoenix", 1690000);

        // Print the map of largest cities with populations
        System.out.println("Largest Cities in the US with Populations:");
        for (Map.Entry<String, Integer> entry : largestCities.entrySet()) {
            System.out.println(entry.getKey() + ": " + entry.getValue());
        }

        // Task 4: Array of 10 random integers and sum of 3rd and 5th values
        int[] randomIntegers = new int[10];
        Random random = new Random();
        for (int i = 0; i < randomIntegers.length; i++) {
            randomIntegers[i] = random.nextInt(100);  // Random integer between 0 and 99
        }

        // Print the sum of the 3rd and 5th values (index 2 and 4)
        int sum = randomIntegers[2] + randomIntegers[4];
        System.out.println("Sum of 3rd and 5th values: " + sum);

        // Task 5: List of the top 5 highest-grossing movies of all time
        List<String> topMovies = new ArrayList<>();
        topMovies.add("Avatar");
        topMovies.add("Avengers: Endgame");
        topMovies.add("Titanic");
        topMovies.add("Star Wars: The Force Awakens");
        topMovies.add("Avengers: Infinity War");

        // Print the third movie on the list
        System.out.println("3rd Highest-Grossing Movie: " + topMovies.get(2));
    }
}
