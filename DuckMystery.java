import java.io.*;
import java.util.*;

/**
 * The Case of the Missing Rubber Duck
 *
 * Keep the four evidence files in the same project folder as this program,
 * and do not change them. Every clue method must use a for-each loop to
 * traverse a map. When you are done, fill in the culprit below!
 * 
 * The Culprit: ????
 */
public class DuckMystery {
	
    public static void main(String[] args) throws FileNotFoundException {
    	// Create a map for the data stored in shoeSizes.txt
        
        // Create a map for the data stored in arrivals.txt
        
        // Create a map for the data stored in locations.txt
        
        // Create a map for the data stored in clubYears.txt

        // Optional: Print out the size for each of your maps. It should be: 10 10 10 9


//        System.out.println("Clue 1: " + findShoeSize(/* your shoe size map */, 9));
//        System.out.println("Clue 2: " + arrivedAfterAverage(/* your arrivals map */));
//        System.out.println("Clue 3: " + inMostCrowdedRoom(/* your locations map */));
//        System.out.println("Clue 4: " + knowsCabinetCode(/* your club years map */, 2));
    }

    // Clue 1: Return every suspect whose shoe size equals size.
    public static Set<String> findShoeSize(Map<String, Integer> shoeSizes, int size) {
        Set<String> matches = new HashSet<>();
        
        // TODO: Implement this method
        
        return matches;
    }

    // Clue 2: Return every suspect who arrived later than the average arrival time.
    // Compute the average as a double.
    public static Set<String> arrivedAfterAverage(Map<String, Integer> arrivals) {
        Set<String> matches = new HashSet<>();
        
        // TODO: Implement this method
        
        return matches;
    }

    // Clue 3: Return every suspect who was in the most crowded room at 7:15 PM.
    // Hint: How could we store all the rooms and how many people are in each one?
    public static Set<String> inMostCrowdedRoom(Map<String, String> locations) {
    	Set<String> matches = new HashSet<>();
    	
    	// TODO: Implement this method
        
        return matches;
    }

    // Clue 4: Return every club member with at least minYears years in the club.
    public static Set<String> knowsCabinetCode(Map<String, Integer> clubYears, int minYears) {
        Set<String> matches = new HashSet<>();
        
        // TODO: Implement this method
        
        return matches;
    }
}