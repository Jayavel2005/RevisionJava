import java.io.BufferedReader;
import java.io.FileReader;
import java.io.File;
import java.io.IOException;
import java.util.HashMap;

public class StringHandling7 {
    public static void main(String[] args) {
        // Create a map to store word counts
        HashMap<String, Integer> map = new HashMap<>();
        
        // Specify the file path
        File file = new File("jayavel.txt");

        try (BufferedReader reader = new BufferedReader(new FileReader(file))) {
            String readLine;

            // Read the file line by line
            while ((readLine = reader.readLine()) != null) {
                // Split the line into words using a regular expression to match non-word characters
                String[] words = readLine.split("\\W+");

                // Process each word
                for (String word : words) {
                    if (!word.isEmpty()) {
                        // Convert word to lowercase for case-insensitive comparison
                        // word = word.toLowerCase();

                        // Update the word count in the map
                        if (map.containsKey(word)) {
                            map.put(word, map.get(word) + 1);
                        } else {
                            map.put(word, 1);
                        }
                    }
                }
            }

            // Print the word counts
            map.forEach((key, value) -> System.out.println(key + ": " + value));

        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
