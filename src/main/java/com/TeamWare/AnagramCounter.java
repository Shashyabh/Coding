package com.TeamWare;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.*;

public class AnagramCounter {
    public static void main(String[] args) {
        // Provide the file path
        String filePath = "src/main/abc.txt"; // Example Windows absolute path

        try {
            // Read the file
            BufferedReader reader = new BufferedReader(new FileReader(filePath));
            String line;

            // Map to store sorted strings and their occurrences
            Map<String, Integer> anagramMap = new HashMap<>();

            // Read each line of the file
            while ((line = reader.readLine()) != null) {
                // Split the line by colon
                String[] parts = line.split(":");

                // Iterate through the split parts
                for (String part : parts) {
                    // Remove leading/trailing whitespace
                    String str = part.trim();

                    // Sort the characters of the string
                    char[] chars = str.toCharArray();
                    Arrays.sort(chars);
                    String sortedStr = new String(chars);

                    // Update the map with sorted string and its count
                    anagramMap.put(sortedStr, anagramMap.getOrDefault(sortedStr, 0) + 1);
                }
            }

            // Close the reader
            reader.close();

            // Count the total occurrences of anagrams
            int totalAnagrams = 0;
            for (int count : anagramMap.values()) {
                if (count > 1) {
                    totalAnagrams += count;
                }
            }

            // Print the total occurrences of anagrams
            System.out.println("Total occurrences of anagrams: " + totalAnagrams);

        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}

