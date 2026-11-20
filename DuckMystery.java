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
        Map<String,Integer> shoeSizes = new HashMap<>();
        // Create a map for the data stored in arrivals.txt
        Map<String,Integer> arrivals = new HashMap<>();
        // Create a map for the data stored in locations.txt
        Map<String,String> locations = new HashMap<>();
        // Create a map for the data stored in clubYears.txt
        Map<String,Integer> clubYears = new HashMap<>();
        // Optional: Print out the size for each of your maps. It should be: 10 10 10 9
        
        Map<String, String> map = new HashMap<>();
        Scanner scanner = new Scanner(new File("locations.txt"));
        while (scanner.hasNextLine()) {
            String line = scanner.nextLine().trim();
            if (line.isEmpty()) continue;

            String[] parts = line.split("\\s+", 2);
            if (parts.length == 2) {
                map.put(parts[0], parts[1]);
            }
        }
        
        shoeSizes = parseMap("shoeSizes.txt");
        arrivals = parseMap("arrivals.txt");
        clubYears = parseMap("clubYears.txt");

        System.out.println("Clue 1: " + findShoeSize(shoeSizes, 9));
        System.out.println("Clue 2: " + arrivedAfterAverage(arrivals));
        System.out.println("Clue 3: " + inMostCrowdedRoom(locations));
        System.out.println("Clue 4: " + knowsCabinetCode(clubYears, 2));
    }

    // Clue 1: Return every suspect whose shoe size equals size.
    public static Set<String> findShoeSize(Map<String, Integer> shoeSizes, int size) {
        Set<String> matches = new HashSet<>();
        
        for(String key : shoeSizes.keySet())
        {
            
            if(shoeSizes.get(key) == size) matches.add(key);
            
        }
        
        return matches;
    }

    // Clue 2: Return every suspect who arrived later than the average arrival time.
    // Compute the average as a double.
    public static Set<String> arrivedAfterAverage(Map<String, Integer> arrivals) {
        Set<String> matches = new HashSet<>();
        
        int total = 0;
        for(int i : arrivals.values()) total += i;
        total /= arrivals.size();
        
        for(String key : arrivals.keySet())
        {
            
            if(arrivals.get(key) >= total) matches.add(key);
            
        }
        
        return matches;
    }

    // Clue 3: Return every suspect who was in the most crowded room at 7:15 PM.
    // Hint: How could we store all the rooms and how many people are in each one?
    public static Set<String> inMostCrowdedRoom(Map<String, String> locations) {
    	Set<String> matches = new HashSet<>();
    	Map<String, Integer> roomCounts = new HashMap<>();
    	String mostCrowded = "";
    	int max = 0;
    	
    	for(String room : locations.values()) roomCounts.put(room, roomCounts.getOrDefault(room, 0) + 1);
        for(String room : roomCounts.keySet()) if(roomCounts.get(room) > max) mostCrowded = room;
        for(String person : locations.keySet()) 
        {
            if(locations.get(person).equals(mostCrowded))
            {
                matches.add(person);
            }
        }
        
        return matches;
    }

    // Clue 4: Return every club member with at least minYears years in the club.
    public static Set<String> knowsCabinetCode(Map<String, Integer> clubYears, int minYears) {
        Set<String> matches = new HashSet<>();
        
        // TODO: Implement this method
        
        return matches;
    }
    
    public static Map<String, Integer> parseMap(String path)
    {
        
        Scanner scanner = new Scanner(new File("locations.txt"));
        Map<String, String> map = new HashMap<>();
        while (scanner.hasNextLine()) {
            String line = scanner.nextLine().trim();
            if (line.isEmpty()) continue;

            String[] parts = line.split("\\s+", 2);
            if (parts.length == 2) {
                map.put(parts[0], Integer.valueOf(parts[1]));
            }
        }
        
        return map;
        
    }
}
