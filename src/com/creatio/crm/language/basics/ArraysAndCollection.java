package com.creatio.crm.language.basics;
import java.util.*;

public class ArraysAndCollection {
    public static void main(String[] args) {
        // 1. Create a list of the top 5 most populated countries in the world and print 2nd Country
        List<String> populatedCountries = Arrays.asList("China", "India", "United States", "Indonesia", "Pakistan");
        System.out.println("2nd Most Populated Country: " + populatedCountries.get(1));

        // 2. Create a set of the top 10 most visited tourist attractions in the world and print out its size
        Set<String> touristAttractions = new HashSet<>(Arrays.asList(
            "Eiffel Tower", "Great Wall of China", "Machu Picchu", "Statue of Liberty", "Colosseum", 
            "Disneyland", "Taj Mahal", "Grand Canyon", "Niagara Falls", "Times Square"
        ));
        System.out.println("Number of tourist attractions: " + touristAttractions.size());

        // 3. Create a map of the 5 largest cities in the United States and their populations
        Map<String, Integer> largestCities = new HashMap<>();
        largestCities.put("New York City", 8419600);
        largestCities.put("Los Angeles", 3980400);
        largestCities.put("Chicago", 2716000);
        largestCities.put("Houston", 2328000);
        largestCities.put("Phoenix", 1690000);

        System.out.println("Largest cities in the US and their populations:");
        for (Map.Entry<String, Integer> entry : largestCities.entrySet()) {
            System.out.println(entry.getKey() + " - " + entry.getValue());
        }

        // 4. Create an array of 10 random integers and print out the sum of 3rd and 5th value
        int[] randomIntegers = new Random().ints(10, 1, 101).toArray(); // Random integers between 1 and 100
        System.out.println("Random Integers Array: " + Arrays.toString(randomIntegers));
        int sum = randomIntegers[2] + randomIntegers[4]; // 3rd and 5th values (index 2 and 4)
        System.out.println("Sum of 3rd and 5th value: " + sum);

        // 5. Create a list of the top 5 highest-grossing movies of all time and print out the third movie
        List<String> highestGrossingMovies = Arrays.asList(
            "Avatar", "Avengers: Endgame", "Titanic", "Star Wars: The Force Awakens", "Avengers: Infinity War"
        );
        System.out.println("3rd Highest-Grossing Movie: " + highestGrossingMovies.get(2));
    }
}
